package com.himanshu.advanced.arrays;

public class RainTrapWater {

	public static void main(String[] args) {
		int a [] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		int ans = trap(a);
		System.out.print(" ans is :" + ans);
		
	}

	private static int trap(int[] a) {
		int n = a.length;
		int [] prefixMax = prefixMax(a);
		int [] suffixMax = suffixMax(a);
		int totalWaterTrapped = 0;
		
		// WE'RE RUNNING from 1 to n-1 because we don't need both extremest , nothing to compare
		//and no water will be trapped here  
		for (int i = 1 ; i < n-1; i++) {
			// need leftMax from 0 to 1-1
			int leftMax = prefixMax[i-1];
			int rightMax = suffixMax[i+1];
			int validMax = Math.min(leftMax, rightMax);
			int tempAns= validMax-a[i];
			totalWaterTrapped = totalWaterTrapped + Math.max(0, tempAns);
		}
		return totalWaterTrapped;
	}
	
	
	public static int [] prefixMax(int [] A ){
        int n = A.length;
        int [] prefixMax = new int [n];
        prefixMax[0] = A[0];
        for(int i = 1 ; i < n ; i++){
            if ( A[i] > prefixMax[i-1] ){
                prefixMax[i] = A[i]; 
            }
            else {
                prefixMax[i] = prefixMax[i-1];
            }
        }
        
        for (int i = 0; i < prefixMax.length; i++) {
			System.out.print(prefixMax[i] + " ");
		}
        return prefixMax;
    }

	public static int [] suffixMax(int [] A ) {
		int n = A.length;
        int [] suffixMax = new int [n];
        suffixMax[n-1] = A[n-1];
        for(int i = n-2 ; i >= 0 ; i--) {
        	if(A[i] > suffixMax[i+1]) {
        		suffixMax[i] = A[i];
        	}else {
        		suffixMax[i] = suffixMax[i+1];
        	}
        }
        System.out.println("suffix array is :");
        
        for (int i = 0; i < suffixMax.length; i++) {
			System.out.print(suffixMax[i] + " ");
		}
        return suffixMax;
	}

}
