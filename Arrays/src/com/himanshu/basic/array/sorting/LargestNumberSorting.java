package com.himanshu.basic.array.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumberSorting {

	public static void main(String[] args) {
		int arr [] = {3, 30, 34, 5, 9};
		String ans = Sys(arr);
		System.out.println(" ans :" + ans);

	}

	private static String Sys(int[] arr) {
		int n = arr.length;
		String s [] = new String [n];
		for(int i = 0 ; i < n ; i++) {
			s[i] = String.valueOf(arr[i]);
		}
		
		Arrays.sort(s, new Comparator <String >() {

			@Override
			public int compare(String o1, String o2) {
				String xy = o1+o2;
				String yx = o2+o1;
				return xy.compareTo(yx) > 0 ?-1: 1;
			}
		});
		
		String ans = "";
		for(int i = 0 ; i < n ; i++) {
			ans = ans + s[i]; 
		}
		
		return ans.startsWith("0") ? "0" : ans ;
	}

}
