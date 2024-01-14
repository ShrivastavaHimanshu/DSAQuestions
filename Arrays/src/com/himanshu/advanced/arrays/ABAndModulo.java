package com.himanshu.advanced.arrays;

//Given two integers A and B, find the greatest possible positive integer M, such that A % M = B % M.

public class ABAndModulo {

	public static void main(String[] args) {
		int a = 5;
		int b = 10 ;
		int ans = solve(a, b);
		System.out.println("ans is :" + ans);

	}

	private static int solve(int a, int b) {
		
		return Math.abs(a-b);
	}

}
