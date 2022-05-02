package com.vasanth.queue;

public class Queue {
	int arr[];
	int capacity;
	int front,rear;
	
	Queue(int capacity)
	{
		this.capacity=capacity;
		arr=new int[capacity];
		front = rear = 0;
	}
	
	public void enqueue(int data)
	{
		if(rear==capacity)
		{
			System.out.println("Queue is full");
			return;
		}
		else {
			arr[rear++]=data;
		}
	}
	
	public void dequeue()
	{
		//arrays are static. So elements cannot be deleted directly
		
		for(int i=0;i<rear-1;i++)
		{
			arr[i]=arr[i+1];
		}
		rear--;
	}
	
	public void printQueue()
	{
		for(int i=front;i<rear;i++)
		{
			System.out.print(arr[i]+" <-- ");
		}
		System.out.println();
	}

}
