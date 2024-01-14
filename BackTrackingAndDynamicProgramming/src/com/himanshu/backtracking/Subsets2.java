package com.himanshu.backtracking;

import java.util.ArrayList;
import java.util.Collections;

public class Subsets2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(2);
		ArrayList<ArrayList<Integer>> res = subsetsWithDup(list);
		System.out.println("res size " + res.size());
		for(int i = 0 ; i < res.size() ; i++) {
			ArrayList<Integer> subList = res.get(i);
			
			for(int j = 0 ; j < subList.size() ; j++) {
				System.out.print(subList.get(j) + " ");
			}
			System.out.println();
			
		}

	}

	static ArrayList<ArrayList<Integer>> ans ;
	private static ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> list) {
		if(list == null) {
			return ans;
		}
		
		Collections.sort(list);
		ans =  new ArrayList<ArrayList<Integer>>();
		ans.add(new ArrayList<Integer>());
		ArrayList<Integer> temp = new ArrayList<>();
		printSubset(list, list.size(), 0 , temp);
		
		return ans;
	}
	
	private static void printSubset(ArrayList<Integer> list, int size, int i, ArrayList<Integer> temp) {
		if(i == size) {
			return ;
			
		}
		
		// When we pick the element
		temp.add(list.get(i));
		if(!ans.contains(temp))
		ans.add(new ArrayList<>(temp));
		printSubset(list, size, i+1, temp);
		
		// When we don't pick the element
		temp.remove(temp.size()-1);
		printSubset(list, size, i+1, temp);
		
		
	}

	

}
