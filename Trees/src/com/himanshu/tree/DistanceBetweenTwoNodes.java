package com.himanshu.tree;

import java.util.ArrayList;

/*Given a binary search tree.
Return the distance between two nodes with given two keys B and C. It may be assumed that both keys exist in BST.

NOTE: Distance between two nodes is number of edges between them.*/
public class DistanceBetweenTwoNodes {

	public static void main(String[] args) {
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(8);
		TreeNode n = new TreeNode(5);
		n.left = left ;
		n.right = right;
		left.left = new TreeNode(1);
		left.right = new TreeNode(4);
		right.left = new TreeNode(6);
		right.right= new TreeNode(11);
		
		int b = 32;
		int c = 9;
		//System.out.println(n.val+"," + n.right.val+"," + n.right.left.val);
		int  ans = solve(n, b , c);
		System.out.println(" ans is :" + ans);


	}
// Approach for this 
	/*
	 * As we have to find minimum path for two nodes
	 	We need to find lowest common anchestor and then distance from both the nodes
	 * 
	 * 
	 * */
	
	private static int solve(TreeNode A , int B, int C) {
		if(B > C) {
			int temp = C;
			C = B;
			B = temp;
		}
		TreeNode lca = lowestCommonAncestor(A,B,C);
        int h1 = height(lca,B);  
        int h2 = height(lca,C);

        return h1+h2;
    }
    public static int height(TreeNode node,int key){

        if(node == null || node.val == key)
            return 0;
       
        if(node.val > key)
            return 1+height(node.left,key);
        else
            return 1+height(node.right,key);
    }
    public static TreeNode lowestCommonAncestor(TreeNode A,int B,int C){

        if(A == null)
            return null;

        if(A.val > B && A.val > C)
            return lowestCommonAncestor(A.left,B,C);
        else if(A.val < B && A.val < C)
            return lowestCommonAncestor(A.right,B,C);
        else    
            return A;
    }
}
