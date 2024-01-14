package com.himanshu.tree;

import java.util.ArrayList;
import java.util.Stack;

// This is actually Inorder 
public class InorderTraversalWithoutRecusrion {

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
	private static ArrayList<Integer> inorderTraversal(TreeNode A) {
		 	TreeNode current, node;
		    ArrayList<Integer> res = new ArrayList<>();
		    current = A;
		    while (current != null) {
		        if (current.left == null) {
		            res.add(current.val);
		            current = current.right;
		        } else {
		            node = current.left;
		            while (node.right != null && !current.equals(node.right))
		                node = node.right;
		            
		            if (node.right == null) {
		                node.right = current;
		                current = current.left;
		            } else {
		                current = node.right;
		                node.right = null;
		                res.add(current.val);
		                current = current.right;
		            }
		        }
		    }
		    return res;
	}

}
