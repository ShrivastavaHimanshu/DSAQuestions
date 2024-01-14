package com.himanshu.tree;

import java.util.*;

public class LeftViewOfTree {

	public static void main(String[] args) {
		TreeNode left = new TreeNode(3);
		TreeNode right = new TreeNode(2);
		TreeNode n = new TreeNode(1);
		ArrayList<Integer> ans = getLeftView(n);
		for(int i : ans) {
			System.out.print(i + " ");
		}
		

	}

	// Steps do level order travesral and simple return first element of every list
	private static ArrayList<Integer> getLeftView(TreeNode n) {
		ArrayList<Integer> ans = new ArrayList<>();
		Queue<TreeNode> q = new LinkedList<>();
		q.add(n);
		while(q.size() > 0) {
			int currentSize = q.size();
			ArrayList<Integer> level = new ArrayList<>();
			for(int i = 0 ; i < currentSize ; i++) {
				if(q.peek().left != null) {
					q.add(q.peek().left);
				}
				if(q.peek().right != null) {
					q.add(q.peek().right);
				}
			level.add(q.remove().val);	
			}
		ans.add(level.get(0));// as starting number would be left most and left view element 	
		}
		return ans;
	}

}
