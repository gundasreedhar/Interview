public class PalindromicPathsInMatrix {

	public static void main(String args[]) {

		char[][] mat = { { 'a', 'a', 'a', 'b' }, { 'b', 'a', 'a', 'a' }, { 'a', 'b', 'b', 'a' } };

		int R = 3;
		int C = 4;

		int noOfPaths = palindromicPathsFinderInMatrix(mat, 0, 0, 2, 3, R, C);

		System.out.print("Number of paths are : " + noOfPaths);
		
	  String test = "Mohit";
	  String test1 = "Sohit";
	  

	}

	private static int palindromicPathsFinderInMatrix(char[][] mat, int rs, int cs, int re, int ce, int R, int C) {

		if (rs < 0 || rs >= R || cs < 0 || cs >= C)
			return 0;

		if (ce < 0 || ce < cs || re < 0 || re < rs)
			return 0;

		if (mat[rs][cs] != mat[re][ce])
			return 0;

		if (Math.abs((rs - re) + (cs - ce)) <= 1) {
			return 1;
		}

		int ret = 0;

		ret = ret + palindromicPathsFinderInMatrix(mat, rs + 1, cs, re - 1, ce, R, C);
		ret = ret + palindromicPathsFinderInMatrix(mat, rs + 1, cs, re, ce - 1, R, C);
		ret = ret + palindromicPathsFinderInMatrix(mat, rs, cs + 1, re - 1, ce, R, C);
		ret = ret + palindromicPathsFinderInMatrix(mat, rs, cs + 1, re, ce - 1, R, C);

		return ret;

	}

}