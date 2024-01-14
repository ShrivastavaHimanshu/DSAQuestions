package com.himanshu.advanced;

public class PermutationsofAinB {

	public static void main(String[] args) {
		String A = "abc";
		String B = "abcbacabc";
		int ans = solve(A, B);
		System.out.println("ans is :" + ans);

	}

	private static int solve(String a, String b) {
		int count = 26;
		int aCount [] = new int [26];
		int bCount [] = new int [26];
		int res = 0;
		for(int i = 0 ; i < a.length(); i++) {
			aCount[a.charAt(i)-'a']++;
		}
		
		// creating window and checking 
		int length = a.length();
		int l = 0 , r = 0;
		while(r < b.length()) {
			bCount[b.charAt(r)-'a']++;
			if((r-l+1)==length) {
				for(int i = 0 ; i < 26 ; i++) {
					if(aCount[i]!= bCount[i]) {
						count--;
					}
				}
				if (count==26) {
					res++;
				}
				bCount[b.charAt(l)-'a']--;
				l++;
			}
			r++;
			count=26;
		}
		return res;
	}

}
