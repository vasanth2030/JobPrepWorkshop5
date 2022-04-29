package com.vasanth.linkedlist;

public class Node {
	int data;
	Node next;
	
	Node(int data)
	{
		this.data=data;
		next=null;
	}
	
	public static void insertNodeAtEnd(Node head,int data)
	{
		Node newNode= new Node(data);
		
		Node curr=head;
		
		while(curr.next!=null)
			curr=curr.next;
		
		curr.next=newNode;
	}
	
	public static Node deleteNode(Node head,int pos)
	{
		if(pos==1)
			return head.next;
		else
		{
			int i=1;
			Node curr=head;
			while(i<pos-1)
			{
				curr=curr.next;
				i++;
			}
			curr.next=curr.next.next;
			return head;
		}
		
	}
	
	public static void printLinkedList(Node head)
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" --> ");
			curr=curr.next;
		}
		System.out.println();
	}

}
