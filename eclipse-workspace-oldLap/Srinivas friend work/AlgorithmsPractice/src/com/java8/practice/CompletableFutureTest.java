package com.java8.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest {

	public static void main(String[] args) {

		List<Shop> shops = new ArrayList<>();
		shops.add(new Shop1());
		shops.add(new Shop1());
		shops.add(new Shop1());
		shops.add(new Shop2());
		shops.add(new Shop2());

		List<Integer> prices = shops.stream().map(shop -> shop.getPrice("product")).collect(Collectors.toList());
		System.out.println("prices are " + prices);

		prices = shops.parallelStream().map(shop -> shop.getPrice("car")).collect(Collectors.toList());

		List<CompletableFuture<Integer>> completableFutures = shops.stream()
				.map(shop -> CompletableFuture.supplyAsync(() -> shop.getPrice("abc"))).collect(Collectors.toList());

		List<Integer> datas = completableFutures.stream().map(CompletableFuture::join).collect(Collectors.toList());

	}

}

interface Shop {

	int getPrice(String product);
}

class Shop1 implements Shop {

	@Override
	public int getPrice(String product) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return 45;
	}

}

class Shop2 implements Shop {

	@Override
	public int getPrice(String product) {

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return 90;
	}

}
