package com.himanshu.advanced.arrays;

/*The government wants to set up B distribution offices across N cities for the distribution of food
packets. The population of the ith city is A[i]. Each city must have at least 1 office, and people 
can go to an office of their own city. We want to maximize the minimum number of people who can get 
food in any single office.*/
public class FoodPacketsDistribution {

	public static void main(String[] args) {
		int arr [] = {10000, 20000, 30000};
		int b = 6;
		int ans = solve(arr, b);
		System.out.println("ans : "+ans);
		

	}

	private static int solve(int[] arr, int b) {
		int n = arr.length;
		int l = 1; // Atleast 1 office has to be open
		
		// High should be min among all array element as We want to maximize the minimum number 
		
		int min = Integer.MAX_VALUE;
		
		
		int sum = 0;
		for(int i = 0 ; i < n ; i++) {
			sum+=arr[i];
			min=Math.min(min, arr[i]);
		}
		
		int h = min;
		
		// Edge case when sum of all element is less than B 
		
		if (sum < b) {
			return 0;
		}
		
		int ans =0;
		while(l<=h) {
			int mid = (l+h)/2;
			if (check(arr, mid, b)) {
				ans = mid;
				l = mid+1;
			}else {
				h = mid-1;
			}
		}
		return ans;
	}

	private static boolean check(int[] arr, int mid, int b) {
		int req = 0;
		for(int i = 0 ; i < arr.length; i++) {
			req+=arr[i]/mid;
		}
		if (req>=b) {
			return true;
		}
		return false;
	}



}
