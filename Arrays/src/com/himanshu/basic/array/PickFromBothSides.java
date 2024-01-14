package com.himanshu.basic.array;

/**
 * @author Hshri
 * 
 * this question is about to pick 'B' elements either from left or right 
 * and get the maximum sum of all those elements 
 * 
 * Solution: - So instead of finding this way we can  find min sum of B-1 element 
 * in array in contiguous manner and ans = Total Sum of arary - minSum(B-1)
 *
 */
public class PickFromBothSides {

	public static void main(String[] args) {
		int [] a = {5, -2, 3 , 1, 2};
		int b = 3;
		int ans = solve(a,b);
		System.out.println("ans is :" + ans);

	}

	public static int solve(int[] a, int b) {
		int ans = 0 , sum1 =0 , min1 = 0;
		int remainingElements = 0;
		int n = a.length;
	   //get the sum of elements in array
		 int sum = getSumOfAllElements(a, n);
		 
		 // Get the mimimum sum in contiguous manner for B-1 elements
		 int i =0 , j = n-b-1;
		 for(int k= i; k <=j ; k++) {
			 sum1+=a[k];
			}
		 min1=sum1;
		 i++;
		 j++;
		 while (j < n) {
			 sum1+=a[j]-a[i-1];
			 min1=Integer.min(sum1, min1);
			 i++;
			 j++;
		 }
		System.out.println("min value :" + min1);		
		return (sum-min1);
	}

	public static int getSumOfAllElements(int[] a, int n) {
		int sum = 0;
		for(int i = 0 ; i< n ; i++) {
			sum=sum+a[i];
		}System.out.println("sum is :" + sum);
		return sum;
	}

}
