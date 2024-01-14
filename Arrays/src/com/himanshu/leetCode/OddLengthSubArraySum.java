package com.himanshu.leetCode;

public class OddLengthSubArraySum {

	public static void main(String[] args) {
		int a [] = {1,4,2,5,3};
		int ans = getOddLengthSubArraySum(a);
		System.out.println("sum is :" + ans);

	}

	public static int getOddLengthSubArraySum(int[] a) {
		int sum = 0;
		for(int i = 1 ; i <= a.length ; i++) {
			for(int j = i ; j <=a.length; j++) {
				//if (j %2 ==1)
			}
		}
		return sum;
	}

}
