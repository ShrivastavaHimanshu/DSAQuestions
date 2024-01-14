package com.himanshu.advanced.arrays;

public class AllocateBooks {

	public static void main(String[] args) {
		int arr [] = {31, 14, 19, 75};
		int b = 12;
		int ans = books(arr, b);
		System.out.println("ans is : " + ans);

	}

	private static int books(int[] arr, int b) {
		int n = arr.length;
		int ans = -1;
		if (b > n) {
			return -1;
		}
		// This would be max number of pages  among all in Array
		int l = getLowerLimit(arr);
		// Sum of all pages in entire array
		int h =  getHigherLimit(arr);
	
		while(l<=h) {
			int mid = (l+h)/2;
			if (check(arr, mid, n, b)) {
				ans=mid;
				h=mid-1;
			}else {
				l =  mid+1;
			}
		}
		return ans;
	}

	private static int getHigherLimit(int[] arr) {
		int h = 0;
		for(int i = 0 ; i < arr.length; i++) {
			h = h + arr[i];
		}
		return h;
	}

	private static boolean check(int[] arr, int mid, int n , int b) {
		int sum = 0, c=0;
		for(int i = 0 ; i < n ; i++) {
			sum = sum+arr[i];
			if (sum>mid) {
				c++;
				sum=arr[i];
			}
		}
		if (sum!=0) {
			c++;
		}
		if (c<=b) {
			return true;
		}
		return false;
	}

	private static int getLowerLimit(int[] arr) {
		
		int l = Integer.MIN_VALUE;
		int n = arr.length;
		for(int i = 0 ; i < n; i++) {
			if (l < arr[i]) {
				l=arr[i];
			}
		}
		return l;
	}

}
