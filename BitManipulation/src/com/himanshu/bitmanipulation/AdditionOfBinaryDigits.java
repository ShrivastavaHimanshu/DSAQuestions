package com.himanshu.bitmanipulation;

public class AdditionOfBinaryDigits {

	public static void main(String[] args) {
		String a = "100";
		String b = "11";
		String ans = addBinary(a, b);
		System.out.println("ans is : " + ans);

	}

	public  static String addBinary(String a, String b) {
		String result = "";
		int aLength = a.length();
		int bLength = b.length();
		int i =0 , carry = 0;
		while( i < aLength || i < bLength || carry !=0) {
			int x = 0;
			if(i < aLength && a.charAt((aLength-1)-i)=='1') x=1;
			int y = 0;
			if(i < bLength && b.charAt((bLength-1)-i)=='1') y=1;
			result = (carry+x+y)%2+result;
			carry = (x+y)/2;
			i++;
		}
		return result;
	}

}
