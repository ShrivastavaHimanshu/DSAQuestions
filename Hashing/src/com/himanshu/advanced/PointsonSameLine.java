package com.himanshu.advanced;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PointsonSameLine {

	public static void main(String[] args) {
		int[] A = { 6, -7, 5, 9, -9, -7 };
		int[] B = { 7, 5, 5, 9, -8, 2 };
		int ans = solve(A, B);
		System.out.println(" count is : " + ans);

	}

	private static int solve(int[] a, int[] b) {
		int count = 0;
		Set<pair> set = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			set.add(new pair(a[i], b[i]));
		}

		for (int i = 0; i < a.length; i++) {
			int x1 = a[i], y1 = b[i];
			if (x1 == y1) {
				count++;
			}

			// Forming and Checking for x2

			// int x2 = x1+1 , y2 = y1+1;

			pair p = new pair((x1 + 1), (y1 + 1));

			if (set.contains(p)) {

				count = count + 2;
			}
		}

		return count;
	}

}
//System.out.println(" pair is : " + p.x + " " + p.y);
//System.out.println(" x2 is : " + x2 + " y2 is :" + y2);