package com.himanshu.basic.carryforward.array;

public class AmazingStringCount {

	public static void main(String[] args) {
		String s = "ABC";
		int ans = solve(s);
		System.out.println("ans is :" + ans);
		

	}

	public static int solve(String s) {
		int m = 10003;
		int n = s.length(), ans = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E'
					|| s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u' || s.charAt(i) == 'U') {
				ans += n - i;
			}
		}
		return ans % m;
	}

}
