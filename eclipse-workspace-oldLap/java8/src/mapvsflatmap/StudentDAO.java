package mapvsflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentDAO {
	static List<Student> getStudents()
	{
		return Stream.of(
				new Student("shreedhar",Arrays.asList("9738486300","9035514831")),
				new Student("brunda",Arrays.asList("6363636363","9083636251"))
				).collect(Collectors.toList());
				
				
	}
}
