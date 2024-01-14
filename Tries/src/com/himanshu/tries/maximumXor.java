package com.himanshu.tries;

import java.util.PriorityQueue;

class Trieroot{
	
	Trieroot[] children ;
	public Trieroot() {
		children = new Trieroot [2];
	}
	
}
public class maximumXor {

	public static void main(String[] args) {
		int arr [] = {1, 2, 3, 4, 5};
		int ans = maximumXOR(arr);
		System.out.println(" ans is : " + ans);
		

	}

	private static int maximumXOR(int[] arr) {
		Trieroot root = new Trieroot();
		int n = arr.length ;
		int maxXOR = Integer.MIN_VALUE;
		for(int i = 0 ; i < n ; i++) {
			//insert 
			int xor = insert(root,arr[i]);
			maxXOR = Math.max(maxXOR, xor);
		}
		return maxXOR;
	}



	private static int insert(Trieroot root, int num) {
		//STEP 1: ADD THE NUMBER//
        Trieroot curr = root;
        //INSERTING FROM MSB//
        for(int i=31;i>=0;i--) {
            int bit = (num>>i)&1;
            if(curr.children[bit]==null) {
                curr.children[bit] = new Trieroot();
            }
            curr = curr.children[bit];
        }
        //STEP 2: FIND ITS MAX XOR, BY CONSIDERING THE NUMBERS OF OPPOSITE BIT//
        int xor = 0;
        curr = root;
        //CHECKING FROM MSB//
        for(int i=31;i>=0;i--) {
            int bit = ((num>>i)&1)^1;
            if(curr.children[bit]!=null) {
                //FOUND OPPOSITE BIT, ADD TO ANS//
                xor+=(1<<i);
                curr = curr.children[bit];
            } else {
                curr = curr.children[bit^1];
            }
        }
        return xor;
	}

}
