package com.himanshu.linkedList.advanced;

import java.util.List;

public class RemoveNthNodefromListEnd {

	public static void main(String[] args) {
	
		int n = 5;
		ListNode nodes = createLinkedList(n);
//		int b = 2 ;
//		ListNode ans = removeNthFromEnd(nodes , b);
//		printLinkedList(ans);
		
		function( nodes);

	}

	private static void function(ListNode x) {
		x = x.next;
		while( x!= null) {
			if(x.next== null) {
				System.out.println(x.data);
			}
			x = x.next;
		}
		
		
	}

	private static ListNode removeNthFromEnd(ListNode head, int b) {
		
		int sizeLL = getSize(head);
		if (sizeLL ==1 && b==1) {
			return null;
		}
		if (b > sizeLL) {
			head = head.next;
		}else {
			// 1 -> 2 -> 3 -> 4 -> 5 
			ListNode current = head;
			int pos = sizeLL-b;
			if (pos == 0 ) {
				return head.next;
			}else {
				ListNode prev = head;
				ListNode after = null;
				ListNode temp = head;
				while(pos > 1) {
					prev = prev.next;
					pos--;
				}
				if (prev.next != null) {
					after = prev.next.next;
				}else {
					after = null ;
				}
				prev.next = after;
				
			}
		}
		return head;
		
		
	}

	
	
	
	private static int getSize(ListNode head) {
		int count = 0 ;
		while(head !=null) {
			head=head.next;
			count++;
		}
		return count;
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
		while(nodes.next!=null) {
			System.out.print(nodes.data + "->");
			nodes=nodes.next;
		}
		
	}

}
