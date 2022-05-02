package com.vasanth.stack;

public class Stack {
	int arr[];
	int capacity;
	int top;
	
	Stack(int capacity)
	{	
		this.capacity=capacity;
		arr=new int[capacity];
		top=-1;
	}
	
	public void push(int data)
	{
		if(top==capacity-1)
		{
			System.out.println("Stack overflow");
			return;
		}
		else {
			arr[++top]=data;
		}
	}
	
	public void pop()
	{
		if(top==-1)
			System.out.println("Stack underflow");
		else
		{
			top--;
		}
	}
	
	public int peek()
	{
		return arr[top];
	}
	
	public void printStack()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.print(arr[i]+" <-- ");
		}
		System.out.println();
	}

}
