package com.himanshu.linkedList.advanced;

public class PalindromeList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next=new ListNode(2);
		head.next.next.next=new ListNode(2);
		head.next.next.next.next=new ListNode(1);
		
		
		//printLinkedList(head);
		int ans = lPalin(head);
		
		System.out.println(" ans is : " + ans);

	}

	private static int lPalin(ListNode head) {
		// 1 -> 1 -> 6 -> 4 -> 1 
		if (head == null || head.next == null) {
			return 1;
		}
		
		ListNode current = head ;
		
		ListNode mid = getMid(head);
		
		ListNode newHead = mid.next;
		
		mid.next = null;
		
		ListNode reverseHead = reverseList(newHead);
		
		while(head !=null && reverseHead !=null) {
			if (head.data != reverseHead.data) {
				return 0;
			}
			head = head.next;
			reverseHead=reverseHead.next;
		}
		
		return 1;
		
		
	}

	private static ListNode getMid(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		// 1-. 2-> 3->4->5->6
		while(fast.next != null && fast.next.next !=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	private static ListNode reverseList(ListNode head) {
		ListNode h1 = head , h2 = null , t = head;
		while(h1 !=null ) {
			t = t.next;
			h1.next = h2;
			h2=h1;
			h1=t;
		}
		return h2;
	}
	
	private static void printLinkedList(ListNode nodes) {
		while(nodes!=null) {
			System.out.print(nodes.data + "->");
			nodes=nodes.next;
		}
		
	}

	
//	ListNode current = head;
//	
//	ListNode reverseHead = reverseList(current);
//	printLinkedList(head);
//	System.out.println(" revsre LL ");
//	printLinkedList(reverseHead);
//	while(head != null && reverseHead !=null) {
//		if (head.data != reverseHead.data) {
//			System.out.println("inside");
//			return 0;
//		}
//		head = head.next;
//		reverseHead=reverseHead.next;
//	}
//	return 1;
	
}
