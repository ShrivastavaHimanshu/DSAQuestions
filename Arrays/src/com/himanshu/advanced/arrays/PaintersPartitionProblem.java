package com.himanshu.advanced.arrays;

public class PaintersPartitionProblem {

	public static void main(String[] args) {
		int arr [] = {185, 186, 938, 558, 655, 461, 441, 234, 902, 681};
		int a = 3;
		int b = 10 ;
		int ans = solve (a, b , arr);
		System.out.println("ans is :" + ans);
	

	}

	private static int solve(int a, int b, int[] arr) {
		int n = arr.length;
		long l = getLowerRange(arr, n);
		long h = getHigherRange(arr, n);
		long ans = 0;
		while(l<=h) {
			long mid = (l+h)/2;
			if(check(arr, mid, a)) {
				ans=mid;
				h=mid-1;
			}else {
				l = mid+1;
			}
		}
		int mod = 10000003;
		long result = ans * b;
		
		return (int) result;
	}

	private static boolean check(int[] arr, long mid, int a) {
		long sum = 0 , c = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			sum = sum + arr[i];
			if (sum>=mid) {
				c++;
				sum=arr[i];
			}
		}
		if (sum!=0) {
			c++;
		}
		
		if ( c<=a) {
			return true;
		}
		return false;
	}

	private static int getHigherRange(int[] arr, int n) {
		// this would be worst case when signle worker will do all the tasks 
		// So it would be sum of all the array elements
		int sum = 0;
		for(int i = 0 ; i < n ; i++) {
			sum+=arr[i];
		}
		return sum;
	}

	private static int getLowerRange(int[] arr, int n) {
		// This would be maximum among all the rray elements --> best case when all tasks 
		// being picked by single worker
		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i < n ; i++) {
			max=Math.max(max, arr[i]);
		}
		return max;
    }
}
