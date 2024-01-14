package com.himanshu.subsequences;

public class SumOfSubsets {

	public static void main(String[] args) {
		int arr [] = {3, -2 ,1};
		int sum = SumOfSubsets(arr);
		System.out.println("ans is :" + sum);
	}
// 3, 2 ,1  1 
	
	
	
	
	private static int SumOfSubsets(int[] arr) {
		int ans = 0;
		int n = arr.length;
		int power = (int) Math.pow(2, n);
		for(int i = 0 ; i < (1<<n) ; i++) {
			for(int j = 0; j < n ; j++) {
				if(checkBit(i,j)) {
					ans = ans + arr[j];
				}
			}
		}
		return ans;
	}

	private static boolean checkBit(int i, int j) {
		if ((1 &(i>>j))==1) {
			return true;
		} 
		return false;
	}

}
