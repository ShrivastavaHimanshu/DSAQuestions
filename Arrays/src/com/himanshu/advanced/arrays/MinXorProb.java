package com.himanshu.advanced.arrays;

import java.util.Arrays;

public class MinXorProb {

	public static void main(String[] args) {
		int a [] = {0, 4, 7, 9};
		int ans = findMinXor(a);
		System.out.println("ans is :" + ans);

	}

	private static int findMinXor(int[] a) {
		Arrays.sort(a);
	    int min = Integer.MAX_VALUE;
	    int xor = 0;
	    int n = a.length;
	    for(int i = 0 ; i < n-1 ; i++) {
	    	xor = a[i]^a[i+1];
	    	min=Math.min(xor, min);
	    }
		return min;
	}

}
