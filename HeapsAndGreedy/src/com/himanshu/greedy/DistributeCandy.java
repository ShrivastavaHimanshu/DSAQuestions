package com.himanshu.greedy;

import java.util.Arrays;

public class DistributeCandy {

	public static void main(String[] args) {
		int arr [] = {1, 5, 2, 1};
		int ans = solve(arr);
		System.out.println(" ans is :" + ans);

	}

	private static int solve(int[] arr) {
	
		int cnt = 0;
		// frst maintain on the basis of left neighbor
		int n = arr.length;
		int cLeft [] = new int [n];
		for(int i = 0 ; i < n ; i++) {
			cLeft[i] = 1;
		}
		for(int i = 1 ; i < n ; i++) {
			if(arr[i] > arr[i-1]) {
				cLeft[i] = cLeft[i-1]+1;
			}
		}
		
//		// now maintain on the basis of right neighbor
//		
//		int cRight [] = new int [n];
//		for(int i = 0 ; i < n ; i++) {
//			cRight[i] = 1;
//		}
//		
//		for(int i = n-2 ; i >=0 ; i--) {
//			if(arr[i]>arr[i+1]) {
//				cRight[i] = cRight[i+1]+1;
//			}
//		}
//		int ans [] = new int [n];
//		for(int i = 0 ; i < n ; i++) {
//			ans[i] = Math.max(cLeft[i], cRight[i]);
//			
//			cnt+=ans[i];
//		}
		
		// Alterantively we can do this 
		int ans [] = new int [n];
		for(int i = n-2 ; i >=0 ; i--) {
			if(arr[i]>arr[i+1]) {
				cLeft [i] = Math.max(cLeft[i], cLeft[i+1]+1);
			}
		}
		for(int i = 0 ; i < n ; i++) {
			cnt+=cLeft[i];
		}
		return cnt;
	}

}
