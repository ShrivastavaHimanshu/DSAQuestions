package com.himanshu.advanced;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeat {

	public static void main(String[] args) {
		String s = "abcabcbb";
		//System.out.println("char is" + s.charAt(3));
		int ans = lengthOfLongestSubstring(s);
		System.out.println(" ans is : " + ans);

	}

	private static int lengthOfLongestSubstring(String s) {
		Set <Character> set = new HashSet<>();
		int n = s.length();
		if (n==1) return 1;
		int ans = 0;
		int i = 0 , j = 0;
		while(j<n){
			char ch = s.charAt(j);
			if(!(set.contains(ch))) {
				set.add(ch);
				ans=Math.max(ans, set.size());
				j++;
			}else {
				set.remove(s.charAt(i));
				i++;
			}
			
		}
		return ans;
	}

}
