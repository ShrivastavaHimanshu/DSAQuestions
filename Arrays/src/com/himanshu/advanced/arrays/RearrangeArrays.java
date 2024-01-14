package com.himanshu.advanced.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArrays {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4, 0, 2, 1, 3);
		arrange(list);

	}

	public static void arrange(List<Integer> a) {
		int n = a.size();

		// Mutiply the all emenets with n

		for (int i = 0; i < n; i++) {

			a.set(i, (a.get(i) * n));
		}

		for (int i = 0; i < n; i++) {
			int index = a.get(i) / n;
			int value = a.get(index) / n;
			int element = a.get(i);
			a.set(i, (element + value));
		}

		// iterate and simple do %n

		for (int i = 0; i < n; i++) {
			int value = a.get(i);
			a.set(i, (value % n));
		}

		for (int i : a) {
			System.out.print(i + " ");
		}

	}

}
