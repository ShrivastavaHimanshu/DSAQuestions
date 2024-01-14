package com.himanshu.linkedList.advanced;

public class ReverseLinkedList {

	public static void main(String[] args) {
		int n = 5;
		ListNode nodes = createLinkedList(n);
		ListNode reverseLinkedList = reverseList1(nodes);
		while(reverseLinkedList!=null) {
			System.out.print(reverseLinkedList.data + ",");
			reverseLinkedList=reverseLinkedList.next;
		}

	}

	
	private static void printLinkedList(ListNode nodes) {
		while(nodes!=null) {
			System.out.print(nodes.data + ",");
			nodes=nodes.next;
		}
		
	}


	private static ListNode reverseList(ListNode nodes) {
		//1 -> 2 -> 3 -> 4 -> 5
		ListNode head = nodes;
		ListNode h2 = null;
		while( head != null) {
			ListNode temp = head;
			head = head.next;
			temp.next = h2;
			h2 = temp;
			
		}
		return h2;
		
		
		
	}

	private static ListNode reverseList1(ListNode nodes) {
		ListNode head = nodes ;
		ListNode h2 = null;
		// 1 -> 2 -> 3 -> 4 -> 5
		while(head != null) {
		  ListNode temp = head;
		  head = head.next;
		  temp.next = h2;
		  h2 = temp;
		}
		return h2;
	}
	private static ListNode createLinkedList(int n) {
		ListNode head = new ListNode(1);
		ListNode temp = head;
		for(int i = 2 ; i <=n ; i++) {
			temp.next=new ListNode (i);
			temp=temp.next;
		}
		return head;
	}
	
}

//
//		ListNode head = nodes;
//		ListNode h2 = null;
//		 while(head != null) {
//			  ListNode temp = head;
//			  head = head.next;
//			  temp.next = h2;
//			  h2 = temp ;
//		 }
//		
//		 return h2;
