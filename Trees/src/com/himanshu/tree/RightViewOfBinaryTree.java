package com.himanshu.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*Given a binary tree of integers denoted by root A. Return an array of integers representing 
 * the right view of the Binary tree.
Right view of a Binary Tree is a set of nodes visible when the tree is visited from Right side.
*/
public class RightViewOfBinaryTree {

	public static void main(String[] args) {
		
		TreeNode left = new TreeNode(3);
		TreeNode right = new TreeNode(2);
		TreeNode n = new TreeNode(1);
		ArrayList<Integer> ans = getrightView(n);
		for(int i : ans) {
			System.out.print(i + " ");
		}

	}

	// 1: Simply do the level order traversal 
	// Return the last element or before the null 
	private static ArrayList<Integer> getrightView(TreeNode n) {
		
		Queue<TreeNode> q = new LinkedList<>();
		ArrayList<Integer> ans = new ArrayList();
		if( n == null) {
			return ans;
		}
		q.add(n);
		
		while(q.size() > 0) {
			int currentSize = q.size();
			ArrayList<Integer> level = new ArrayList<>();
			for(int i = 0 ; i < currentSize; i++) {
				if(q.peek().left != null) {
					q.add(q.peek().left);
				}	
				if(q.peek().right != null) {
					q.add(q.peek().right);
				}
				level.add(q.remove().val);
			}
			ans.add(level.get(level.size()-1));
		}
		return ans;
	}

}
