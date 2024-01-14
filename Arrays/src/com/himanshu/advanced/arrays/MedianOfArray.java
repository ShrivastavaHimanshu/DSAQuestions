package com.himanshu.advanced.arrays;

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
		List<Integer> a = Arrays.asList( 1, 2, 3 );
		List<Integer> b = Arrays.asList( 4);
		//double ans = BruteForce(a, b);
		double ans = optimalApproach(a,b);
		System.out.println("ans is :" + ans );

	}

	private static double optimalApproach(List<Integer> a, List<Integer> b) {
		int n1=  a.size();
		int n2 = b.size();
		 if (n1 > n2)
	            return optimalApproach(b, a);
		int l = 0 , h = n1;
		while(l <=h) {
			int cut1 = (l+h)/2;
			int cut2 = (n1+n2+1)/2-cut1;
			// calcaulating l1,l2,r1,r2
			
			int l1 = cut1==0?Integer.MIN_VALUE : a.get(cut1-1);
			int l2 = cut2==0?Integer.MIN_VALUE : b.get(cut2-1);
			
			int r1 = cut1==n1?Integer.MAX_VALUE : a.get(cut1);
			int r2 = cut2==n2?Integer.MAX_VALUE : b.get(cut2);
			
			if (l1>r2) {
				h = cut1-1;
			}
			else if (l2>r1) {
				l=cut1+1;
			}
			
			int size = n1+n2;
			if (size%2==0) {
				double value= Math.max(l1, l2)+Math.min(r2, r1);
				System.out.println("value is :" + value);
				return value/2;
			}
			else {
				return Integer.max(l1, l2);
			}
			
		}
		return 0;
	}

	private static double BruteForce(List<Integer> a, List<Integer> b) {
		double ans = 0.0;
		List<Integer> ansList = new ArrayList<>();
		int n = a.size();
		int m = b.size();
		int p1=0,p2=0, p3=0;
		while(p1<n && p2<m) {
			if(a.get(p1) < b.get(p2)) {
				ansList.add(a.get(p1));
				p1++;
			
			}else {
				
				ansList.add(b.get(p2));
				p2++;
				
			}
		}
		
		
		// A list is bigger 
		
		while(p1<n) {
			
			ansList.add(a.get(p1));
			p3++;
			p1++;
		}
		
		while(p2<m) {
			
			ansList.add(b.get(p2));
			p3++;
			p2++;
		}
		
		int size = ansList.size();
		if (size%2==0) {
			double value = (ansList.get(size/2)+ansList.get((size/2)-1));
			ans = value/2;
		}
		else {
			ans = ansList.get(size/2);
		}
		
		return ans;
	}

}
