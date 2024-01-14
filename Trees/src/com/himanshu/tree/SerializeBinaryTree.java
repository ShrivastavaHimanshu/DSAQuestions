package com.himanshu.tree;

import java.util.*;


public class SerializeBinaryTree {

	public static void main(String[] args) {
		TreeNode left = new TreeNode(3);
		TreeNode right = new TreeNode(2);
		TreeNode n = new TreeNode(1);
		right.left=left;
		n.right=right;
		ArrayList<Integer> ans = serializeBinaryTree(n);
		for(int i = 0 ; i < ans.size(); i++) {
			System.out.print(ans.get(i)+ " ");
		}

	}

	private static ArrayList<Integer> serializeBinaryTree(TreeNode n) {
		Queue<TreeNode> q = new LinkedList<>();
		ArrayList<Integer> ans = new ArrayList<>();
		if(n == null) {
			return ans;
		}
		q.add(n);
		ans.add(n.val);
		while(q.size()>0) {
			TreeNode root = q.remove();
			TreeNode left = root.left;
			TreeNode right = root.right;
			if(left == null) {
				ans.add(-1);
			}else {
				q.add(left);
				ans.add(left.val);
			}
			if(right == null) {
				ans.add(-1);
			}else {
				q.add(right);
				ans.add(right.val);
			}
		}
		return ans;
	}

}
