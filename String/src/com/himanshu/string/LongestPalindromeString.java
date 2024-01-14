package com.himanshu.string;

public class LongestPalindromeString {

	public static void main(String[] args) {
//		String A = "abacdfgdcaba";
//		System.out.println(A.length());
//			String ans = longestPalindrome(A);
//			System.out.println("ans is :- " + ans);
		
	      Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int k = (int)(Math.floor((Math.log(n) / Math.log(2))));
	        int d = n - (int)Math.pow(2,k);
	        System.out.println(2*d+1);

	}

	public static String longestPalindrome(String a) {
		String ans = "";
		int n = a.length();
		
		if (n <=1) return a;
		int maxLength=1;
		int start = 0 , end = 0;
		// for odd lengtn string 
		
		for(int i = 0 ; i < n-1; i++) {
			int left = i ,right = i ;
			int tempLength = palindromeLength(left, right , n , maxLength, a);
			if (tempLength>maxLength) {
				maxLength=tempLength;
				start=left+1;
				end=right-1;
			}
		}
		
		// for even Length 
	
		for(int i = 0 ; i < n-1; i++) {
			int left = i ,right = i+1 ;
			
			int tempLength = palindromeLength(left, right , n , maxLength, a);
			if (tempLength>maxLength) {
				maxLength=tempLength;
				start=left+1;
				end=right-1;
			}
		}
		ans=a.substring(start, end+1);
		return ans;
	}

	public static int palindromeLength(int left , int right ,int n, int maxLength, String a) {
		while(left>=0 && right < n) {
			if(a.charAt(left)==a.charAt(right)) {
				left--;
				right++;
			}else {
				break;
			}
		}
		int tempLength = right-left-1;
		return tempLength;
	}
	
}
