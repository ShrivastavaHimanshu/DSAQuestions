package com.himanshu.basic.array.subArrays;

public class CountingSubArrayEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public static int solve(int[] arr, int B) {
	        int n = arr.length , count =0;
	        for(int i = 0 ; i < n ; i++){
	            int sum = 0;
	            for(int j = i ; i < n ; j++){
	                sum+=arr[i];
	                if (sum < B){
	                    count++;
	                }
	            }
	        }
	        return count;
	    }
}
