package com.himanshu.basic.array;

public class RotateArrayLeft {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 2, 3 };
		int[][] result = solve(a, b);
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static int[][] solve(int[] a, int[] b) {
		int rows = b.length;
		int cols = a.length;
		int[][] res = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			int numberOfRotations = b[i];
			int arr[] = new int[a.length];
			for (int k = 0; k < a.length; k++) {
				arr[k] = a[k];
			}
			int[] rotatedArray = rotateLeft(arr, numberOfRotations);

			for (int j = 0; j < cols; j++) {
				res[i][j] = rotatedArray[j];
			}

		}

		return res;
	}

	public static int[] rotateLeft(int[] arr, int d) {
		int n = arr.length;
		if (d > n) {
			d = d % n;
		}
		int[] tempArray = new int[d];
		for (int i = 0; i < d; i++) {
			tempArray[i] = arr[i];
		}
		for (int i = d; i < n; i++) {
			arr[i - d] = arr[i];
		}

		// Copying the tempArray array element in original array
		for (int i = 0; i < d; i++) {
			arr[i + n - d] = tempArray[i];
		}

		return arr;
	}

}
