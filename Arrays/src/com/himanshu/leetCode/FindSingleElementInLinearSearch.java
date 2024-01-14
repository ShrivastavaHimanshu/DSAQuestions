package com.himanshu.leetCode;

public class FindSingleElementInLinearSearch {

	public static void main(String[] args) {
		int [] a = {1,0,1};
		int ans = singleNumber(a);
		System.out.println("ans is :" + ans);

	}

	 public static int singleNumber(int[] nums) {
	        int ans = nums[0], n = nums.length;
	        for(int i = 1 ; i <=n-2 ; i++){
	             if (nums[i]-ans==0)
	                 ans = nums[i+1];
	        }
	       return ans; 
	    }
}
