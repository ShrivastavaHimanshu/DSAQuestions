package com.himanshu.basic.array.sorting;

import java.util.Arrays;
import java.util.Collections;

public class NobelInteger {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 3 };

		int ans = checkNobleInteger(arr);
		System.out.println("ans is :" + ans);

	}

	public static int checkNobleInteger(int[] arr) {
		int n = arr.length;
		Integer[] a = new Integer[n];
		for (int i = 0; i < n; i++) {

			a[i] = arr[i];
		}

		Arrays.sort(a, Collections.reverseOrder());

		int ans = 0;
		int more = 0;
		if (a[0] == 0)
			ans++;
		for (int i = 1; i < n; i++) {

			if (a[i] != a[i - 1]) {
				more = i;
			}

			if (more == a[i]) {
				ans++;
			}
		}
		if (ans > 0) {
			return 1;
		}
		return -1;
	}

}
