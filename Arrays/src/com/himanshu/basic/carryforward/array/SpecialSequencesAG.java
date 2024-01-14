package com.himanshu.basic.carryforward.array;

public class SpecialSequencesAG {

	public static void main(String[] args) {
		String a = "ABCGAG";
		
		long count = solve(a);
		
		System.out.println("ans is : " + count);

	}

	public static long solve(String a) {
		final long M = 1000000007;
		int count = 0 , n = a.length(), countOfG = 0;
		long ans = 0;
		for(int i=n-1 ; i >=0; i-- ) {
			if(a.charAt(i)== 'G') {
				countOfG++;
			}else if (a.charAt(i)=='A') {
				ans=countOfG+ans;
			}
		}
		return ans % M;
	}

}
