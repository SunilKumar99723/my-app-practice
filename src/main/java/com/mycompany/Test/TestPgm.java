package com.mycompany.Test;

import java.util.Stack;

public class TestPgm {

	static class Node
	{
		int data;
		Node left, right;
	};
	
	static Node newNode(int data) {
		Node temp = new Node();
		temp.data=data;
		temp.left = temp.right = null;
		return temp;
	}
	
	static int prod =1;
	
	static void leafOfProduct(Node root)
	{
		
		if (root== null)
			return;
		if(root.left== null && root.right== null)
			prod *= root.data;
		
		leafOfProduct(root.left);
		leafOfProduct(root.right);
	}
	
	public static void main (String[] args)
	{
		Node root = newNode(1);
		 root.left = newNode(2);
		 root.left.left = newNode(4);
		 root.left.right = newNode(5);
		 root.right = newNode(3);
		 root.right.right = newNode(7);
		 root.right.left = newNode(6);
		 root.right.left.right = newNode(8);
		 
		 prod =1;
		 leafOfProduct(root);
		 System.out.println(prod);
		 
		
	}
}
