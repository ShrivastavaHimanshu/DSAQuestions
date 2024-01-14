package com.himanshu.tree;

import java.util.ArrayList;
import java.util.Stack;

public class BSTNodesInRange {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		int b = 9;
		int c = 15;
		int ans = solve(root , b, c);
		System.out.println(" ans is :" + ans);

	}

	private static int solve(TreeNode root, int b, int c) {
		// As it's BST , its InOrder Traversal would be in sorted form 
		ArrayList<Integer> inOrder = getInorder(root);
		int count = 0;
		for(int i = 0 ; i < inOrder.size() ; i++) {
			int num = inOrder.get(i);
			if (num >= b && num <= c) {
				count++;
			}
		}
		return count;
	}

	private static ArrayList<Integer> getInorder(TreeNode root) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack();
		TreeNode curr = root;
		while(curr != null || !stack.isEmpty()) {
			while(curr != null) {
				stack.push(curr);
				curr = curr.left;
			}
			curr = stack.pop();
			ans.add(curr.val);
			curr = curr.right;
		}
		return ans;
	}

}
