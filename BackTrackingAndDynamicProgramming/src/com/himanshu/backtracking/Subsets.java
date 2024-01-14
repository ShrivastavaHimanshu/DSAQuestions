package com.himanshu.backtracking;

import java.util.*;

public class Subsets {
	static ArrayList<ArrayList<Integer>> ans; 
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		ArrayList<ArrayList<Integer>> res = subsets(list);
		System.out.println("res size " + res.size());
		for(int i = 0 ; i < res.size() ; i++) {
			ArrayList<Integer> subList = res.get(i);
			
			for(int j = 0 ; j < subList.size() ; j++) {
				System.out.print(subList.get(j) + " ");
			}
			System.out.println();
			
		}

	}

	
	private static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> arr) {
		Collections.sort(arr);
		ans =  new ArrayList<ArrayList<Integer>>();
		ans.add(new ArrayList<Integer>());
		ArrayList<Integer> list = new ArrayList<Integer>();
		printSubset(arr, arr.size() , 0 , list);
		return ans;
	}

	private static void printSubset(ArrayList<Integer> arr, int n, int i, ArrayList<Integer> curr) {
		
		if(i == n) {
			return;
		}
		
		// If we want to pick that index
		curr.add(arr.get(i));
		ans.add(new ArrayList<Integer>(curr));
		printSubset(arr, n, i+1, curr);
		
		// IF we don't want to pik that index
		
		
		curr.remove(curr.size()-1);
		printSubset(arr, n, i+1, curr);
		
		
		
	}

}
