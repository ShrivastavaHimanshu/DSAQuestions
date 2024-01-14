package com.himanshu.advanced;

import java.util.HashMap;
import java.util.Map;

/*
Given two arrays of integers A and B of size N each, where each pair (A[i], B[i]) for 0 <= i < N 
represents a unique point (x, y) in 2D Cartesian plane.

Find and return the number of unordered triplets (i, j, k) such that (A[i], B[i]), (A[j], B[j]) and 
(A[k], B[k]) form a right-angled triangle with the triangle having one side parallel to the x-axis 
and one side parallel to the y-axis.

NOTE: The answer may be large so return the answer modulo (109 + 7).*/


public class NumberOfRightTriangles {

	public static void main(String[] args) {
		int [] A = {1, 1, 2, 3, 3};
		int [] B = { 1, 2, 1, 2, 1} ;
		int ans = solve (A, B);
		System.out.println(" count is : " + ans);

	}

	private static int solve(int[] a, int[] b) {
		int n = a.length;
		Map <Integer, Integer> mapX = new HashMap<>();
		for(int i = 0 ; i < n ; i++) {
			if(mapX.containsKey(a[i])) {
				int value = mapX.get(a[i]);
				mapX.put(a[i], value+1);
			}else {
				mapX.put(a[i], 1);
			}
		}
		
		Map <Integer, Integer> mapY = new HashMap<>();
		for(int i = 0 ; i < n ; i++) {
			if(mapY.containsKey(b[i])) {
				int value = mapY.get(b[i]);
				mapY.put(b[i], value+1);
			}else {
				mapY.put(b[i], 1);
			}
		}
		
		int ans = 0;
		long mod = 10000007;
		for(int i = 0 ; i < n ; i++) {
			int x = mapX.get(a[i]);
			int y = mapY.get(b[i]);
			ans = (int) ((ans  % mod + (x-1) % mod *(y-1) % mod) % mod);
		}
		
		return ans;
	}

}
