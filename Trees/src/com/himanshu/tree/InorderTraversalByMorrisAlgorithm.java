package com.himanshu.tree;

import java.util.ArrayList;

public class InorderTraversalByMorrisAlgorithm {

	public static void main(String[] args) {
		TreeNode left = new TreeNode(3);
		TreeNode right = new TreeNode(2);
		TreeNode n = new TreeNode(1);
		right.left=left;
		n.right=right;
		//System.out.println(n.val+"," + n.right.val+"," + n.right.left.val);
		ArrayList<Integer> ans = inorderTraversal(n);
		for(int i : ans) {
			System.out.print( i + " ");
		}


	}

	private static ArrayList<Integer> inorderTraversal(TreeNode n) {
		ArrayList<Integer> res = new ArrayList<>();
		// find inorder predecessor and inorder successor 
		// inorder predecessor - rightmost node of LST (leftSubTree);
		// inorder successor - leftmost node of RST (RightSubTree)
		
		TreeNode curr = n ;
		int ans = Math.abs(3-5);
		while (curr != null) {
			if (curr.left == null) {
				// means there is no left sub tree
				res.add(curr.val);
				curr = curr.right;
			}
			else {
				
				TreeNode pred = getPredecessor(curr);
				if (pred.right == null) {
					// means there is no connection between predecessor and root
					pred.right = curr;
					curr = curr.left;
				}
				else {
					// we have to break the connection
					pred.right = null;
					res.add(curr.val);
					curr = curr.right;
				}
				
			}
		}
		
		return res;
	}

	private static TreeNode getPredecessor(TreeNode node) {
		if ( node.left == null) {
			return null;
		}
		TreeNode x = node.left;
		while(x.right != null && x.right != node ) {
			x = x.right;
		}
		return x;	
	}

}
