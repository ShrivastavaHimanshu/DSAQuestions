package com.himanshu.string;

public class ReverseString {

	public static void main(String[] args) {
		String s = "scaler";
		// string only consists lowercase letters
		String ans = revString(s);
		System.out.println(ans);
		
		
	}

	private static String revString(String s) {
		int n = s.length();
        char [] arr = s.toCharArray();
        for(int i = 0 ; i < n/2; i++){
            char temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        return new String(arr);
	}

}
