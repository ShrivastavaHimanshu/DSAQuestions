package com.himanshu.gfg.practice;

import java.util.*;


/**
 * @author Hshri
 *
 */
public class SubarrayWithGivenSym {

	public static void main(String[] args) {
		
		int arr [] = {1, 2, 3, 4, 5};
		int n = arr.length;
		int sum = 9;
		ArrayList<Integer> ans = subarraySum(arr, n , sum);
		ans.stream().forEach(System.out::print);

	}
		
	
	private static ArrayList<Integer> subarraySum(int[] arr, int n, int sum) {
		ArrayList<Integer> ans = new ArrayList<>();
	       int start = 0;
	       int currSum = 0;
	       for(int i = 0 ; i < n ; i++){
	           if(i < n)
	           currSum+=arr[i];
	            while(currSum > sum && start < i){
	        	   currSum = currSum - arr[start];
	               start++;
	           }
	            if(currSum == sum){
		            ans.add(start+1);
		            ans.add(i+1);
		            return ans ;
		           }
		       }
		        ans.add(-1);
		    	return ans;
	       }
		
	}


