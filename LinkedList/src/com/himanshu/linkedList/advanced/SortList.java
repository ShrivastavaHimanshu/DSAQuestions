package com.himanshu.linkedList.advanced;

public class SortList {

	public static void main(String[] args) {
		ListNode head = new ListNode(5);
		head.next = new ListNode(3);
		head.next.next=new ListNode(2);
		head.next.next.next=new ListNode(8);
		
		
		ListNode ans = sortList(head);
		
		printLinkedList(ans);
		

	}
	
	
	
	private static ListNode sortList(ListNode head) {
		
		if (head == null || head.next ==null) {
			return head;
		}
		
		// Will do merge sorting here 
		
		// 1: We need to break into 2 parts , so find mid/center
		
		ListNode h1 = head ;
		
		ListNode center = center(h1);
		
		// Splitting into two separate LL 
		ListNode h2 = center.next;
		center.next = null;
				
		// Calling recursion on both the halves
		
		h1 = sortList(h1);
		h2 = sortList(h2);
		
		return merge(h1, h2);
		
		
	}



	private static ListNode merge(ListNode h1, ListNode h2) {
		if (h1 == null ) { return h2 ;}
		if (h2 ==null) { return h1; }
		ListNode h3 = null , l = null;
		
		if (h1.data < h2.data) {
			h3 = h1 ;
			l=h1;
			h1=h1.next;
		}else {
			h3 = h2 ;
			l=h2;
			h2=h2.next;
		}
		
		while(h1 !=null && h2 !=null) {
			
			if (h1.data < h2.data) {
				// Adding h1 in last node 
				l.next = h1;
				h1=h1.next;
				l = l.next;
			}
			else {
				// Adding h2 in last Node
				
				l.next = h2;
				h2 = h2.next;
				l = l.next;
			}
		}
		
		// Add simple which ever is not null
		
		l.next = h1==null ? h2 : h1;
		
		return h3;
	}



	private static ListNode center(ListNode h1) {
		ListNode head = h1;
		int sizeLL = getSize(head);
		int mid = sizeLL/2;
		while(mid > 1) {
			head = head.next;
			mid--;
		}
		return head;
	}



	private static int getSize(ListNode h1) {
		int count = 0 ;
		while( h1 != null) {
			count+=1;
			h1=h1.next;
		}
		return count;
	}



	private static void printLinkedList(ListNode nodes) {
		while(nodes!=null) {
			System.out.print(nodes.data + "->");
			nodes=nodes.next;
		}
		
	}
	
}
