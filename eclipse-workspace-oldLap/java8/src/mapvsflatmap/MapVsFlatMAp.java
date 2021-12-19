package mapvsflatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMAp {
	public static void main(String[] args)
	{
		
		List<Student> students = StudentDAO.getStudents();
		List<String> studentNames = students.stream()
				.map(i->i.getName())
				.collect(Collectors.toList());
		System.out.println("using map() : "+studentNames);
		
		List<List<String>> studentPhones = students.stream()
				.map(i->i.getPhoneNumber())
				.collect(Collectors.toList());
		System.out.println("used map() for list<list<>> : "+studentPhones);

		
		List<String> studentPhonesFlatMap = students.stream()
				.flatMap(i->i.getPhoneNumber().stream())
				.collect(Collectors.toList());
		System.out.println("used flatMap() for List<List<>>: "+studentPhonesFlatMap);
		
	}
}
