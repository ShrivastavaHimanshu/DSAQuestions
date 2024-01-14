package com.himanshu.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class OddAndEvenLevel {

	public static void main(String[] args) {
		TreeNode left = new TreeNode(3);
		TreeNode right = new TreeNode(2);
		TreeNode n = new TreeNode(1);
		right.left = left;
		n.right = right;
		int ans = getDifferenceOddandEvenLevel(n);
		System.out.println(" ans is :" + ans);
		}



	private static int getDifferenceOddandEvenLevel(TreeNode n) {
		int ans = 0;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(n);
		int j = 1;
		int oddSum = 0, evenSum = 0;
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

				if (j % 2 == 1)
					oddSum+=q.remove().val;
				else {
					evenSum+=q.remove().val;
				}
			}
			j++;
		}
		ans = oddSum-evenSum;
		return ans;
	}

}
