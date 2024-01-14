package com.himanshu.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountElements {

	public static void main(String[] args) {
		int a[] = { 2, 1, 4, 10 };
		// 1 2
		// 1 2 3
		int b[] = { 3, 6, 2, 10, 10 };
		// 2 1 4 10

		// 3 , 6 , 2 , 10
		int[] ans = solve(a, b);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	public static int[] solve(int[] a, int[] b) {
		HashMap<Integer, Integer> freqMap = new HashMap<>();

		for (int i = 0; i < a.length; i++) {
			if (!(freqMap.containsKey(a[i]))) {
				freqMap.put(a[i], 1);
			} else {

				int value = freqMap.get(a[i]);
				freqMap.put(a[i], value + 1);
			}
		}

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < b.length; i++) {
			if (freqMap.containsKey(b[i])) {
				int value = freqMap.get(b[i]);
				if (value > 0) {
					list.add(b[i]);
				}
				freqMap.replace(b[i], value, value-1) ;
			}

		}

		int ans[] = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			ans[i] = list.get(i);
		}

		return ans;
	}
}
