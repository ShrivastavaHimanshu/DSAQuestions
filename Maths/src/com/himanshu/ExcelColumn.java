package com.himanshu;

public class ExcelColumn {

	public static void main(String[] args) {
		String s = "AB";
		int ans = titleToNumber(s);
		System.out.println("ans is :" + ans );

	}
	
	 public static int titleToNumber(String A) {
		 int ans = 0;
		 int p = 0;
		 for(int i = A.length()-1 ; i >=0 ; i--) {
			 char c = A.charAt(i);
			 int val = (int)c - 65 + 1;
			 ans +=   val *(int) (Math.pow(26, p));
			 p++;
		 }
		 return ans;
		 
	 }

}
