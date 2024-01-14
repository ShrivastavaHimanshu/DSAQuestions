package com.himanshu.basic.array;

public class LongestConsecutiveOnesLength {

	public static void main(String[] args) {
		String A = "010100110101";
		// System.out.println(A.length());
		int ans = solve(A);
		System.out.println("ans is :" + ans);

	}

	private static int solve(String a) {
		int ans = 0, n = a.length(), left_count = 1, right_count = 1, countOnes = 0, countZeros = 0;

		// iterating a string and storing left consecutive Ones
		int[] leftOnesCount = new int[a.length()];

		for (int i = 0; i < n; i++) {
			if (a.charAt(i) == '1') {
				leftOnesCount[i] = left_count++;
				countOnes++;
			} else if (a.charAt(i) != '1') {
				leftOnesCount[i] = 0;
				countZeros++;
				left_count = 1;
			}
			// System.out.print(leftOnesCount[i] + " ");
		}

		// iterating a string from right and storing right consecutive Ones
		int[] rightOnesCount = new int[a.length()];

		for (int i = n - 1; i >= 0; i--) {
			if (a.charAt(i) == '1') {
				rightOnesCount[i] = right_count++;
			} else if (a.charAt(i) != '1') {
				rightOnesCount[i] = 0;
				right_count = 1;
			}
			System.out.print(rightOnesCount[i] + " ");
		}
		System.out.println("count 1's :" + countOnes);
		if (countOnes == n) {
			return n;
		}
		if (countZeros == 1) {
			return n - 1;
		}

		int tempAns = 0;
		for (int i = 0; i < n; i++) {
			if (a.charAt(i) == '0' && i == 0) {
				tempAns = rightOnesCount[i + 1];
			} else if (a.charAt(i) == '0' && i == n - 1) {
				tempAns = leftOnesCount[i - 1];
			} else if (a.charAt(i) == '0') {
				if (leftOnesCount[i - 1] + rightOnesCount[i + 1] < countOnes)
					tempAns = leftOnesCount[i - 1] + rightOnesCount[i + 1] + 1;
				else {
					tempAns = leftOnesCount[i - 1] + rightOnesCount[i + 1];
				}
			}
			ans = Integer.max(tempAns, ans);
		}

		return ans;

	}

}
