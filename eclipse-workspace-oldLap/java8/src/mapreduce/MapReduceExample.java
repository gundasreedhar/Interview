package mapreduce;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class MapReduceExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 5, 16);

        List<String> words = Arrays.asList("corejava", "spring", "hibernate");
        //words.stream().forEach(null);
        
        int sum = 0;
        for (int i : numbers)
        {
        	sum+=i;
        }
        System.out.println("tradituinal sum: "+sum);  // this is sequential
        
        
        // Here all are sequential stream
        System.out.println("------------------------------------------------");
        System.out.println("Sum : " + numbers.stream().reduce(0,(a,b)-> a+b ));
        System.out.println("sum : " + numbers.stream().reduce(Integer::sum).get());
        System.out.println("sum : " + numbers.stream().mapToDouble(i->i).sum());
        System.out.println("------------------------------------------------");
        
        System.out.println("Avarage : " + numbers.stream().mapToDouble(i->i).average().getAsDouble());
        System.out.println("------------------------------------------------");
        
        System.out.println("min : " + numbers.stream().mapToDouble(i->i).min().getAsDouble());
        System.out.println("min : " + numbers.stream().min((a,b)->a.compareTo(b)).get());  // FIRST sorts and gets the first value
        //here min() returns the first element from the sorted list 
        System.out.println("------------------------------------------------");
        
        System.out.println("max : " + numbers.stream().mapToInt(i->i).max().getAsInt());
        System.out.println("max : " + numbers.stream().max((a,b)->a.compareTo(b)).get());  // FIRST sorts and gets the last value
        //here max() returns the last element from the sorted list
        System.out.println("------------------------------------------------");

        // write sorting
        // need to write the sortings
        /*
        compare(obj1,obj2)  -> -ve	obj1 before obj2
        compare(obj1,obj2)  -> +ve	obj1 after obj2
        */
        String lowLength = words.stream().min( (a,b)-> a.length()-b.length()).get(); 
        System.out.println("The lowest length word : " + lowLength);
        
        String highLength = words.stream().max((a,b)-> a.length()<b.length()?-1 : 1).get();
        System.out.println("The highest length word : " + highLength);
        
        List<String> sortedWords = words.stream().sorted((i1,i2) -> i1.length()<i2.length()?-1:1  ).collect(Collectors.toList());
        
        System.out.println("sortedWords based one length: " + sortedWords);
        
        System.out.println("------------------------------------------------");
        
        
        
        
        
        
        
        
        
        
        
        Integer reduceSum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduceSum);

        Optional<Integer> reduceSumWithMethodReference = numbers.stream().reduce(Integer::sum);
        System.out.println(reduceSumWithMethodReference.get());

        Integer mulResult = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(mulResult);

        Integer maxvalue = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(maxvalue);

        Integer maxvalueWithMethodReference = numbers.stream().reduce(Integer::max).get();
        System.out.println(maxvalueWithMethodReference);
        
        

        String longestString = words.stream()
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
        System.out.println(longestString);

        
        
        //get employee whose grade is A
        //get salary
        double avgSalary = EmployeeDatabase.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .average().getAsDouble();
        System.out.println("avarage salary : "+avgSalary);

        
        double sumSalary = EmployeeDatabase.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .sum();
        System.out.println("sum of salary : "+sumSalary);
        
        
        double min = EmployeeDatabase.getEmployees().stream()
        		.filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
        		.map(employee -> employee.getSalary())
				.min((a,b)->a.compareTo(b))
				.get();
        System.out.println("minimum sal of grade a employees is :" + min);
        
        
        
    }


}
