package com.himanshu.string;

import java.util.HashSet;

public class SubstringOfSizeThreeWithDistinctCharacters {

	public static void main(String[] args) {
		String s = "aababcabc";
		int ans = countGoodSubstrings(s);
		System.out.println("ans is :" + ans);
	}

	
	 public static int countGoodSubstrings(String s) {
	        // int  start = 0 end = 2 
	        // insert these charaters in set or map and simply check size 
	        int start = 0, end = 2;
	        int n = s.length(), count = 0; //
	         HashSet<Character> set = new HashSet<>();
	        while(start <= end && end<n){
	           
	            int tempStart = start;
	            int tempEnd = end;
	            set = new HashSet<>();
	            while(tempStart<=tempEnd){
	                char c = s.charAt(tempStart);
	                set.add(c);
	                tempStart++;
	            }
	            if(set.size()==3){
	                count++;
	            }
	            start++;
	            end++;
	        }
	        return count;
	    }
	
}
