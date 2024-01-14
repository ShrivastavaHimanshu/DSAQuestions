package com.himanshu.linkedList.advanced;

public class Kreverselinkedlist {

	public static void main(String[] args) {
		int n = 6;
		ListNode nodes = createLinkedList(n);
		int b = 2 ;
		ListNode ans = reverseList(nodes , b);
		printLinkedList(ans);

	}

	private static ListNode reverseList(ListNode head, int b) {
		ListNode h1 = head , h2 = null , h3 = head , t = head;
		if (head == null || b ==0) {
			return head;
		}
		int tempB = b;
		while(b > 0 && h1 !=null) {
			t = h1;
			h1 = h1.next;
			t.next = h2;
			h2 = t;
			b--;
		}
		h3.next=reverseList(h1, tempB);
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

	
	private static void printLinkedList(ListNode nodes) {
		while(nodes!=null) {
			System.out.print(nodes.data + ",");
			nodes=nodes.next;
		}
		
	}
	
}
