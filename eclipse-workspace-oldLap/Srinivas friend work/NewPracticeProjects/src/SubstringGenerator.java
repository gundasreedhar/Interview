import java.util.List;

public class SubstringGenerator {

	public static void main(String[] args) {
		String testString = "SRINIVAS";
		List<String> subStrings = generateSubstrings(testString);
	}

	private static List<String> generateSubstrings(String testString) {
		
		String mat[][] = new String[testString.length()][testString.length()];
		
		for(int i=0;i<testString.length();i++){
			for(int j=0;j<testString.length();j++){
				
				if(i==j){
					mat[i][j] = testString.charAt(i)+"";
				}
				
				
			}
		}
		return null;
	}

}
