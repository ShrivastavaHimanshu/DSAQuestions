package com.himanshu.advanced.arrays;

/*Given a bitonic sequence A of N distinct elements, 
 * write a program to find a given element B in the bitonic sequence in O(logN) time.

NOTE:

A Bitonic Sequence is a sequence of numbers which is first strictly increasing
en after a point strictly decreasing.*/


public class BiotonicSearch {

	public static void main(String[] args) {
		int [] arr = {1, 20, 50, 40, 10};
		int b = 30;
		int ans = solve(arr, b);
		//int pivot = getPivot(arr);
		System.out.println("ans :" + ans);

	}

	private static int solve(int[] arr, int b) {
		int pivot = getPivot(arr);
		int n = arr.length;
		System.out.println("pivot vale :" + pivot + " arr val" + arr[pivot]);
		if (b==arr[pivot]) {
			return pivot;
		}
		
		if ( b < arr[pivot] ) {
			return binarySearch(arr, pivot+1, n-1, b);
		}
		return binarySearch(arr, 0, pivot-1, b);
	}

	public static int binarySearch(int arr[], int start, int end, int target) {
		int mid = 0;
		// System.out.println(" start is " + start + " end is " + end);
		while (start <= end) {
			mid = (start + end) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return -1;

	}
	
	
	private static int getPivot(int[] arr) {
		int n = arr.length;
		int ans = 0;
		int l = 0 , h = n-1; 
		while(l<=h) {
			int mid = (l+h)/2;

			if (arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]) {
				ans=mid;
				//return mid;
			}
			if (arr[mid-1] < arr [mid] && arr [mid] < arr[mid+1]) {
				l=mid+1;
			}else {
				
				h=mid-1;
			}
		}
		return ans;
	}

}
