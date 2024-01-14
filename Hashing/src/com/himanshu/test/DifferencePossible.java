package com.himanshu.test;

import java.util.HashMap;
import java.util.HashSet;

public class DifferencePossible {

	public static void main(String[] args) {
//		int a[] = {77, 28, 19, 21, 67, 15, 53, 25, 82, 52, 8, 94, 50, 30, 37, 39, 9, 43, 35, 48, 82, 53, 16, 20, 13, 95, 18, 67, 77, 12, 93, 0};
//		int b =53; //  ans : 1
		int [] a = {1, 5, 4, 1, 2} 	;
		int b = 0;  // ans :1
		int ans = getdiff(a,b);
		System.out.println("ans is :"+ ans);
	}
//  A[i] - A[j] = k, i != j.
	public static int getdiff(int[] A, int B) {
		 if(A.length<2){
	          return 0;
	      }
	      HashSet<Integer> hs=new HashSet<>();

	        for(int i=0;i<A.length;i++){
	            if(hs.contains(A[i]-B) || hs.contains(A[i]+B)){
	                return 1;
	            }
	            else{
	                hs.add(A[i]);
	            }
	        
	        }
	        return 0;
	}

}
