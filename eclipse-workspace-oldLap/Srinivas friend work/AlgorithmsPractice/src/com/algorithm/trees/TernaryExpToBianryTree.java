package com.algorithm.trees;

public class TernaryExpToBianryTree {

	public static void main(String[] args) {
		String exp = "a?b?c:d:e";

		TreeNodeString root = convertExpToTree(exp);

		printInOrder(root);
	}

	private static void printInOrder(TreeNodeString root) {
		if (root == null)
			return;
		printInOrder(root.left);
		System.out.println(root.data);
		printInOrder(root.right);

	}

	private static TreeNodeString convertExpToTree(String exp) {

		int n = exp.length();
		char[] charArr = exp.toCharArray();
		TreeNodeString root = new TreeNodeString(charArr[0]+"");

		if (exp.length() > 1) {
			root.left = convertExpToTree(exp.substring(2, n - 2));
			root.right = convertExpToTree(exp.substring(n - 1));
		}

		return root;
	}

}

class TreeNodeString{

	TreeNodeString left;
	TreeNodeString right;
	String data;

	TreeNodeString(String data) {
		this.data = data;
	}

}
