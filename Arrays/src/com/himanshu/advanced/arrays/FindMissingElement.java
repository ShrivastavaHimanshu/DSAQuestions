/**
 * 
 */
package com.himanshu.advanced.arrays;

/**
 * @author Hshri
 *
 */
public class FindMissingElement {
	
	public static void main(String[] args) {
		int [] arr = { 2, 3, 1, 2 };
		int ans = firstMissingPositive(arr);
		System.out.println("ans is :- " + ans);

	}

	public static int firstMissingPositive(int[] A) {

        // So the possible cases is either it can be missing in array or 
        // array have all the positive integer so nas would be n+1


        // frst we get rid of all the negative number and 0 and replace it with n+2
        int n = A.length;
        for(int i = 0 ; i < n ; i++){
        	
            if(A[i] <=0){
                A[i]=n+2;
            }
        }
        //  2, 3, 1, 2 
        // Now we have all the valid positive numbers 
        int index  = 0;
        for(int i = 0 ; i < n ; i++){
            int element = Math.abs(A[i]);
            if( element>=1 &&  element<=n){
                index = element-1;
                if (A[index] > 0) {
                	 A[index] = -1 * A[index];
                }
             }
           
        }
        	
//        // print the array 
//        for(int i = 0 ; i < n ; i++) {
//        	System.out.print(A[i] + " ");
//        }
        
        for(int i = 0 ; i < n ; i++){
            if (A[i] > 0)
            return i+1;
        }
        return n+1;
    }
	
}
