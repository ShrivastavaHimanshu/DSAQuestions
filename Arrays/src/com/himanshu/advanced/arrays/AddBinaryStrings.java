package com.himanshu.advanced.arrays;

public class AddBinaryStrings {

	public static void main(String[] args) {
		String a = "1";
		String b = "1";
		String ans = addBinary(a, b);
		System.out.println("ans is: " + ans);

	}

	private static String addBinary(String a, String b) {
		StringBuilder ans = new StringBuilder();
		int carry = 0;
		int index1 = a.length()-1;
		int index2 = b.length()-1;
		while(index1 >=0 || index2 >= 0 || carry!=0) {
			int num1 = 0;
			 
			if (index1>=0) {
				num1 =a.charAt(index1)-'0';
				System.out.println("num 1 :" + num1);
				index1--;
			}
			int num2 = 0;
			if(index2 >=0) {
				num2=b.charAt(index2)-'0';
				System.out.println("num 2 :" + num2);
				index2--;
			}
			
			int sum = num1+num2+carry;
			int digit = sum %2;
			char num = (char)(digit+'0');
			carry = sum /2;
			ans.append(num);
		}
		return ans.reverse().toString();
	}

}
