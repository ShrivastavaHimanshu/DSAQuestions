package com.himanshu.test;

import java.util.HashSet;

public class ValidSudoko {

	public static void main(String[] args) {
		String str[] = {  "....5..1.", ".4.3.....", ".....3..1", "8......2.", "..2.7....", ".15......", ".....2...", ".2.9.....", "..4......"};
		System.out.println(str.length);
		int ans = isValidSudoko(str);
		System.out.println("ans is: " + ans);
	}

	public static int isValidSudoko(String[] str) {
		int length = str.length;
		HashSet<String> seen = new HashSet<>();
		for (int i = 0; i < length; i++) {
			String word = str[i];
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(j) != '.') {
					String row = word.charAt(j) + " row " + i;
					String col = word.charAt(j) + " col " + j;
					String box = word.charAt(j) + " box " + i / 3 + "and" + j / 3;
					if ((seen.contains(box)  || seen.contains(col) || seen.contains(row))) {
						return 0;
					} else {
						seen.add(row);
						seen.add(col);
						seen.add(box);
					}
				}

			}
		}
		return 1;
	}

}
