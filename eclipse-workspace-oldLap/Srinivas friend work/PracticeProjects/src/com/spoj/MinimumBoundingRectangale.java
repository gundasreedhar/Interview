package com.spoj;

import java.util.Scanner;

public class MinimumBoundingRectangale {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int operations = sc.nextInt();

		while (operations > 0) {

			ObjectHolder minSObjectHolder = new ObjectHolder();
			minSObjectHolder.setX(Integer.MAX_VALUE);
			minSObjectHolder.setY(Integer.MAX_VALUE);

			ObjectHolder maxSObjectHolder = new ObjectHolder();
			maxSObjectHolder.setX(Integer.MIN_VALUE);
			maxSObjectHolder.setY(Integer.MIN_VALUE);

			int n = sc.nextInt();
			while (n > 0) {
				String s = sc.next();

				if (s.equals("p")) {
					int x = sc.nextInt();
					int y = sc.nextInt();

					boolean minCheck = minChecker(minSObjectHolder, x, y);
					if (minCheck) {
						minSObjectHolder.setX(x);
						minSObjectHolder.setY(y);
					}

					boolean maxCheck = maxChecker(maxSObjectHolder, x, y);
					if (maxCheck) {
						maxSObjectHolder.setX(x);
						maxSObjectHolder.setY(y);
					}

				}

				else if (s.equals("c")) {
					int x = sc.nextInt();
					int y = sc.nextInt();
					int r = sc.nextInt();
					int maxX = x + r;
					int maxY = y + r;
					int minX = x - r;
					int minY = y - r;

					boolean minCheck = minChecker(minSObjectHolder, minX, minY);
					if (minCheck) {
						minSObjectHolder.setX(minX);
						minSObjectHolder.setY(minY);
					}

					boolean maxCheck = maxChecker(maxSObjectHolder, maxX, maxY);
					if (maxCheck) {
						maxSObjectHolder.setX(maxX);
						maxSObjectHolder.setY(maxY);

					}
				}

				else if (s.equals("l")) {
					int x1 = sc.nextInt();
					int y1 = sc.nextInt();
					int x2 = sc.nextInt();
					int y2 = sc.nextInt();
					int minX = 0;
					int minY = 0;
					int maxX = 0;
					int maxY = 0;

					if (x1 < x2) {
						minX = x1;
						maxX=x2;
					} else {
						minX = x2;
						maxX = x1;
					}

					if (y1 < y2) {
						minY = y1;
						maxY = y2;
					} else {
						minY = y2;
						maxY = y1;
					}
					
					
					boolean minCheck = minChecker(minSObjectHolder, minX, minY);
					if (minCheck) {
						minSObjectHolder.setX(x1);
						minSObjectHolder.setY(y1);
					}

				

					boolean maxCheck = maxChecker(maxSObjectHolder, maxX, maxY);
					if (maxCheck) {
						maxSObjectHolder.setX(x2);
						maxSObjectHolder.setY(y2);
					}

				
				}

				n--;
			}
			
			if (minSObjectHolder.getX() <= -1000) {
				minSObjectHolder.setX(-1000);
			}
			if (minSObjectHolder.getY() <= -1000) {
				minSObjectHolder.setY(-1000);
			}

			if (maxSObjectHolder.getX() >= 1000) {
				maxSObjectHolder.setX(1000);
			}

			if (maxSObjectHolder.getY() >= 1000) {
				maxSObjectHolder.setY(1000);
			}

			System.out.print(minSObjectHolder.getX() + " " + minSObjectHolder.getY() + " " + maxSObjectHolder.getX()
					+ " " + maxSObjectHolder.getY());
				System.out.println();
			operations--;
		}

	}

	private static boolean maxChecker(ObjectHolder maxSObjectHolder, int x, int y) {

		return ((maxSObjectHolder.getX() < x && maxSObjectHolder.getY() < y)
				|| (maxSObjectHolder.getX() < x || maxSObjectHolder.getY() < y));
	}

	private static boolean minChecker(ObjectHolder minSObjectHolder, int x, int y) {
		return ((minSObjectHolder.getX() > x && minSObjectHolder.getY() > y)
				|| (minSObjectHolder.getX() > x || minSObjectHolder.getY() > y));

	}
}

class ObjectHolder {
	int x;
	int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}