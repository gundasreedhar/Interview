package interview;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class SortBasedOnValue {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("java", "20");
		map.put("C++", "45");
		map.put("Java2Novice", "2");
		map.put("Unix", "67");
		map.put("MAC", "26");
		map.put("Why this kolavari", "93");
		Set<Entry<String, String>> entry = map.entrySet();
		List<Entry<String, String>> list = new ArrayList<Entry<String, String>>(entry);
		//Collections.sort(list, new SortOnValue());
//		Collections.sort(list, new Comparator<Entry<String, String>>() {
//			public int compare(Entry<String, String> o1, Entry<String, String> o2) {
//				return o1.getValue().compareTo(o2.getValue());
//			}
//		});
		Collections.sort(list,(o1,o2)->o1.getValue().compareTo(o2.getValue()));
		for (Map.Entry<String, String> print : list) {
			System.out.println(print.getKey() + " ==== " + print.getValue());
		}
	}
}

class SortOnValue implements Comparator<Entry<String, String>> {

	@Override
	public int compare(Entry<String, String> o1, Entry<String, String> o2) {
		return o1.getValue().compareTo(o2.getValue());
	}
}
