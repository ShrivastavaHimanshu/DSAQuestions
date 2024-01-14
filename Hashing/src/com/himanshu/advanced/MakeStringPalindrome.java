package com.himanshu.advanced;

import java.util.HashMap;
import java.util.Map;

public class MakeStringPalindrome {

	public static void main(String[] args) {
		String a = "abc";
		int ans = solve(a);
		System.out.println("ans is :" + ans);

	}

	private static int solve(String a) {
		int n = a.length();
		StringBuilder str = new StringBuilder(a);
		String lps = str+"$"+str.reverse();
		int lpsCount = computrLPS(lps);
		return n-lpsCount;
		}

	private static int computrLPS(String lps) {
		int n = lps.length();
		System.out.println("lps :" + lps);
		int [] lpsArray = new int [n];
		int i = 0 , j = 1;
		lpsArray[0]=0;
		while(j < n) {
			if (lps.charAt(i)==lps.charAt(j)) {
				i++;
				lpsArray[j]=i;
				j++;
			}else {
				if (i!=0) {
					i=lpsArray[i-1];
				}else {
					lpsArray[j]=0;
					j++;
				}
			}
		}
		return lpsArray[n-1];
	}
		
	}


