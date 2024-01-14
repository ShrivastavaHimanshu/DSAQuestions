package com.himanshu.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		TreeNode left = new TreeNode(3);
		TreeNode right = new TreeNode(2);
		TreeNode n = new TreeNode(1);
		right.left=left;
		n.right=right;
		ArrayList<ArrayList<Integer>> ans = levelOrder(n);
		for(int i = 0 ; i < ans.size(); i++) {
			ArrayList<Integer> list = ans.get(i);
			for(int k : list) {
				System.out.print(k+ " ");
			}
			System.out.println();
		}

	}

	private static ArrayList<ArrayList<Integer>> levelOrder(TreeNode n) {
		Queue<TreeNode> q = new LinkedList<>();
		ArrayList<ArrayList<Integer>> ans = new ArrayList();
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
			ans.add(level);
		}
		return ans;
		

	}

}
