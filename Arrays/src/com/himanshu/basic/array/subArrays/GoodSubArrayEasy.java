package com.himanshu.basic.array.subArrays;

public class GoodSubArrayEasy {

	public static void main(String[] args) {
		int [] a = {1, 2, 3, 4, 5};
		int b = 4;
		int ans = solve(a , b);
		System.out.println("ans is :" + ans);

	}

	public static int solve(int[] arr, int b) {
		int count = 0;
		for (int i = 0 ; i < arr.length ; i++) {
			for (int j = i ; j < arr.length ; j++) {
				int sum = 0;
				if (j % 2 !=0) {
						if (arr[j] < b) {
							count ++;
						}
						sum += arr[j];
						if (sum < b) {count++;}
						
					}else {
						if (arr[j] > b) {
							count ++;
						}
						sum += arr[j];
						if (sum > b) {count++;}
						//count++;
					}
				System.out.println("sum is :" + sum);
			}
		}
		return count;
	}
	public static int[] prefixSum(int[] a) {
		int n = a.length;
		int[] prefixSum = new int[n];
		prefixSum[0] = a[0];
		for (int i = 1; i < n; i++) {
			prefixSum[i] = prefixSum[i - 1] + a[i];
		}
		return prefixSum;
	}
}
