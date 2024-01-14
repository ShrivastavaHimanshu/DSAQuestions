package com.himanshu.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Given a binary search tree A, where each node contains a positive integer, and an integer B, 
you have to find whether or not there exist two different nodes X and Y such that X.value + Y.value = B.
Return 1 to denote that two such nodes exist. Return 0, otherwise.

*/
public class TwoSumBST {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		int b = 19;
		int ans = t2Sum(root , b);
		System.out.println(" ans is :" + ans);

	}

	// 1 : Get the Inorder Traversal and store it in array list as it will be ascending Order for BST
	// 2 : Now simply find two number whose sum is equals to B using two pointer
	private static int t2Sum(TreeNode root, int b) {
		
		Stack<TreeNode>stack = new Stack();
		if (root == null) {
			return 0;
		}
		ArrayList<Integer> inOrder = getInOrder(root);
		int n = inOrder.size();
		int start = 0 ;
		int end = n - 1;
		while(start < end) {
			int sum = inOrder.get(start)+inOrder.get(end);
			if (sum == b) {
				return 1;
			}
			if ( sum < b) {
				start++;
			}
			if (sum > b) {
				end--;
			}
		}
		return 0;
	}

	private static ArrayList<Integer> getInOrder(TreeNode root) {
		TreeNode current, node;
	    ArrayList<Integer> res = new ArrayList<>();
	    current = root;
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
