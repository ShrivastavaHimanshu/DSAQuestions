package com.himanshu.advanced.recusrion;

import java.util.Scanner;

public class ReverseStringUsingRecursion {

	public static void main(String[] args) {
		Scanner  sc =  new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		printReverseString(str);

	}

	private static void printReverseString(String str) {
		if (str.length()==0) {
			return;
		}
		System.out.print(str.charAt(str.length()-1));
		printReverseString(str.substring(0,str.length()-1));
		
	}

}
