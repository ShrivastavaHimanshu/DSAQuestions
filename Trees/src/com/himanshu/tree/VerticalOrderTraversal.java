package com.himanshu.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class Pair{
	int value ;
	TreeNode node ;
	
	Pair(TreeNode node ,int value){
		this.node = node;
		this.value = value;
		
		
	}
}

/*
 * 1. Need to create custom pair object to store the Treenode and the level 
 * 2.HashMap is used to store the nodes that are in the same vertical level, where
 * key is the level and the value is a list of node values which are in the same
 * level 
 * 3. A queue is used to store the nodes at the same horizontal level. 
 * 4.After hashMap is formed, we need to just iterate through the map and add
 *  values to a ArrayList<ArrayList<Integer>> and return
 */
public class VerticalOrderTraversal {

	public static void main(String[] args) {
		TreeNode left = new TreeNode(3);
		TreeNode right = new TreeNode(2);
		TreeNode n = new TreeNode(1);
		right.left=left;
		n.right=right;
		ArrayList<ArrayList<Integer>> ans = VerticalOrderTraversal(n);
		for(int i = 0 ; i < ans.size(); i++) {
			ArrayList<Integer> list = ans.get(i);
			for(int k : list) {
				System.out.print(k+ " ");
			}
			System.out.println();
		}


	}

	private static ArrayList<ArrayList<Integer>> VerticalOrderTraversal(TreeNode n) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		if (n == null) {
			return res;
		}
		Map<Integer , ArrayList<Integer>> hm = new HashMap<>();
		Queue<Pair> qu = new LinkedList<>();
		qu.add(new Pair(n , 0));
		int minL = Integer.MAX_VALUE; // 
		int maxL = Integer.MIN_VALUE; // 
		
		while(qu.size() > 0) {
			Pair p = qu.remove();
			TreeNode node = p.node;
			int level = p.value;
			minL = Math.min(minL, p.value);
			maxL = Math.max(maxL, p.value);
			  if(hm.containsKey(level)){
	                ArrayList<Integer> lt2=hm.get(level);
	                lt2.add(node.val);
	                hm.put(level,lt2);
	            }
	            else{
	                ArrayList<Integer> lt1=new ArrayList<Integer>();
	                lt1.add(node.val);
	                hm.put(level, lt1);
	            }
			
			// Add left node in the queue
			if(node.left !=  null) {
				Pair newPair = new Pair(node.left, p.value-1);
				qu.add(newPair);
			}
			// Add right node in the queue
			if ( node.right != null) {
				Pair newPair = new Pair(node.right, p.value+1);
				qu.add(newPair);
			}
		}
		for(int i = minL ; i <= maxL ; i++) {
			res.add(hm.get(i));
		}
		return res;
	}

}
