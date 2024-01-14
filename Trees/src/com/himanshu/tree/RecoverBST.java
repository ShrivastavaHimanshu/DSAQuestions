package com.himanshu.tree;

import java.util.ArrayList;
import java.util.Stack;

class IntPair {
	int first;
	int second;

	IntPair(int x, int y) {
		this.first = x;
		this.second = y;
	}
}

public class RecoverBST {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);

		ArrayList<Integer> ans = solve(root);
		for (int i : ans) {
			System.out.print(i + " ");
		}

	}

	private static ArrayList<Integer> solve(TreeNode root) {
		ArrayList<Integer> ans = new ArrayList<>();
		// get the inorder frst as it should be in ascending order for BST
		ArrayList<Integer> inOrder = new ArrayList<>();

		Stack<TreeNode> stack = new Stack();
		TreeNode curr = root;
		while (curr != null || !stack.isEmpty()) {
			while (curr != null) {
				stack.push(curr);
				curr = curr.left;
			}
			curr = stack.pop();
			inOrder.add(curr.val);
			curr = curr.right;
		}
		ArrayList<IntPair> listPair = new ArrayList();
		for (int i = 0; i < inOrder.size() - 2; i++) {
			System.out.println(" frst is :" + inOrder.get(i) + " scnd is : " + inOrder.get(i + 1));
			if (inOrder.get(i) > inOrder.get(i + 1)) {
				listPair.add(new IntPair(inOrder.get(i), inOrder.get(i + 1)));
			}
		}
		System.out.println(" listPair size :" + listPair.size());
		if (listPair.size() == 1) {
			// means only 1 pair is there so that two element would be the answer
			// simply means both present ath left right child of any root
			IntPair p = listPair.get(0);
			ans.add(p.first);
			ans.add(p.second);
		}

		else {
			// 2 pair found
			IntPair first = listPair.get(0);
			IntPair second = listPair.get(1);

			ans.add(first.first);
			ans.add(second.second);
		}

		return ans;
	}

	

}
