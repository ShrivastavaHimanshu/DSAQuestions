package com.himanshu.bitmanipulation;

public class ReverseBits {

	public static void main(String[] args) {
		long a = 0;
		long ans = reverseBits(a);
		System.out.println("ans is :" + ans);

	}
 // 0000011
//  1100000	
	
	public static long reverseBits(long A) {
		long ans = 0;
		long one = 1;
        for(int i = 0 ; i < 32 ; i++) {
        	 if ((A & (one<<i)) > 0){
        		 ans = ans | (one<<(31-i));
        	 }
        }
      
        return ans;
       
    }

}
