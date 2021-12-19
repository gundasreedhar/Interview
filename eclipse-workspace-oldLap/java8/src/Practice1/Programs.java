package Practice1;

class MathOpertaion {
	static public int findFact(int a) {
		if (a == 1)
			return 1;
		else
			return a * findFact(--a);
	}
}


