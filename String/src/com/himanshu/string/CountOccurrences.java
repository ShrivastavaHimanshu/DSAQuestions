package com.himanshu.string;

public class CountOccurrences {

	public static void main(String[] args) {
		String a = "bobob";
		int ans = solve(a);
		System.out.println(ans);
	}

	public static int solve(String A) {
		int n = A.length(), count =0 ;
        for(int i = 1 ; i < n-2 ; i++){
            if(A.charAt(i)=='o'){ 
            if (A.charAt(i+1)=='b' && A.charAt(i-1)=='b'){
             count++;
             }}
        }
        System.out.println("count is :" + count);
        
        return count;
	}

}
