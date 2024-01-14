package com.himanshu.tries;

import java.util.*;

/*We want to make a custom contacts finder applications as part of our college project. The application must perform two types of operations:

Type 1: Add name B[i] ,denoted by 0 in vector A where B[i] is a string in vector B denoting a contact name. This must store B[i] as a new contact in the application.

Type 2: Find partial for B[i] ,denoted by 1 in vector A where B[i] is a string in vector B denoting a partial name to search the application for. It must count the number of contacts starting with B[i].

You have been given sequential add and find operations. You need to perform each operation in order.

And return as an array of integers, answers for each query of type 2(denoted by 1 in A) .

*
*A = [0, 0, 1, 1]
B = ["hack", "hacker", "hac", "hak"]
*
*o/p [2, 0]
*
*/

 class TrieNode{
    char ch;
    int freq;
    TrieNode children[]=new TrieNode[26];
    public TrieNode(char ch){
        this.ch=ch;
    }
}

public class ContactFinder {

	  public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<String> B) {
	        TrieNode root=new TrieNode('/'); // dummy root 
	        ArrayList<Integer> list=new ArrayList<>();
	        for(int i=0;i<A.size();i++){
	            if(A.get(i)==0)
	                insert(root,B.get(i));
	            else
	                searchPrefix(root,B.get(i),list);
	        }
	        return list;
	    }

	    public void insert(TrieNode root,String word){
	        TrieNode curr=root;
	        for(int i=0;i<word.length();i++){
	            char ch=word.charAt(i);
	            int index=ch-'a';
	            if(curr.children[index]==null)
	                curr.children[index]=new TrieNode(ch);
	            curr.children[index].freq++;
	            curr=curr.children[index];
	        }
	    }

	    public void searchPrefix(TrieNode root,String prefix,ArrayList<Integer> list){
	        TrieNode curr=root;
	        for(int i=0;i<prefix.length();i++){
	            char ch=prefix.charAt(i);
	            int index=ch-'a';
	            if(curr.children[index]==null){
	                list.add(0);
	                return ;
	            }
	            curr=curr.children[index];
	        }
	        list.add(curr.freq);
	    }
}
