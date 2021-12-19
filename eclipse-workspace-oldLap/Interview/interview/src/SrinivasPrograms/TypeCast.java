class Vegetables {
	void wash() {
		System.out.println("washing parent");
	}
}

public class TypeCast extends Vegetables {
	void bonda() {
		System.out.println("bonda child ");
	}

	public static void main(String[] args) {
		Vegetables type = new TypeCast();// this up casting
		TypeCast r = (TypeCast) new Vegetables();// this will throw error at run time
		// first upcast then downcast
		TypeCast c = (TypeCast) type;
		c.wash();
		c.bonda();
	}
}

class Marker {
	void colour() {
		System.out.println("colour parent");
	}
}

class Pen extends Marker {
	void write() {

	}

	public static void main(String[] args) {
		Marker m = new Pen();
		m.colour();
		// m.write cannot access this method
	}
}
// public static void main(String[] args) {
// try {
// List<String> inputByLine = new ArrayList<String>();
// InputStreamReader isr = new InputStreamReader(System.in);
// BufferedReader br = new BufferedReader(isr);
// String line = "";
// while ((line = br.readLine()) != null) {
// if (!line.equals("")) {
// for (int j = 0; j < Integer.parseInt(line); j++) {
// inputByLine.add(String.valueOf(Integer.parseInt(line)));
// }
// }
// }
// for (String line2 : inputByLine) {
// if (Integer.parseInt(line2) % 35 == 0) {
// System.out.println("stress test" + ", ");
// }
// }
// } catch (IOException e) {
// e.printStackTrace();
// }
// }