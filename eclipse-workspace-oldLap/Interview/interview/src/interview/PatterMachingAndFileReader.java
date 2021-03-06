package interview;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMachingAndFileReader {
	public static void main(String... args) throws IOException
	{
		String str = "my name is shreedhar1434.";
		Pattern pattern = Pattern.compile("shree");
		System.out.println(pattern);
		
		Matcher matcher = pattern.matcher(str);

		System.out.println(matcher.find());
		System.out.println(matcher.group());
		System.out.println("start index : "+matcher.start() + " end index : " + matcher.end());
		
		matcher = Pattern.compile("\\s[a-zA-Z]{9}[0-9]{3}\\s").matcher(str);
		if(matcher.find())
		{
			System.out.println("start index : "+matcher.start() + " end index : " + matcher.end());
			String part = str.substring(matcher.start(),matcher.end());
			System.out.println("finally : " + part.trim());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Gunda Sreedhar\\Desktop\\check.txt"));
		
		List<String> linesInPage = new ArrayList<String>(); 
		String line = bf.readLine();
		while(line != null)
		{
			linesInPage.add(line.toUpperCase());
			line = bf.readLine();
		}
		

		System.out.println("----------------");
		linesInPage.stream().forEach(System.out::println);
		
		
		
		
		
		
		
		
	}

}
