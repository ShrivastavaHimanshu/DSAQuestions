package com.himanshu.leetcode;

import java.util.HashSet;

public class NextGreaterElement {

	public static void main(String[] args) {
		int [] nums1 = {1,3,5,2,4};
		int [] nums2 = {6,5,4,3,2,1,7};
		int ans [] = nextGreaterElement(nums1, nums2);
		for(int i = 0 ; i < ans.length ; i++) {
			System.out.print(ans[i]+" ");
		}
		
	
	}

	
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans [] = new int [nums1.length];
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums2.length; i++){
            set.add(nums2[i]);
        }
        
        for(int i = 0 ; i < nums1.length; i++){
            if (!(set.contains(nums1[i]))){
                ans[i]=-1;
            }
            else 
            { int res = getnum(nums2, nums1[i]);
              ans[i] = res;
            }
        }
    
//         for(int i = 0 ; i < nums1.length; i++){
//            if (ans[i]==0){
//                int res = getnum(nums2, nums1[i]);
//                ans[i] = res;
//                
//            }
//        }
        return ans;
    }
        
        public static int getnum(int [] arr , int n){
            int ans = -1;
            for(int i = 0 ; i < arr.length ; i++){
                 if (arr[i]==n){
                     while(i < arr.length-1){
                         if (arr[i] < arr[i+1]){
                             ans= arr[i+1];
                          }
                         i++;
                     }
                  }
            }
            return ans;
        }
        
	
}
