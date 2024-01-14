package com.himanshu.advanced.recusrion;
/*On the first row, we write a 0. Now in every subsequent row, 
we look at the previous row and replace each occurrence of 0 with 01, 
and each occurrence of 1 with 10.

Given row number A and index B,
return the Bth indexed symbol in row A. (The values of B are 1-indexed.).*/

public class Kthsymbol {

	public static void main(String[] args) {
		int  A = 2 ;
		int  B = 1;
		int ans = solve(A, B);
		System.out.println("ans is :- " + ans);

	}
	
	public static int solve(int A, int B) {
	     if (B==0 || A==0) return 0;
	        int val = 0;
	        if ((B & 1) ==0 ){
	            // B is even
	            val = solve(A - 1, B / 2) == 0 ? 1 : 0;
	        }else {
	            val = solve(A-1, (B+1)/2);
	        }
	          return val; 
	    }
}
