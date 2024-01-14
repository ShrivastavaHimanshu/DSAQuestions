package com.himanshu.basic.array.sorting;

public class LowerCase {

	public static void main(String[] args) {
		char [] a = {'S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'};
		char [] ans = toLower(a);
		for(int i = 0 ; i < ans.length ; i++) {
			System.out.print(ans[i] + "");
		}
		

	}

	public static char[] toLower(char[] A) {
		   int n = A.length;
	       char [] a = new char[n];
	         for(int i = 0 ; i < n ; i++){
	             if (A[i] >= 'A' && A[i] <='Z'){
	                a[i] = Character.toLowerCase(A[i]);  

	             }
	         }
	         return a;
	}

}
