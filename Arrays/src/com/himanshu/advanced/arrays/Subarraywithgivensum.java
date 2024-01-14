package com.himanshu.advanced.arrays;

public class Subarraywithgivensum {

	public static void main(String[] args) {
		int arr [] = {5, 10, 20, 100, 105};
		int b = 130;
		int ans [] = solve(arr, b);
		for(int i = 0 ; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	
	// Find total Sum of array
	// Then create two pointer  start --> 0 & end --> n-1
	// Keep on checking the sum equals or not 
	
	
	private static int[] solve(int[] A, int B) {
        int n = A.length;
        int left = 0;
        int right = 0;
        int sum = A[left];
        while(right < n) {
        	if (sum==B) {
        		int ans [] = new int [right-left+1];
        		for(int i = 0 ; i < ans.length; i++) {
        			ans[i]=A[left];
        			left++;
        		}
        		return ans;
        	}
        	else if (sum < B) {
        		right++;
        		if (right<n)
        		sum+=A[right];
        	}else {
        		sum=-A[left];
        		left++;
        		if (left>right && left < n-1) {
        			right++;
        			sum+=A[right];
        		}
        	}
        }
       return new int [] {-1};
        
       
       
    }

}
