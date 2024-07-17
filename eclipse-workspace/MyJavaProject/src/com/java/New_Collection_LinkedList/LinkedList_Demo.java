package com.java.New_Collection_LinkedList;

public class LinkedList_Demo 
{
	//to create our own linkedlist
	
	Node head; // Node has to be head first, so created this head
	
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	
	public void printMyLinkedList()
	{
		Node n=head;
		
		while(n!=null)
		{
			System.out.println(n.data); // here keep traversing to next node. Once we get null then we have to stop.
			n = n.next; // to move next
		}
	}
	
	public static void main(String[] args)
	{
		LinkedList_Demo ll=new LinkedList_Demo();
		
		Node first = ll.new Node(10); // here 1 node got created
		ll.head = first;
		
		Node second = ll.new Node(20);
		first.next = second; // here linking with first node
		
		
		Node third = ll.new Node(30);
		second.next = third; // here linking with second node
		
		Node forth = ll.new Node(40);
		third.next = forth;
		
		ll.printMyLinkedList();
		
	}

}
