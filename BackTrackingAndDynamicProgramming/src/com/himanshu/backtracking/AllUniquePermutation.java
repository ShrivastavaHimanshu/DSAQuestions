package com.himanshu.backtracking;

import java.util.ArrayList;

public class AllUniquePermutation {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(3);
		ArrayList<ArrayList<Integer>> res = permutation(list);
		System.out.println("res size " + res.size());
		for(int i = 0 ; i < res.size() ; i++) {
			ArrayList<Integer> subList = res.get(i);
			
			for(int j = 0 ; j < subList.size() ; j++) {
				System.out.print(subList.get(j) + " ");
			}
			System.out.println();
			
		}
		}
	private static ArrayList<ArrayList<Integer>> permutation(ArrayList<Integer> arr) {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>(); 
	
		if(arr.size() == 0) {
			return ans;
		}
		permutation(arr,  0 , ans);
		return ans;
		
	}
	private static void permutation(ArrayList<Integer> arr, int start, ArrayList<ArrayList<Integer>> ans) {
		
		if (start == arr.size()) {
			if(!ans.contains(arr))
			ans.add(new ArrayList<Integer>(arr));
			return ;
		}
		
		for(int j = start ; j < arr.size() ; j++) {
			// swap value at ith index  with jth index to generate all possible values
			swap(j, start, arr);
			permutation(arr, start+1 , ans);
			// as we are sending arr everytime , will revert back the swap
			swap(j, start, arr);	
			
		}
		
	}
	private static void swap(Integer source, Integer destination, ArrayList<Integer> arr) {
		int temp = arr.get(source);
		arr.set(source, arr.get(destination));
		arr.set(destination, temp);
		
	}

}
