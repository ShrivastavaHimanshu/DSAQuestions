package com.himanshu.advanced.twopoirnters.arrays;

import java.util.HashMap;
import java.util.Map;

public class Pairswithgivensumtwo {

	public static void main(String[] args) {
		int arr [] = { 1, 1, 1 };
		int b = 2;
		int ans = solve(arr, b);
		System.out.println(" ans is :" + ans);

	}

	private static int solve(int[] arr, int b) {
		int n = arr.length;
		int ans = 0;
		int l = 0 , r = n-1;
		int mod = 1000*1000*1000+7;
		while(l < r) {
			int sum = arr[l]+arr[r];
			if (sum <  b) {
				l++;
			}else if (sum > b) {
				r--;
			}else {
				if (arr[l]==arr[r]) {
					int x = r-l+1; // mens there is no more element in array as its sorted 
					int count = (x*(x-1)/2);
					ans += count; // Choosing 2 elemenst among all the pairs it would nC2
					break;
				}else {
					// Here we have to get the count of all the elements from both the sides 
					
					int x = arr[l], y = arr[r];
					int countL = 0, countR = 0;
					// Get all the duplicates for left element
					while(l<n && arr[l]==x) {
						countL++;
						l++;
					}
					
					// Get all the duplicates for right element
					while(r >= 0 && arr[r]==y) {
						countR++;
						r--;
					}
					ans = (ans %mod + ((countL % mod )* (countR % mod))) % mod; 
				}
			}
		}
		return ans;
	}

}
