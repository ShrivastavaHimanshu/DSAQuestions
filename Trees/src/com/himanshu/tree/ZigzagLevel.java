package com.himanshu.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ZigzagLevel {

	public static void main(String[] args) {
		TreeNode left = new TreeNode(3);
		TreeNode right = new TreeNode(2);
		TreeNode n = new TreeNode(1);
		right.left = left;
		n.right = right;
		ArrayList<ArrayList<Integer>> ans = zigZagOrder(n);
		for (int i = 0; i < ans.size(); i++) {
			ArrayList<Integer> list = ans.get(i);
			for (int k : list) {
				System.out.print(k + " ");
			}
			
			System.out.println();
		}

	}

	// Simply do lil changes in level Order Traversal
	private static ArrayList<ArrayList<Integer>> zigZagOrder(TreeNode n) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		Queue<TreeNode> q = new LinkedList<>();
		q.add(n);
		int j = 0;
		while (q.size() > 0) {
			int currSize = q.size();
			ArrayList<Integer> level = new ArrayList<>();
			for (int i = 0; i < currSize; i++) {
				if (q.peek().left != null) {
					q.add(q.peek().left);
				}
				if (q.peek().right != null) {
					q.add(q.peek().right);
				}

				if (j % 2 == 0)
					level.add(q.remove().val);
				else
					level.add(0, q.remove().val);
			}
			res.add(level);
			j++;
		}

		return res;

	}

}
