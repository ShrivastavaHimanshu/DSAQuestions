package com.himanshu.basic.carryforward.array;

import java.util.Vector;

public class LeadersInArray {

	public static void main(String[] args) {
		int [] a = {93, 57, 83, 41, 100, 10, 79, 27, 94, 22, 4, 96, 48, 18, 89, 37, 21, 5, 46, 81, 15, 30, 47, 23, 34, 65, 55, 9, 36, 20, 54, 17, 7, 56, 78, 84, 87, 97, 16, 69, 28, 11, 44, 49, 8, 25, 98, 75, 53, 62, 19, 24, 80, 68, 50, 91, 1, 86, 77, 14, 72, 66, 42, 63, 73, 45, 31, 61, 85, 64, 35, 32, 92, 71, 74, 3, 99, 52, 90, 43, 6, 40, 38, 2, 12, 59, 29, 82, 76, 60, 67, 13, 70, 58, 39, 33, 95, 88, 51, 26};
		int [] ans= solve(a);
		for(int i = 0 ; i< ans.length; i++) {
			System.out.print(ans[i] +  " ");
		}
		
		
	}
	 public static int[] solve(int[] arr) {
	        int n = arr.length, max=arr[n-1] , k=0;
	        Vector<Integer> ans = new Vector<Integer>();
	        ans.add(k, max);
	       for(int i = n-1; i >=0; i--){
	             if (arr[i] > max){
	            	 ans.add(k+1,arr[i]);
	                 max = arr[i];
	                 k++;
	             }
	       }
	       int count = 0, intArray[] = new int[ans.size()];
	       for(int i: ans) {
	    	   intArray[count++] = i;
	       }
	       return intArray;
	    }
}
