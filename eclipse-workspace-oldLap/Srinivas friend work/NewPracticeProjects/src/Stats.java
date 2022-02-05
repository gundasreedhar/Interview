
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Stats {
	static class CountAggregator {
		private int count;
		private double price;

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

	}

	public static class StatisticsAggregatorImpl implements StatisticsAggregator {
		Object synCObject = new Object();
		Map<String, CountAggregator> map = null;

		@Override
		public void putNewPrice(String symbol, double price) {
			synchronized (synCObject) {
				if (map.get(symbol) == null) {
					map = new ConcurrentHashMap<>();
					CountAggregator countAggregator = new CountAggregator();
					countAggregator.setCount(1);
					countAggregator.setPrice(price);
					map.put(symbol, countAggregator);

				}

				else {
					CountAggregator existingCountAggregator = map.get(symbol);
					double existingPrice = existingCountAggregator.getPrice();
					double newPrice = existingPrice + price;
					existingCountAggregator.setCount(existingCountAggregator.getCount() + 1);
					map.put(symbol, existingCountAggregator);

				}
			}

		}

		@Override
		public double getAveragePrice(String symbol) {
			CountAggregator countAggregator = map.get(symbol);
			int count = countAggregator.getCount();
			double price = countAggregator.getPrice();
			double result = price / count;
			return result;
		}

		@Override
		public int getTickCount(String symbol) {
			CountAggregator countAggregator = map.get(symbol);
			return countAggregator.getCount();
		}
	}

	////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

	public interface StatisticsAggregator {
		// This is an input. Make note of this price.
		public void putNewPrice(String symbol, double price);

		// Get the average price
		public double getAveragePrice(String symbol);

		// Get the total number of prices recorded
		public int getTickCount(String symbol);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			final StatisticsAggregator stats = new StatisticsAggregatorImpl();
			final Set<String> symbols = new TreeSet<>();

			String line = scanner.nextLine();
			String[] inputs = line.split(",");
			int threads = Integer.parseInt(inputs[0]);
			ExecutorService pool = Executors.newFixedThreadPool(threads);
			for (int i = 1; i < inputs.length; ++i) {
				String[] tokens = inputs[i].split(" ");
				final String symbol = tokens[0];
				symbols.add(symbol);
				final double price = Double.parseDouble(tokens[1]);
				pool.submit(new Runnable() {
					@Override
					public void run() {
						stats.putNewPrice(symbol, price);
					}
				});

			}
			pool.shutdown();
			try {
				pool.awaitTermination(5000, TimeUnit.MILLISECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			for (String symbol : symbols) {
				System.out.println(
						String.format("%s %.4f %d", symbol, stats.getAveragePrice(symbol), stats.getTickCount(symbol)));
			}
		}
		scanner.close();

	}
}
