package com.himanshu.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ConstructBinaryTree {

	public static void main(String[] args) {
		//ArrayList<Integer> A  = (ArrayList<Integer>) Arrays.asList(2, 1, 3);
		List<Integer> A = List.of(2, 1, 3);
		List<Integer> B = List.of(2, 3, 1 );
		TreeNode ans = buildTree(A, B);
		System.out.println(" ans is :" + ans.val);

	}

	
	private static TreeNode buildTree(List<Integer> a, List<Integer> b) {
		
		 if (a == null || b == null || a.size() != b.size()) {
	            return null;
	        }
		 int n = a.size()-1;
		 return constructTree(a, b, 0, n-1, n-1);
	    }


	private static TreeNode constructTree(List<Integer> a, List<Integer> b, int start , int end, int pos) {
		if (start > end) {
			return null;
		}
		TreeNode root = new TreeNode(b.get(pos));
		// Finding index in inorder for pos as it would be data
		
		int index = 0 ;
		
		for(int i = start ; i <=end ; i++) {
			 if (a.get(i)==b.get(pos)) {
				 index = i ;
				 break;
			 }
		}
		
		root.left = constructTree(a, b, start, index-1, pos - (end - index + 1));
		root.right = constructTree(a, b, index+1, end, pos - 1);
		return root;
	}

	 


}


//if (index < 0 || left > right) {
//    return null;
//}
//
//TreeNode root = new TreeNode(postorder.get(index));
//
//for (int i = left; i <= right; i++) {
//    if (Objects.equals(postorder.get(index), inorder.get(i))) {
//        index--;
//        root.right = buildTree(inorder, postorder, i + 1, right);
//        root.left = buildTree(inorder, postorder, left, i - 1);
//        break;
//    }
//}
//return root;


