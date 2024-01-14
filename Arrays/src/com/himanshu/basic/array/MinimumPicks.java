package com.himanshu.basic.array;

public class MinimumPicks {

	public static void main(String[] args) {
		int arr [] = {5, 17, 100, 1};
		int diff = getDiff(arr);
		System.out.println("ans is :" + diff);

	}

	private static int getDiff(int[] arr) {
		int n = arr.length;
		int maxEven = getMaxEven(arr, n);
		int minOdd = getMinOdd(arr,n);
		int diff = maxEven-minOdd;		
		return diff;
	}

	public static int getMaxEven(int[] arr, int n) {
		int maxEven = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {

				if (arr[i] > maxEven)
					maxEven = arr[i];
			}

		}
		return maxEven;
	}

	public static int getMinOdd(int[] arr, int n) {

		int minOdd = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 != 0) {

				if (arr[i] < minOdd)
					minOdd = arr[i];
			}

		}
		return minOdd;
	}

}
