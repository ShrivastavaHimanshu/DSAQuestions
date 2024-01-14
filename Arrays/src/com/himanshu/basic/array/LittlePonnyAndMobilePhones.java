package com.himanshu.basic.array;

public class LittlePonnyAndMobilePhones {

	public static void main(String[] args) {
		int[] a = {3, 4, 4, 6 }; // Mobile Prices
		// index 0 1 2 3
		// prefixSum 3 7 11 17
		int[] b = { 20, 4, 10, 2}; // Total money
		int[] ans = solve(a, b);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	public static int[] solve(int[] a, int[] b) {
		int n = a.length;
		int[] ans = new int[b.length];
		int[] prefixSum = prefixSum(a, n);
		for(int i = 0 ; i < b.length; i++) {
			int target = b[i];
			int start = 0 , end = n-1 ,count=0;
			while(start<=end) {
				int mid = start+(end-start)/2;
				if((mid > 0) && prefixSum[mid] - prefixSum[mid-1]==target) {
					count = mid;
					break;
				}if (prefixSum[mid]<= target) {
					start = mid +1; 
				}else {
					end = end-1;
				}
			}
		  ans [i] = count;	
		}
		return ans;

	}

	public static int[] prefixSum(int[] arr, int n) {
		int[] prefixSum = new int[n];
		prefixSum[0] = arr[0];
		for (int i = 1; i < n; i++) {
			prefixSum[i] = prefixSum[i - 1] + arr[i];
		}
		return prefixSum;
	}

}
