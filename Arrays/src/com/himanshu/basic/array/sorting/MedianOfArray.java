package com.himanshu.basic.array.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*There are two sorted arrays A and B of sizes N and M respectively.

Find the median of the two sorted arrays ( The median of the array formed by merging both the arrays ).

NOTE:

The overall run time complexity should be O(log(m+n)).
IF the number of elements in the merged array is even, then the median is the average of (n/2)th 
and (n/2+1)th element. For example, if the array is [1 2 3 4], the median is (2 + 3) / 2.0 = 2.5.

*
*/

public class MedianOfArray {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList( 1, 4, 5 );
		List<Integer> b = Arrays.asList( 2, 3 );
		double ans = findMedianSortedArrays(a, b);
		System.out.println("ans is :" + ans);

	}

	private static double findMedianSortedArrays(List<Integer> a, List<Integer> b) {
		double ans = 0.0;
		List<Integer> ansList = new ArrayList<>();
		int n = a.size();
		int m = b.size();
		int p1=0,p2=0, p3=0;
		while(a!=null && b!=null) {
			if(a.get(p1) < b.get(p2)) {
				ansList.set(p3, a.get(p1));
				p1++;
				p3++;
			}else {
				ansList.set(p3, b.get(p2));
				p2++;
				p3++;
			}
		}
		
		
		// A list is bigger 
		
		while(p1<n) {
			ansList.set(p3, a.get(p1));
			p3++;
			p1++;
		}
		
		while(p2<n) {
			ansList.set(p3, b.get(p2));
			p3++;
			p2++;
		}
		
		int size = ansList.size();
		if (size%2==0) {
			ans = ansList.get(size/2)+ansList.get(size/2+1);
		}
		else {
			ans = ansList.get(size/2);
		}
		
		return ans;
	}

}
