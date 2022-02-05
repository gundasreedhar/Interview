import java.util.ArrayList;
import java.util.List;

public class TestRetain {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("v");
		list.add("b");
		list.add("c");
		
		List<String> newList = new ArrayList<>();
		newList.add("a");
		newList.add("n");
		newList.add("m");
		
		 list.retainAll(newList);
		
		 if(list.isEmpty()){
			 System.out.println("target not correct ");
		 }
	}

}
