package com.himanshu.gfg.practice;

import java.util.*;

/**
 * @author Hshri
 *
 */


public class MergeTwoSortedArray {

	
	
	public static void main(String[] args) {
		
//		 String s1 = "abc";
//		 String s2="abc";
//	     String s3 = new String("abc");
//	     if(s1==s2) {
//	    	 System.out.println(" yes s1==s2");
//	     }
//	     s3 = s3.intern();
//	     if (s1 == s3) {
//	    	 System.out.println(" yes s1==s3");
//	     }
//	     if(s1.equalsIgnoreCase(s3)) {
//	    	 System.out.println(" yes s1.equalsIgnoreCase(s3)");
//	     }
		
		int n = 4;
		long arr1[] = { 1, 3, 5, 7 };
		int m = 5;
		long arr2[] = { 0, 2, 6, 8, 9 };
		merge(arr1, arr2, n, m);

	}

	private static void merge(long[] arr1, long[] arr2, int n, int m) {

		 int i = 0, j = 0, k = n - 1;
	        while (i <= k && j < m) {
	            if (arr1[i] < arr2[j])
	                i++;
	            else {
	                int temp = (int) arr2[j];
	                arr2[j] = arr1[k];
	                arr1[k] = temp;
	                j++;
	                k--;
	            }
	        }
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);

		System.out.print(Arrays.toString(arr1));
		System.out.println();
		System.out.print(Arrays.toString(arr2));
	}

	private static void fixArray2(long[] arr2) {
		for (int i = 1; i < arr2.length; i++) {
			if (arr2[i] < arr2[i - 1]) {
				long temp = arr2[i];
				arr2[i] = arr2[i - 1];
				arr2[i - 1] = temp;
			}
		}

	}

	private static void swap(int i, int j, long[] arr1, long[] arr2) {

		long temp = arr1[i];
		arr1[i] = arr2[j];
		arr2[j] = temp;

	}

}
