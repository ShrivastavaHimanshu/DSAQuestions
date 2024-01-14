/**
 * 
 */
package com.himanshu.backtracking;

import java.util.*;

/**
 * @author Hshri
 *
 */
public class CombinationSum {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(2, 1, 3);
		int B = 3;
		ArrayList<ArrayList<Integer>> res = combinationSum(A, B);
		for(int i = 0 ; i < res.size(); i++) {
			for(int j = 0 ; j < res.get(i).size(); j++) {
				System.out.print(res.get(i).get(j) + " ");
			}
			System.out.println();
		}

	}
	static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
	private static ArrayList<ArrayList<Integer>> combinationSum(List<Integer> a, int b) {
		ans = new ArrayList<>();
		Collections.sort(a);
		ArrayList<Integer> list = new ArrayList<>();
		generateSum(a, b, 0, 0, list);
		return ans;
	}
	private static void generateSum(List<Integer> a, int b, int i, int sum, ArrayList<Integer> list) {
		if(i == a.size()) {
			if(sum == b && !ans.contains(list))
			ans.add(new ArrayList<Integer>(list));
			return;
		}
		
		// including the number
		sum = sum + a.get(i);
		list.add(a.get(i));
		generateSum(a, b, i+1, sum, list);
		
		// undo or excluding the number
		
		sum = sum - a.get(i);
		list.remove(list.size()-1);
		generateSum(a, b, i+1, sum, list);
	}
	

}
