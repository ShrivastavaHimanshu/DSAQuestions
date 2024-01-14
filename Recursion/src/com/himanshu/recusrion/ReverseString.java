package com.himanshu.recusrion;

import java.util.Scanner;

public class ReverseString {

	
	public static int fun(int x , int n) {
		if (n==0) {
			return 1;
		}
		else if (n%2==0) {
			return fun(x*x, n/2);
		}else {
			return x * fun(x*x, (n-1)/2);
		}
	}
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		//System.out.println("Enter the string");
//		String str = sc.next();
//		int n = str.length();
//		int start = n-1;
//		reverseString(str, start);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = fun(2, 10);
		System.out.println(ans);
		System.out.println(2/10);
		
		
	}

	public static void reverseString(String str, int start) {
		if (start==0) {
			System.out.print(str.charAt(start));
			return;
		}
		System.out.print(str.charAt(start));
		reverseString(str, start-1);
	}


	
	
	


}
