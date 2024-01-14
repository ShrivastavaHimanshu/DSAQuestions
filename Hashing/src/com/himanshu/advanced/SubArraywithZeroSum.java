package com.himanshu.advanced;

import java.util.HashSet;

public class SubArraywithZeroSum {

	public static void main(String[] args) {
		int arr [] = {1, -1};
		int ans = solve(arr);
		System.out.println("ans is :" + ans);

	}
	
	public static int solve(int[] arr) {
        int n = arr.length;
        Long [] pf = new Long [n];
        // Creating a PF array
        pf[0] = (long) arr[0];
        for(int i = 1 ; i < n ; i++){
            pf[i]=pf[i-1]+arr[i];
        }

        int count = 0;

        HashSet<Long> set = new HashSet <>();

        for(int i = 0 ; i < n ; i++){

            set.add(pf[i]);
            if (pf[i]==0){
                count = 1;
            }

        }  

        if (set.size()!=n){
           count = 1;
        }  
      
        return count;
    }
}
