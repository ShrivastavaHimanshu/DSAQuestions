package com.himanshu.linkedList.advanced;

public class MiddleElementOfLinkedList {

	public static void main(String[] args) {
		int n = 6;
		//ListNode nodes = createLinkedList(n);
		
		ListNode head = new ListNode (35);
		head.next = new ListNode(95);
		
		int middleElement = solve(head);
		System.out.println("ans is : " + middleElement);

	}
	
	/* the fast pointer jumps 2 at a time while
	the slow pointerjumps 1 at a time, so basically
	when fast pointer reaches the end, slow is in middle.
	/


	/ i added 2 conditions in while
	fast!=null for cases where odd cases
	fast.next!=null for even cases  
	
	*/

	private static int solve(ListNode nodes) {
		if (nodes==null) {
			return nodes.data;
		}
		
		ListNode slow = nodes;
		ListNode fast = nodes;
		
		while(fast !=null && fast.next !=null) {
			slow=slow.next;
			fast = fast.next.next;
		}
		
		int ans = slow.data;
		
		return ans;
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
