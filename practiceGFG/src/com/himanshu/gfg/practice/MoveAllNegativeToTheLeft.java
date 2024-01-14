package com.himanshu.gfg.practice;

public class MoveAllNegativeToTheLeft {

	public static void main(String[] args) {
		int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		int ans[] = shuffleArray(arr);
		for(int i : ans) {
			System.out.print(i + ", ");
		}

	}

	private static int[] shuffleArray(int[] arr) {
		int n = arr.length;
		int j = 0, temp;
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				if (i != j) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;

				}
				j++;
			}
		}
		return arr;
	}

}
