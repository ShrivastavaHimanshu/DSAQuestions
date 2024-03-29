package com.himanshu.advanced;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*Given a string A and a string B, find the window with minimum length in A, which will contain all the characters in B in linear time complexity.
Note that when the count of a character c in B is x, then the count of c in the minimum window in A should be at least x.

Note:

If there is no such window in A that covers all characters in B, return the empty string.
If there are multiple such windows, return the first occurring minimum window ( with minimum start index and length )*/
public class WindowString {

	public static void main(String[] args) {
		 String A = "ADOBECODEBANC";
		 String	B = "ABC";
		 String ans = minWindow(A , B);
		 System.out.println(" ans is :" + ans);

	}

	private static String minWindow(String A, String B) {
		 Map<Character, Integer> map = new HashMap<>();
		    char[] b = B.toCharArray();
		    for (char value : b) {
		        map.put(value, map.getOrDefault(value, 0) + 1);
		    }
		    int resLen = Integer.MAX_VALUE;
		    int t = map.size();
		    int l = 0;
		    int r = 0;
		    StringBuilder str = new StringBuilder();
		    while (r < A.length()) {
		        if (map.containsKey(A.charAt(r))) {
		            if (map.get(A.charAt(r)) == 1) { // if there is duplicates it will be handled A[AAAAAA] B[AA]
		                --t;
		            }
		            map.put(A.charAt(r), map.get(A.charAt(r)) - 1);
		        }
		        while (t == 0) {
		            if (resLen > (r - l + 1)) {
		                str.delete(0, str.length());
		                str.append(A, l, l + (r - l + 1));
		                resLen = str.length();
		            }
		            if (map.containsKey(A.charAt(l))) {
		                int val = map.get(A.charAt(l));
		                if (val == 0) {
		                    ++t;
		                }
		                map.put(A.charAt(l), val + 1);
		            }
		            l++;
		        }
		        r++;
		    }
		    return str.toString();
	}

}
