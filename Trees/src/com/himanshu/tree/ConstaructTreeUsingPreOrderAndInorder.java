package com.himanshu.tree;

public class ConstaructTreeUsingPreOrderAndInorder {

	public static void main(String[] args) {
		int [] preOrder = {1, 2, 3};
		int [] inOrder = {2, 1, 3};
		TreeNode root = buildTree(preOrder , inOrder);
		System.out.println(" root is :" + root.val);

	}

	private static TreeNode buildTree(int[] preOrder, int[] inOrder) {
		if (preOrder == null || inOrder == null || preOrder.length != inOrder.length) {
				return null;
		} 
		int n = inOrder.length;
		
		return constructTree(inOrder , 0 , n-1 , preOrder , 0 , n-1);
	}

	private static TreeNode constructTree(int[] inOrder, int ins, int ine, int[] preOrder, int ps, int pse) {
		if (ps > pse || ins > ine) {
			return null;
		}
		int rootNode = preOrder[ps];
		TreeNode root = new TreeNode(rootNode);
		int index = 0 ;
		for (int i = 0 ; i < inOrder.length ; i++) {
			if (inOrder[i]==rootNode) {
				index = i;
				break;
			}
		}
		int length_LST = index - ins ;
		root.left = constructTree(inOrder, 0, index-1, preOrder, ps+1, length_LST-ps);
		root.right = constructTree(inOrder, index +1 , ine, preOrder, ps+length_LST+1, pse);
		return root;
	}

}
