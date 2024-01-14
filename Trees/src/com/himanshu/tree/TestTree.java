package com.himanshu.tree;

import java.util.ArrayList;

public class TestTree {

	public static void main(String[] args) {
		TreeNode left = new TreeNode(3);
		TreeNode right = new TreeNode(2);
		TreeNode n = new TreeNode(1);
		right.left=left;
		n.right=right;
		//System.out.println(n.val+"," + n.right.val+"," + n.right.left.val);
		int ans [] = inorderTraversal(n);
		for(int i = 0 ; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
		
		
		
	}

	
	
    public static int [] inorderTraversal(TreeNode A) {
    	int numOfNodes = getNodes(A);
    	int [] inOrder = new int [numOfNodes];
    	return inOrder(A, inOrder);
	 }


    static int i = 0;
	private static int[] inOrder(TreeNode a, int[] inOrder) {
		if (a==null) return inOrder;
		inOrder(a.left, inOrder);
		inOrder[i++] = a.val;
		inOrder(a.right, inOrder);
		return inOrder;
	}



	private static int getNodes(TreeNode a) {
		if (a==null) return 0;
		int leftNodes = getNodes(a.left);
		int rightNodes = getNodes(a.right); 
		return 1 + leftNodes+ rightNodes;
	}

  
    
}
