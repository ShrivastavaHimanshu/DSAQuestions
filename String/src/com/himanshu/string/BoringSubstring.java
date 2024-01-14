package com.himanshu.string;

/*You are given a string A of lowercase English alphabets. Rearrange the characters of the given string A such that there is no boring substring in A.

A boring substring has the following properties:

Its length is 2.
Both the characters are consecutive, for example - "ab", "cd", "dc", "zy" etc.(If the first character
is C then the next character can be either (C+1) or (C-1)).
Return 1 if it is possible to rearrange the letters of A such that there are no boring substrings 
in A else, return 0.

*
*
*/
// algorithm 
// - Separate odd parity and even parity characters separetly 
// - then check for s1+s2 or s2+s1;
public class BoringSubstring {

	public static void main(String[] args) {
		String str = "aacd";
		int ans = solve(str);
		System.out.println(" ans is " + ans);

	}

	private static int solve(String str) {
		int n = str.length();
		int oddMaximum = Integer.MIN_VALUE;
		int oddMinimum = Integer.MAX_VALUE;
		
		int evenMaximum = Integer.MIN_VALUE;
		int evenMinimum = Integer.MAX_VALUE;
		
		for(int i = 1 ; i < n-1 ; i++) {
			int val = str.charAt(i)-str.charAt(i-1);
			if(val % 2 !=0) {
				oddMaximum = Math.max(oddMaximum, val);
				oddMinimum = Math.min(oddMinimum, val);
			}
			else {
				evenMaximum = Math.max(evenMaximum, val);
				evenMinimum = Math.min(evenMinimum, val);
			}
		}
		
		if (Math.abs(evenMinimum-oddMaximum) > 1) {
			return 1;
		}
		
		if (Math.abs(oddMinimum-evenMaximum) > 1) {
			return 1;
		}
		return 0;
	}

	

}
