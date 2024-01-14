package com.himanshu.basic.array.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class SortByColor {

	public static void main(String[] args) {
		int [] a =  {1, 90, 32 ,0, 341, 2, 90};
		int [] sortedArray = sortColours(a);
		System.out.println("ans is ");
		for(int i = 0 ; i < sortedArray.length; i++) {
			System.out.print( sortedArray[i]+" ");
		}
		
		

	}

	public static int[] sortColours(int[] a) {
		int n = a.length;
		Integer [] arr = new Integer[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = a[i];
		}
		Arrays.sort(arr, new Comparator<Integer>() {

			@Override
			public int compare(Integer x, Integer y) {
				if (x==y) return 0;
				if (x < y) return -1;
				return 1;
				
			}
		});
		int result [] = new int [n];
		for(int i = 0 ; i < n ; i++) {
			result[i] = arr[i];
		}
		return result;
	}

	
	
}
