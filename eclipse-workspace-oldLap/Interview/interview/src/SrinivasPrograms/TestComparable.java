
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Bookss implements Comparable<Bookss> {
	String pages;

	Bookss(String p) {
		pages = p;
	}

	@Override
	public int compareTo(Bookss o) {
		return pages.compareTo(o.pages);
		// return pages - o.pages;
	}

	@Override
	public String toString() {
		return "Bookss [pages=" + pages + "]";
	}
}

public class TestComparable {
	public static void main(String[] args) {
		Bookss b1 = new Bookss("x");
		Bookss b2 = new Bookss("v");
		Bookss b3 = new Bookss("a");
		List<Bookss> list = new ArrayList<>();
		list.add(b2);
		list.add(b1);
		list.add(b3);
		System.out.println(list + " before sort");
		Collections.sort(list);
		System.out.println(list + " After Sort");
	}
}