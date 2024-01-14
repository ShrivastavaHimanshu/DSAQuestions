/**
 * 
 */
package com.himanshu.advanced.twopoirnters.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an one-dimensional integer array A of size N and an integer B.
Count all distinct pairs with difference equal to B.
Here a pair is defined as an integer pair (x, y), where x and y are both numbers in the array 
and their absolute difference is B.
 *
 */
public class PairswithGivenDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr [] = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		int b = 0;
		int ans = solve(arr, b);
		System.out.println("ans is :" + ans);

	}
// Algo:-
/*
* 1 : Create a MAP and store all the element with their Frequency 
* 2 : remove all the duplicates from map as we need only distinct pairs
* 3 : Iterate a loop and check if their exists a (A[i]+B) --> yes then Count++
* 4 : edge Case if B==0 then simply check , if any element has frequency more than 1 . count ++;
*  beacuse same element gets difference is 0
*
*
*/
private static int solve(int[] arr, int b) {
	Map<Integer, Integer> m = new HashMap<>();
	int count = 0;
	int n = arr.length;
	for (int i = 0; i < n; i++) {
		if (m.containsKey(arr[i])) {
			int value = m.get(arr[i]);
			m.put(arr[i], value+1);
		} else {
			m.put(arr[i], 1);
		}
	}

	for (Integer i : m.keySet()) {
		if (b == 0) {
			if (m.get(i) > 1) {
				count++;
			}
		} else {
			if (m.containsKey(i + b)) {
				count++;
			}
		}

	}

	return count;
}

}


//int checkCount = 0;
//for(Map.Entry<Integer, Integer> entry : m.entrySet()) {
//	System.out.println("key is :" + entry.getKey() + " value is :" + entry.getValue());
//} 
//