package com.himanshu.gfg.practice;

import java.util.Arrays;

/*Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. 
 * Find the missing element.*/


public class MissinNnumberInArray {

	public static void main(String[] args) {
		int N = 5;
		int	arr [] = {1,2,3,5};
		int ans = MissingNumber(arr, N);
		System.out.println(" ans is :" + ans);

	}

	private static int MissingNumber(int[] arr, int n) {
		
		int ans = n;
		for(int i = 0 ; i < arr.length ; i++) {
			int element = Math.abs(arr[i]);
			int index = element - 1;
			if(index < arr.length && arr[index] > 0)
			arr[index] = -1 * arr[index];
			
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			if (arr[i] > 0) {
				ans = i+1;
			}
		}
		return ans;
	}

}
