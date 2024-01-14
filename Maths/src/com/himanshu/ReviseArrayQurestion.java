package com.himanshu;

public class ReviseArrayQurestion {

	public static void main(String[] args) {
		int [] a = {1,2,3,4};
		int b = 2;
		/*
		 * int ans [] = rotateArray(a,b); for(int i = 0 ; i < a.length ; i++) {
		 * System.out.print(ans[i]+ " "); }
		 */
		
		int [] arr = {-2, 1, -4, 5, 3 };
		int res = solve(arr);
		System.out.println("ans is :" + res);
	}

	public static int[] rotateArray(int[] a, int b) {
		int n = a.length;
		int rotateArray [] = new int [n];
		
		if (b > n) {
			b = b %n;
		}
		//  Reverse the entire array
		int start = 0;
		int end = n-1;
		int revArray [] = reverseArray(start, end , a, n);
		
		// reverse the k-1 element
	
		end = b-1;
		int revArray1 [] = reverseArray(start, end , revArray, n);
		
		// reverse the remaining k-1 array
		
		start = b;
		end = n-1;
		
		int revArrayFinal [] = reverseArray(start, end , revArray1, n);  
		
		
		return revArrayFinal;
	}

	public static int [] reverseArray(int start, int end, int[] arr, int n) {
	    while(start < end) {
	    	int temp = arr[start];
	    	arr[start]= arr[end];
	    	arr[end] = temp;
	    	start++;
	    	end--;
	    }
		return arr;
	}

	public static int solve(int[] A) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = A.length;
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            if(A[i] < min){
                min = A[i];
            }
            if (A[i] > max){
                max= A[i];
            }
            sum = max+min;
        }
        System.out.println("min is :" + min + " max is :" + max);
        
       return max; 
    }
}
