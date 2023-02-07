package com.gl.dsaproject.bst;
public class Transactions {
	
	public static Node node;
	static Node prevNode=null;
	static Node headNode=null;

	public static void flattenBST(Node root,int order){
		// Base Case
		if(root==null){
			return;
		}

        // Condition to check the order in which the skewed tree to maintained
		if(order > 0){
			flattenBST(root.right,order);
		} 
		else{
			flattenBST(root.left,order);
		}
		
		Node rightNode=root.right;
		Node leftNode=root.left;

        // Condition to check if the root Node of the skewed tree is not defined
		if(headNode == null) {
			headNode=root;
			root.left=null;
			prevNode=root;
		} 
		else{
			prevNode.right=root;
			root.left=null;
			prevNode=root;
		}

		if(order > 0){
			flattenBST(leftNode, order);
		} 
		else{
			flattenBST(rightNode, order);
		}
	}

    // Function to traverse the right skewed tree using recursion
	public static void traverseRightSkewed(Node root){
		if (root == null) {
			return;
		}
		
		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);
	}
	
	public static void main(String[] args){
		Transactions.node = new Node(50);
		Transactions.node.left = new Node(30);
		Transactions.node.right = new Node(60);
		Transactions.node.left.left = new Node(10);
		Transactions.node.right.left = new Node(55);
		System.out.print("Skewed Tree is as follows: ");
		int order = 0;
		flattenBST(node, order);
		traverseRightSkewed(headNode);
	}
}



