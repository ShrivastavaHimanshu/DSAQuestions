/**
 * 
 */
package com.himanshu.heaps;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @author Hshri
 *
 */

//Heap - A Binary tree is said to be heap , if it satisfies following condition
//- It has to be CBT --
//- every node > both children - Max Heap
//- every node < both children - Min Heap 


//A BT is said to be CBT if it satisfies the rules below
//	- All nodes have to be filled level by level from left to right
//  - All the levels should be completely filled except the last level (Not mandatory to be filled)
public class MinAndNaxHeapBasics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// by default priority queue is min heap 
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		 minHeap.add(10);
	     minHeap.add(30);
	     minHeap.add(20);
	     minHeap.add(400);
	     
//	     System.out.println(" min element :" + minHeap.peek());
//	     System.out.println(" delete element is :" + minHeap.remove());
//	     System.out.println(" now min element :" + minHeap.peek());
	     
	     
	     
	     
	     PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
	     maxHeap.add(10);
	     maxHeap.add(30);
	     maxHeap.add(20);
	     maxHeap.add(400);
	     
	     System.out.println(" max element :" + maxHeap.peek());
	     System.out.println(" delete element is :" + maxHeap.remove());
	     System.out.println(" now max element :" + maxHeap.peek());
	     
	}

	
	
	
}
