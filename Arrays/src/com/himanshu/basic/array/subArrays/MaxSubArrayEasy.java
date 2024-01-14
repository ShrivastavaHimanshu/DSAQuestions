package com.himanshu.basic.array.subArrays;

public class MaxSubArrayEasy {

	public static void main(String[] args) {
		int [] arr = {2, 1, 3, 4, 5};
		int n = arr.length;
		int b = 12;
		int ans = maxSubarray(n, b, arr);
		System.out.println("ans is :" + ans);

	}

	public static int maxSubarray(int n, int b, int[] arr) {
		int curr_sum = arr[0] , max_sum = arr[0] , ans =0;
		for(int i = 1 ; i <n ; i++) {
			
			curr_sum = curr_sum + arr[i];
			if (curr_sum <= b) {
				ans = curr_sum;
			}
		}
		return ans;
	}

	public static int maximumSumSubArray(int[] arr, int n) {
		int curr_sum = arr[0] , max_sum = arr[0];
		for(int i = 1 ; i <n ; i++) {
			if(curr_sum <0) {
				curr_sum =0;
			}
			  curr_sum = curr_sum + arr[i];
			if (curr_sum > max_sum) {
				max_sum = curr_sum;
			}
		}
		return max_sum;
	}

	
}
