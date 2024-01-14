package com.himanshu;

import java.util.*;

public class MaximumFrequencyStack {

	public static void main(String[] args) {
		int [][] a= {
	            {1, 5},
	            {1, 7},
	            {1, 5},
	            {1, 7},
	            {1, 4},
	            {1, 5},
	            {2, 0},
	            {2, 0},
	            {2, 0},
	            {2, 0}  };
		int [] ans = solve(a);
		for(int i = 0 ; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	private static int[] solve(int[][] a) {
		Map<Integer, Integer> countMap = new HashMap<>();
		Map<Integer, Stack<Integer>> stackMap = new HashMap<>();
		int rows = a.length;
		int cols = a[0].length;
		int maxfreq = 0;
		int ans [] = new int [rows];
		
		for(int i = 0 ; i < rows ; i++) {
			
				int operationType = a[i][0];
				int data = a[i][1];
				if(operationType == 1) {
					// perform push operation
					Stack<Integer> stack = new Stack();
					countMap.put(data, countMap.getOrDefault(data, 0)+1);
					
					int freq = countMap.get(data);
					
					if(freq > maxfreq) {
						maxfreq=freq;
					}
					
					stack = stackMap.get(maxfreq);
					if(stack==null) {
						stack = new Stack();
						stack.push(data);
					}
					else {
						stack.push(data);
					}
					stackMap.put(freq, stack);
					ans[i]=-1;
					
				}else {
					//perform pop operation
					Stack<Integer> stack = stackMap.get(maxfreq);
					int val = stack.pop();
					countMap.put(val, countMap.get(val)-1);
					if(stack.isEmpty()) {
						maxfreq--;
					}
					ans[i]=val;
				}
				
	
			
		}
		
		return ans;
	}

}
