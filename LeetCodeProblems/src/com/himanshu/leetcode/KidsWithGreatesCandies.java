package com.himanshu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatesCandies {

	public static void main(String[] args) {
		int[] a = { 4, 2, 1, 1, 2 };
		int b = 1;
		List<Boolean> listans = kidsWithCandies(a, b);
		for (int i = 0; i < listans.size(); i++) {
			System.out.print(listans.get(i) + " ");
		}
	}

	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> kids_Candies_List = new ArrayList<Boolean>();
		int maxValue = Integer.MIN_VALUE;
		for (int i = 0; i < candies.length; i++) {
			if (candies[i] > maxValue) {
				maxValue = candies[i];
			}
		}

		for (int i = 0; i < candies.length; i++) {
			if (candies[i] + extraCandies >= maxValue) {
				kids_Candies_List.add(true);
			} else {
				kids_Candies_List.add(false);
			}
		}

		return kids_Candies_List;
	}

}
