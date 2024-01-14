package com.himanshu.advanced;

/*You are given a string A of lowercase English alphabets. 
 * Rearrange the characters of the given string A such that there is no boring substring in A.

	A boring substring has the following properties:

Its length is 2.
Both the characters are consecutive, for example - "ab", "cd", "dc", "zy" etc.
(If the first character is C then the next character can be either (C+1) or (C-1)).
Return 1 if it is possible to rearrange the letters of A such that there are no boring substrings 
in A else, 
return 0.

*/
public class BoringSubstring {

	public static void main(String[] args) {
		 String a = "abcd";
		 int ans = solve(a);
		 System.out.println("ans is :" + ans);

	}

	private static int solve(String a) {
		// TODO Auto-generated method stub
		return 0;
	}

}
