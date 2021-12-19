

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPatterns {
	public static void main(String[] args) {
		String str = "qwwe.85.wdef.852.wefr.42";
		// [A-Za-z]+\\.\\d+
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(str);
		int sum = 0;
		while (matcher.find()) {
			String st = matcher.group();
			sum += Integer.parseInt(st);
		}
		System.out.println(sum);
	}
}
