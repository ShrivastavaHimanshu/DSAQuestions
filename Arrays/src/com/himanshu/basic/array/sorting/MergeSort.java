package com.himanshu.basic.array.sorting;

/**
 * Merge Sort Steps
 * 
 * 1 : We will try to divide an array into two halves until we left with single
 * element 2 : Then simply merge the two arrays 3 :
 *
 */

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = { 5, -9, 6, 19, 3, 26 };
		int ans[] = mergeSort(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	private static int[] mergeSort(int[] arr) {
		mergeSortUsingRecursion(arr, 0, arr.length - 1);
		return arr;
	}

	private static void mergeSortUsingRecursion(int[] arr, int start, int end) {
		if (start == end) {
			return;
		}
		int mid = (start + end) / 2;
		mergeSortUsingRecursion(arr, start, mid);
		mergeSortUsingRecursion(arr, mid + 1, end);
		mergeArrays(arr, start, mid, end);
	}

	private static void mergeArrays(int[] arr, int start, int mid, int end) {
		int res[] = new int[end - start + 1];
		int p1 = start, p2 = mid + 1, p3 = 0;
		while (p1 <= mid && p2 <= end) {
			if (arr[p1] < arr[p2]) {
				res[p3] = arr[p1];
				p1++;
				p3++;
			} else {
				res[p3] = arr[p2];
				p2++;
				p3++;
			}
		}

		while (p1 <= mid) {
			res[p3] = arr[p1];
			p1++;
			p3++;
		}

		while (p2 <= end) {
			res[p3] = arr[p2];
			p2++;
			p3++;
		}

		// Copy remaining initial elements

		for (int i = 0; i <= (end - start); i++) {
			arr[i + start] = res[i];
		}

	}

}
