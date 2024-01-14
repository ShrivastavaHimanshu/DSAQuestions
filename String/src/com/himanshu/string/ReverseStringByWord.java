package com.himanshu.string;

import java.util.ArrayList;
import java.util.Vector;

public class ReverseStringByWord {

	public static void main(String[] args) {
		String a = "crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv ";
		String ans = reverseString(a);
		System.out.println(ans);

	}

	public static String reverseString(String a) {
		int n = a.length();
		String ans = "";
		int i = n-1;
		while(i >=0) {
		while(i >=0 && a.charAt(i)==' ') {
			i--;
		}
		int j = i;
		while( i >= 0 && a.charAt(i)!=' ' ) {
			i--;
		}
        String word = a.substring(i+1, j+1);
        if(ans.isEmpty()) {
        	ans = ans+word;
        }else {
        	ans=ans+" "+word;
        }
        }
		return ans;
	}

	public static char[] reverse(int si, int ei, char[] arr) {
		while (si < ei) {
			char temp = arr[si];
			arr[si] = arr[ei];
			arr[ei] = temp;
			si++;
			ei--;
		}
		return arr;

	}
}
