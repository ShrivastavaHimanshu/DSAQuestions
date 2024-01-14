package com.himanshu.advanced.arrays;

public class DeleteOneGCD {

	public static void main(String[] args) {
		int a[] = {208610688, 48106344, 135402124, 34168992, 95013776, 35218040, 117231114, 172905590, 66652014, 45970782, 222323244, 203402914, 35292972, 159829956, 154584716, 107190226, 71335264, 42786172, 203327982, 3484338, 28062034, 64179258, 210993, 94938844, 155858560, 123562868, 223447224, 116744056, 55711942, 88082566, 45671054, 16072914, 165299992, 136601036, 44659472, 219063702, 202953322, 188341582, 116931386, 127759060, 131318330, 49867246, 92278758, 40875406, 218314382, 135889182, 6893744, 97111872, 56236466, 96662280, 52340002, 195010530, 44884268, 167435554, 155746162, 201679478, 54138370, 103481092, 25814074, 186093622, 208498290, 31883566, 122101694, 128058788, 133566290, 55749408, 178675354, 186056156, 155071774, 35180574, 82050540, 7755462, 29448276, 100333948, 130156884, 67850926, 44509608, 17084496, 216703344, 197295956, 174479162, 18058612, 51290954, 173917172, 51815478, 218426780, 184032992, 148140564, 108951128};
		// 12 - 2, 2, 3
		// 15 - 3 , 5
		// 18 - 2, 3, 3
		int ans = solve(a);
//		int gcd = gcd(12, 18);
//		System.out.println("gcd is :" + gcd);
		System.out.println("ans is :" + ans);

	}

	private static int solve(int[] a) {
		int ans = Integer.MIN_VALUE;
		int suffixGCD[] = suffixGCD(a);
		int prefixGCD[] = prefixGCD(a);

		int n = a.length;
		for (int i = 0; i < n; i++) {
			int tempAns = 0;
			if (i == 0) {
				tempAns = suffixGCD[i + 1];
			} else if (i == n - 1) {
				tempAns = prefixGCD[i - 1];
			} else {

				int x = prefixGCD[i - 1];
				int y = suffixGCD[i + 1];

				tempAns = gcd(x, y);
			}

			ans = Math.max(ans, tempAns);
		}

		return ans;
	}

	// Creating a suffix GCD Array 
	private static int[] suffixGCD(int[] a) {
		int n = a.length;
		int[] suffixGCD = new int[n];
		suffixGCD[n - 1] = a[n - 1];
		for (int i = n - 2; i >= 0; i--) {

			suffixGCD[i] = gcd(a[i], a[i + 1]);
		}
		return suffixGCD;
	}

	
	// Creating a Prefix GCD Array
	private static int[] prefixGCD(int[] a) {
		int prefixGCD[] = new int[a.length];
		prefixGCD[0] = a[0];
		for (int i = 1; i < a.length; i++) {

			prefixGCD[i] = gcd(a[i], a[i - 1]);
		}
		return prefixGCD;
	}

	private static int gcd(int i, int j) {
		int a = Math.max(i, j);
		int b = Math.min(i, j);
		if(b==0) return a;
		return gcd (b , a%b);
	}

}
//	System.out.println("suffix Array ");
//for (int i = 0; i < suffixGCD.length; i++) {
//	System.out.print(suffixGCD[i] + " ");
//}
//System.out.println(" ");
//System.out.println("prefix Array");
//
//
//
//for (int i = 0; i < prefixGCD.length; i++) {
//	System.out.print(prefixGCD[i] + " ");
//}
//System.out.println(" ");
//int maxElement = Math.max(prefixGCD[i-1], suffixGCD[i+1]);
//int minElement = Math.min(prefixGCD[i-1], suffixGCD[i+1]);
//System.out.println("X is :" + x  + " "+ "i " + i + " Y is :" + y);