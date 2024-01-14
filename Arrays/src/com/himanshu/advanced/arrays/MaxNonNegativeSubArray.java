package com.himanshu.advanced.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxNonNegativeSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {-1, -1, -1, -1, -1};
		//List<int[]>  arrList = Arrays.asList(arr);
		int ans = maxset(arr);
		System.out.println(" ans is :" + ans);
	}

	
	public static int maxset(int [] A) {
		  // So the possible cases is either it can be missing in array or 
        // array have all the positive integer so nas would be n+1


        // frst we get rid of all the negative number and 0 and replace it with n+2
        int n = A.length;
        for(int i = 0 ; i < n ; i++){
            if(A[i] <=0){
                A[i]=n+2;
            }
        }

        // Now we have all the valid positive numbers 
        int index  = 0;
        for(int i = 0 ; i < n ; i++){
            int element = Math.abs(A[i]);
            if( element>=1 &&  element<= n){
                index = element-1;
                 if (A[index] > 0) {
                   A[index] = -1 * A[index];  
                 }
                
            }
        }

        for(int i = 0 ; i < n ; i++){
            if (A[i] > 0)
            return i+1;
        }
        return n+1;
    }
	
}
