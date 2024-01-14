package com.himanshu.tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class PostOrderTraversalWithoutRecursion {

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
	// SOLUTION 2 - STACK
	// NOTE: In this case, we don't know which node is completed its traversal on left and right both.
	// Hence we need to do the opposite process of postorder and then reverse it to get the actual answer
	// i.e. traverse NODE > RIGHT > LEFT then reverse it which gives LEFT > RIGHT > NODE
	private static ArrayList<Integer> inorderTraversal(TreeNode n) {
		ArrayList<Integer> res = new ArrayList<>();
		if( n == null) {
			return res;
		}
		
		Stack<TreeNode> stack = new Stack();
		
		TreeNode curr = n;
		
		while(curr != null || !stack.isEmpty()) {
			while(curr != null) {
				stack.push(curr);
				res.add(curr.val);
				curr = curr.right;
			}
			
			curr = stack.pop();
			curr = curr.left;
		}
		
		Collections.reverse(res);
		return res;
	}

}
