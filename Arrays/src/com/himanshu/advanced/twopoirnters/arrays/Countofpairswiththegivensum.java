package com.himanshu.advanced.twopoirnters.arrays;

public class Countofpairswiththegivensum {

	public static void main(String[] args) {
		int arr [] = {1, 2, 3, 4, 5 };
		int b = 5;
		int ans = solve(arr, b);
		System.out.println(" ans is :" + ans);

	}

	private static int solve(int[] A, int B) {
		 int n = A.length;
	        int i = 0 , j = n-1;
	        System.out.println(" frst i :" + i + " j :" + j);
	        long count = 0;
	        while(i<j){
	        	//System.out.println(" i :" + i + " j :" + j);
	            int sum = A[i]+A[j];
	            if(sum==B){
	                count++;
	                i++;
	                j--;
	            }else if ( sum < B){
	                i++;
	            }else {
	            	
	                j--;
	            }
	        }
	        return (int)count;
	}

}
