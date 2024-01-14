package com.himanshu.tree;

import java.util.*;

public class DesiralizeBinaryTree {

	public static void main(String[] args) {
		int arr [] = {1, 2, 3, 4, 5, -1, -1, -1, -1, -1, -1};
		TreeNode node = solve(arr);
		//printTree(node);
		System.out.println(" ans is :" + node.val);

	}

//	private static void printTree(TreeNode node) {
//		
//		while(node != null) {
//			System.out.print(node.val);
//			if(node.left != null) {
//				System.out.print(node.left.val);
//			}
//			if(node.right != null) {
//				System.out.print(node.right.val);
//			}
//			
//		}
//		
//	}

	private static TreeNode solve(int[] arr) {
	
		if (arr[0] == -1) {
			return null;
		}
		Queue<TreeNode> q = new LinkedList();
		TreeNode root = new TreeNode(arr[0]);
		q.add(root);
		int i = 1;
		while(q.size() > 0) {
			TreeNode cur = q.remove();
			if(cur == null) 
				continue;
			int leftValue = arr[i];
			int rightValue = arr[i+1];
			if(leftValue != -1) {
				cur.left = new TreeNode(leftValue);
			}
			else {
				cur.left = null;
			}
			if(rightValue != -1) {
				cur.right = new TreeNode(rightValue);
			}
			else {
				cur.right = null;
			}
			i = i+2 ; // as we covered both left and right so increaed by 2
			q.add(cur.left);
			q.add(cur.right);
		}
		
		return root;
	}

}
