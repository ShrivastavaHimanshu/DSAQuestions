package com.himanshu.bitmanipulation;

/*
 *	You have an array A with N elements. We have two types of operation available on this array :
	We can split an element B into two elements, C and D, such that B = C + D.
	We can merge two elements, P and Q, to one element, R, such that R = P ^ Q i.e., XOR of P and Q.
	You have to determine whether it is possible to convert array A to size 1, containing a single element 
	equal to 0 after several splits and/or merge?
 */
public class InterestingArray {

	public static void main(String[] args) {
		int a [] = {9650, 8208, 5737, 4539, 6893,  2903, 5284, 9419, 4591, 6034, 2003, 2420, 5058, 4876, 8259, 9205, 4797, 1819, 4618, 3871, 1167, 5862, 298, 9396, 6924, 9989, 3346, 2958, 1620, 2461, 731, 9769, 565, 6382, 9425, 6901, 4233, 1687, 3159, 3932, 198, 2355, 7501, 1466, 8881, 9387, 9254, 3023, 62, 75, 8489, 7403, 1982, 7058, 2290, 5542, 5023, 7218, 4292, 4082, 737, 912, 5741, 1297, 1354, 7655, 6994, 732, 1950, 2357, 7475, 8523, 8118, 5196, 8599, 5350, 3309, 2278, 3537, 1111, 4735, 62, 1012, 4163, 9058, 1789, 6032, 1748, 7169, 6797, 3237, 8110, 3734, 5607, 7474, 3223, 3420, 6228, 7265};
		String ans = solve(a);
		System.out.println("ans is " + ans);

	}

	public static String solve(int[] a) {
		int countOfEvenIndexes = 0 , countOfOddIndexes = 0 , n = a.length;
		for(int i = 0 ; i < n ; i++) {
			if(a[i]%2==0) {
				countOfEvenIndexes++;
			}
			if (a[i]%2==1) {
				countOfOddIndexes++;
			}
		}
		System.out.println("odd :" + countOfOddIndexes + " even is :" + countOfEvenIndexes);
		int diff = countOfEvenIndexes-countOfOddIndexes;
		if (n%2==0 && countOfEvenIndexes==0&& countOfOddIndexes%2==0||
				n%2==0 && countOfOddIndexes==0 && countOfEvenIndexes%2==0) {
			return "Yes";
		}
		else if (countOfEvenIndexes%2==1 || countOfOddIndexes%2==1) {
			return "No";
		}
		else if (countOfEvenIndexes == countOfOddIndexes || Math.abs(diff)%2==0)
				 {
			return "Yes";
		}
		return "No";
	}

}
