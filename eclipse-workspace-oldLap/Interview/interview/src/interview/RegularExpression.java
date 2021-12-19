package interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {

		String str = "my usn is 3BR15EC146 3BR15EC132";
		//Pattern pattern = Pattern.compile("[\\s][0-9]{1}[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{3}");
		Pattern pattern = Pattern.compile("3BR*");
		Matcher matcher = pattern.matcher(str);
		
		while (matcher.find())
		{
			System.out.println("pattern found from  " + 
								matcher.start() + " to " + (matcher.end()-1));
			
			System.out.println("extracting the matching data");
			
			System.out.println(str.substring(matcher.start(),matcher.end()));
			
		}
		System.out.println("-----splits==-----");
		String strr = "my9name3is6shreedhar";
		String[] words = strr.split("[\\d]");
		for(String word : words)
		{
			System.out.println(word);
		}
	}

}
