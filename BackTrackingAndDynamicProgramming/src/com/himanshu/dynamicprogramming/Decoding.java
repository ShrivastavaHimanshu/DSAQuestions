package com.himanshu.dynamicprogramming;

import java.util.Arrays;

public class Decoding {

	public static void main(String[] args) {
		String Str = "AB";
		int ans = numDeocdings(Str);
		System.out.println(" ans is :" + ans);

	}
	
	private static int numDeocdings(String str) {
		
		if (str.length() == 0) {
			return 0;
		}
		
		if (str.charAt(0) == '0') {
			return 0;
		}
		
		int n = str.length();
		int [] dp = new int [n+1];
		Arrays.fill(dp, 0);
		
		dp[0] = 1; // empty string
		dp[1] = 1 ; // first or  any 1 character
		
		
		for(int i = 2 ; i < n ; i++) {
			if (str.charAt(i-1) >= '1' && str.charAt(i-1) <= '9') {
				dp[i] = dp[i-1];
			}
			
			if (str.charAt(i-2)=='1') {
				dp[i] += dp[i-2];
			}
			
			else if (str.charAt(i-2) == '2' && str.charAt(i-1) >= '0' && str.charAt(i-1) <= '6'){
				dp[i] += dp[i-2];
			}
		}
		return dp[n];
	}

}
