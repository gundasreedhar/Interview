package FilesPractice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentDAO {
	public static List<Student> getAllStdeuntRecords()
	{
		return Stream.of(
					new Student("shredhar","A",20000),
					new Student("srikanth","B",30000),
					new Student("brunda","A",10000),
					new Student("sravani","B",5124),
					new Student("mahesh","A",70000)
				).collect(Collectors.toList());
	}
}
