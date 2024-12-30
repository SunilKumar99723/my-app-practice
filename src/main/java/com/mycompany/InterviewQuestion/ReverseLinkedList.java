package com.mycompany.InterviewQuestion;

//Java program for reversing the linked list

class ReverseLinkedList {

	static Node head;
	//a static class cannot be instantiated. In other words, you cannot use the new operator to create a variable of the class type.
	//Benifits - 1. A static class like any other nested class can always access the private members and methods of the outer class. 
	//           2. Static classes are declared to remove restrictions on member classes of an outer class.
	static class Node {

		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	/* Function to reverse the linked list */
	Node reverse(Node node)
	{
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}

	// prints content of double linked list
	void printList(Node node)
	{
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		ReverseLinkedList list = new ReverseLinkedList();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);

		System.out.println("Given linked list");
		list.printList(head);
		
		head = list.reverse(head);
		
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(head);
	}
}

//This code has been contributed by Mayank Jaiswal
