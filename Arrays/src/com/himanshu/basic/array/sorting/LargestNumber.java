package com.himanshu.basic.array.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {
		int [] a = {3, 30, 34, 5, 9};
		String largestNumber = largestNumber(a);
		System.out.println("ans is :" + largestNumber);

	}

	public static String largestNumber(int[] a) {
		String ans = "";
		int n = a.length;
		String [] arr = new String [n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = String.valueOf(a[i]);
		}
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String a, String b) {
				String ab = a+b;
				String ba = b+a;
				return ab.compareTo(ba)>0?-1:1;
			}
			
		});
		
		for(int i = 0 ; i < n ; i++){
			
			ans=ans+arr[i];
				}
		return ans.startsWith("0")?"0" : ans;
	}

	
	
}
