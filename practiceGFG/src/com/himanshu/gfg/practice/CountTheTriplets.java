package com.himanshu.gfg.practice;

import java.util.Arrays;

public class CountTheTriplets {

	public static void main(String[] args) {
		int arr [] = {1, 5, 3, 2};
		int ans = countTriplet(arr);
		System.out.println("ans is :" + ans);

	}

	private static int countTriplet(int[] arr) {
		// first we will sort the array , so we need to find only pair whose sum is equals to other element 
		// in array
		
		Arrays.sort(arr);
		int n = arr.length;
		int count = 0 ;
		for(int i = n -1 ; i >=2 ; i--) {
			// we are checking till 2nd index only as for triplets atleast 3 element we need 
			int start = 0 ;
			int end = i-1;
			while( start < end ) {
				if (arr[start] + arr[end] == arr[i]) {
					count++;
					start++;
					end--;
				}
				else if (arr[start] + arr[end] < arr[i]) {
					start++;
				}else {
					end--;
				}
			}
		}
		return count;
	}

}
