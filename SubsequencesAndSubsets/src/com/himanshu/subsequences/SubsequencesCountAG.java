package com.himanshu.subsequences;

public class SubsequencesCountAG {

	public static void main(String[] args) {
		String a = "GUGPUAGAFQBMPYAGGAAOALAELGGGAOGLGEGZ";
		int ans = solve(a);
		int n = a.length();
		System.out.println("ans is :" + ans);

	}
	
	public static int solve(String A) {
		 int countG = 0;
	        int countA=0;
	        int TotalCount=0;
	        int n = A.length();
	        for(int i = n-1 ; i >=0 ; i--) {
	        	if (A.charAt(i)=='G') {
	        		countG++;
	        	}
	        	if(A.charAt(i)=='A') {
	        		countA=countG+countA;
	        		
	        	}
	        	
	        }
        int ans = countA % (1000000000+7);
        return ans;
    }

   
}
