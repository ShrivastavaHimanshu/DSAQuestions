package com.himanshu.linkedList.advanced;

public class ReverseLinkedListTwo {

	public static void main(String[] args) {
		int n = 6 ;
		ListNode node = createLinkedList(6);
		int B = 2 ;
		int C = 4 ;
		ListNode ans = reverseBetween(node , B , C); 
		printLinkedList(node);
		

	}
 
	private static ListNode reverseBetween(ListNode node, int b, int c) {
		// 1 -> 2-> 3 -> 4 -> 5 -> 6
		
		ListNode current = node ;
		int count = 0 ;
	
		ListNode first = null , from = null , to = null , last = null;
		
		while(current != null ) {
			
			count +=1 ;
			if (count < b) {
				first = current ;
			}
			
			if (count == b) {
				from = current ;
			}
			
			if (count == c) {
				to = current ;
				last = to.next;
				break;
			}
			
			current = current.next;
		}
		
		// setting to.next = null , because we wants to reverse that list starting from 
		
		to.next = null ;
		reverseLinkedList(from);
		
		
		if (first != null) {
			first.next = to ;
		}
		
		if (last!= null) {
			 from.next = last ;
		}
		
		return node ;
	}
	// 1 -> 2-> 3 -> 4 -> 5 -> 6
	private static ListNode reverseLinkedList(ListNode temp) {
		
		ListNode h1 = temp;
		ListNode h2 = null;
		
		
		while (h1 != null) {
			ListNode t = h1;
			h1 = h1.next;
			t.next = h2 ;
			h2=t;
			
		}
		
		return h2;
	}

	private static ListNode createLinkedList(int n) {
		ListNode head = new ListNode(1);
		ListNode temp = head ;
		for(int i = 2 ; i <= n ; i++) {
			temp.next = new ListNode(i);
			temp = temp.next;
		}
		return head;
	}
	
	private static void printLinkedList(ListNode nodes) {
		while(nodes!=null) {
			System.out.print(nodes.data + ",");
			nodes=nodes.next;
		}
		
	}

}
