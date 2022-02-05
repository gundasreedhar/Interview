package com.threads;

public class TestGS {

	public static void main(String[] args) {
		Node node = new Node(1, 1);
		int level = 1;

		makeTree(level, node);

		 printLevelOrder(node,3);

	}

	static void printLevelOrder(Node root, int height) {
		int h = height;
		int i;
		int index =1;
		
		for (i = 1; i <= h; i++) {
			printGivenLevel(root, i,index);
 
		//	index = index+ i;
			
		}
	}

	static void printGivenLevel(Node root, int level,int index) {
		if (root == null)
			return;
		if (level == 1)
		{	System.out.println(root.s);
		    
		    root.index = index;
		}
		
		   
		else if (level > 1) {
			printGivenLevel(root.left, level - 1,index);
			printGivenLevel(root.right, level - 1, index+1);
		}
	}

	/*
	 * public static void levelOrderTraversal(Node startNode) { Queue<Node>
	 * queue=new LinkedList<>(); queue.add(startNode); while(!queue.isEmpty()) {
	 * Node tempNode=queue.poll(); System.out.println(tempNode.s);
	 * if(tempNode.left!=null) queue.add(tempNode.left);
	 * if(tempNode.right!=null) queue.add(tempNode.right); } }
	 * 
	 */
	private static void makeTree(int level, Node node) {

		if (level >= 3) {
			return;
		}

		int p = node.p;
		int q = node.q;

		node.left = new Node(p, p + q);
		makeTree(level + 1, node.left);

		node.right = new Node(p + q, q);
		makeTree(level + 1, node.right);

	}
}

class Node {

	Node left;
	Node right;
	int index;
	int p;
	int q;
	String s;

	public Node(int p, int q) {
		this.p = p;
		this.q = q;
		s = p + "" + "/" + "" + q;
	}
}
