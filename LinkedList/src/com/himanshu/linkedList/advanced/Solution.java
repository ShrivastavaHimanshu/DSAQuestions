package com.himanshu.linkedList.advanced;

import java.util.HashMap;
import java.util.Map;

class Node {
	int key;
	int val;
	Node next;
	Node prev;

	Node(int key, int val) {
		this.key = key;
		this.val = val;
		this.next = null;
		this.prev = null;
	}
}

public class Solution {
	// dummy node to point to take care of edge cases
	private Node dummy;

	// at start, head and tail points to dummy node
	Node head, last = null;

	// maximum capacity of cache

	private int capacity;

	// hashMap of key and reference to the node
	// hashmap is taken to find if data is present in O(1) time
	private Map<Integer, Node> hm;

	public Solution(int capacity) {
		this.capacity = capacity;
		this.hm = new HashMap<>();
		this.dummy = new Node(-1, -1);
		this.head = dummy;
		this.last = dummy;
	}

	public int get(int key) {
		// Check whether key is present in hashmap or not
		if (hm.containsKey(key)) {
			// get reference of that node from hashmap
			Node node = hm.get(key);

			// get data for that node ;

			int val = node.val;

			// There are two possibilties if it is at already last position , nothing to do

			// for that simply check node->next should be null // so will check only when it
			// is not null

			if (node.next != null) {
				// remove the node from current location
				remove(node);
				// again insert at back to make it recently used
				insertAtBack(node);
			}
			return val;
		}
		// return -1 if key is not present in the map
		return -1;

	}

	private void insertAtBack(Node node) {
		last.next = node;
		node.prev = last;
		node.next = null;
		last = node;

	}

	public void set(int key, int value) {
		if (hm.containsKey(key)) {
			// get reference of that node from hashmap
			Node node = hm.get(key);

			// set new value inside node

			node.val = value;

			// There are two possibilties if it is at already last posistion , nothing to do

			// for that simply check node->next should be null // so will check only when it
			// is not null

			if (node.next != null) {
				// remove the node from current location
				remove(node);
				// again insert at back to make it recently used
				insertAtBack(node);
			}
		} else {
			// create new node
			Node newnode = new Node(key, value);
			hm.put(key, newnode);
			if (hm.size() > capacity) {
				hm.remove(head.next.key);
				// remove from LL as well

				remove(head.next);

			}
			

			// simply insert at the end

			insertAtBack(newnode);

		}

	}

	public void remove(Node node) {
		node.prev.next = node.next;
//		if (node == last || node.next == null) {
//			// adjust the last pointer
//			last = node.prev;
//		} else {
			node.next.prev = node.prev;
		//}

	}

	public static void main(String[] args) {
		Solution cache = new Solution(2);
		cache.set(1, 10);
		cache.set(5, 12);
		System.out.println(cache.get(5));

	}

}
