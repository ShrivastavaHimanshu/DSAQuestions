package com.himanshu.linkedList.advanced;

public class LongestPalindromeList {

	public static void main(String[] args) {
		ListNode head = new ListNode(2);
		head.next = new ListNode(3);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(3);
		head.next.next.next.next=new ListNode(3);
		
		
		//printLinkedList(head);
		int ans = lPalin(head);
		
		System.out.println(" ans is : " + ans);

	}

	private static int lPalin(ListNode head) {
		if (head == null || head.next == null) {
			return 1;
		}
		
		
		
		ListNode p1 , p2 =null;
		ListNode mid = getMid(head);
		p1 = reverseList(mid) ;
		p2 = mid.next;
		mid.next = null;
		
		int size = getSize(head);
		if (size % 2 != 0) {
			p1 = p1.next;
		}
		// 2 -> 3-> 3-> 3-> 3 
		int count = 0;
		while(p1 != null && p2 != null) {
			if (p1.data == p2.data) {
					count++;
			}
			p1 = p1.next;
			p2 = p2.next;
		}
		
		
		
		
		
		}
	
		return length;
		
		
	}

	private static int getSize(ListNode head) {
		int count = 0;
		while(head != null) {
			count+=1;
		}
		return count;
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


}
