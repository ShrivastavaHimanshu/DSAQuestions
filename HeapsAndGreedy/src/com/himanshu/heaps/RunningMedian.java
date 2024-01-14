package com.himanshu.heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class RunningMedian {

	public static void main(String[] args) {
		int arr [] = {1, 2, 5, 4, 3};
		int [] runningMedian = runningMedian(arr);
		for(int i = 0 ; i < runningMedian.length; i++) {
			System.out.print(runningMedian[i] +" ");
		}
		

	}
	/* Algorithm steps 
	 *  So as discussed in class we assume two boxes / parts (max and min heap)
	 *   - Max Element in left <= Min Element in right 
	 *   - SizeOFLeft - SizeOFRight = 1/0
	 *   - If size is 1 means it is odd length array / subarray
	 *      - Median is max of left part 
	 *   - If size is 0 means it is even length array / subarray
	 *      - Median is (MaxOfLeft + MinOFRight) / 2;
	 * 
	 * */
	
	private static int[] runningMedian(int[] arr) {
		int n = arr.length;
		int ans [] = new int [n];
		// Left part means max heap 
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		// right part means min Heap ;
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		
		// first element will always be in left / max heap and that will also be the median for that subbararay
		ans[0] = arr[0];
		maxHeap.add(arr[0]);
		
		for(int i = 1; i < n ; i++) {
			int ele = arr[i];
			// steps -1 insert the element 
			if(ele < maxHeap.peek()) {
				// it means it belong to left / max heap only
				maxHeap.add(ele);
				
			}else {
				minHeap.add(ele);
			}
			
			// Steps -2 comparing the two halves
			
			if(minHeap.size() > maxHeap.size()) {
				// size can be negative , so get min from minHeap and insert into maxHeap
				int minElement = minHeap.peek();
				minHeap.remove(); // delete also this element
				maxHeap.add(minElement);// push into maxHeap to balance it 
			}
			else if (maxHeap.size()-minHeap.size() > 1) {
				// size can be > 1 , so get max from maxHeap and insert into minHeap
				int maxElement = maxHeap.peek();
				maxHeap.remove(); // remove element from maxHeap
				minHeap.add(maxElement);
			}
			// we done with all the steps , simply compare the size of subarrays
			int size = i+1; // for 0 element size would be 1 and so on 
//			if (size % 2 ==0) {
//				// it is even length ,
//				ans[i] = (maxHeap.peek() + minHeap.peek())/2;
//			}
//			else {
//				ans[i] =  maxHeap.peek();
//			}
		
			ans[i] =  maxHeap.peek();
		}
			// as per this question it would be 
//			If the number of elements is N in B and N is odd, then consider the median as B[N/2] ( B must be in sorted order).
//			If the number of elements is N in B and N is even, then consider the median as B[N/2-1]. ( B must be in sorted order).
		
		return ans;
	}

}
