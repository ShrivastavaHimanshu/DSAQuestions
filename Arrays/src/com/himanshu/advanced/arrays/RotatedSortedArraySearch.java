package com.himanshu.advanced.arrays;
/*Given a sorted array of integers A of size N and an integer B.

array A is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2 ).

You are given a target value B to search. If found in the array, return its index otherwise, return -1.

You may assume no duplicate exists in the array.*/

public class RotatedSortedArraySearch {

	public static void main(String[] args) {
		int[] A = {1};
		int B = 2;
		int ans = searchElement(A, B);
		System.out.println("ans is :" + ans);

	}

	private static int searchElement(int[] a, int b) {
		int n = a.length;
		if (n==1) {
			if (a[0]==b) {
				return 0;
			}
			return -1;
		}
			if (a[0] < a[n-1]) {
				return binarySearch(a, 0, n-1, b);
			}
		int pivot = getPivot(a);
		
		if (b >= a[0] && b <= a[pivot - 1]) {

			return binarySearch(a, 0, pivot - 1, b);
		} else {

			return binarySearch(a, pivot, n - 1, b);
		}
	}

	private static int getPivot(int[] arr) {
		int n = arr.length;
		int k = 0;
		int l = 0, h = n - 1;
//		while (l < h) {
//			int mid = (l + h) / 2;
//			if (arr[mid] >= arr[0]) {
//				l = mid + 1;
//			} else {
//				h = mid;
//			}
//		}
		while(l<=h) {
			int mid = (l+h)/2;
			if (arr[mid] < arr[0]) {
				// It means we are in second sorted array , So need to search in left or frst array 
				k = mid;// It could be mid , but we tried to find more smaller name So discard right and move to left
				h = mid-1;
			}else {
				l=mid+1;
			}
		}
		
		return k;
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

}
