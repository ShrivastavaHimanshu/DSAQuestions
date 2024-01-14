package com.himanshu.tree;

/*Given a Binary Tree A consisting of N integer nodes, you need to find the diameter of the tree.

The diameter of a tree is the number of edges on the longest path between two nodes in the tree.

*/
public class DiameterOfTree {
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		
		int diameter = solve(root);
		System.out.println(" ans is :" + diameter);
	}

	static int diameter = 0;
	private static int solve(TreeNode root) {
		
		TreeInfo x = findDiameter(root);
	       
        return x.dia ;        
    }

    public static TreeInfo findDiameter(TreeNode root) {
        if(root == null) {
            return new TreeInfo(-1, -1);
        }

        TreeInfo leftDia  = findDiameter(root.left);
        TreeInfo rightDia = findDiameter(root.right);

        /*
         *  //Diameter can be found either on left side, right side of tree or spanning the root of the tree,

        *			1
        *		   / \	  
        *		  2	  3   
        *        / \
        *		4	5
        *
        *
        */
       
        //so we need to consider the maximum of these three values, leftDia, rightDia and overall Dia
        int h = Math.max(leftDia.height, rightDia.height) + 1;
        int d = Math.max(Math.max(leftDia.dia, rightDia.dia), (leftDia.height + rightDia.height + 2));

        return new TreeInfo(h, d);
    }

    public static class TreeInfo {
        int height;
        int dia;

        TreeInfo(int h, int d) {
            this.height = h;
            this.dia = d;
        }
    }
}
