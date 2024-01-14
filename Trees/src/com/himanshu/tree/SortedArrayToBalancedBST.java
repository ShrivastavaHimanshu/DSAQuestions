package com.himanshu.tree;

public class SortedArrayToBalancedBST {

	public static void main(String[] args) {
		int arr [] = {1,2};
		TreeNode a = getBST(arr);
		printTree(a);

	}

	private static void printTree(TreeNode a) {
		System.out.print(a.val);
		System.out.println();
		if(a.left != null) {
			System.out.print(a.left.val);
		}
		if(a.right != null) {
			System.out.print(a.right.val);
		}
		
	}

	private static TreeNode getBST(int[] arr) {
		int n = arr.length;
		if ( n <=2) {
			TreeNode root = new TreeNode(arr[0]);
			root.right = new TreeNode(arr[1]);
			return root;
			
		}
		int start = 0 ;
		int end = arr.length-1;
		TreeNode root = getTree(arr, start, end);
		return root;
	}

	private static TreeNode getTree(int[] arr, int start, int end) {
		if (start > end) {
			return null;
		}
		int mid = (start+end)/2;
		TreeNode root = new TreeNode(arr[mid]);
		root.left = getTree(arr, 0 , mid-1);
		root.right = getTree(arr, mid+1, end);
		return root;
	}

	

}
