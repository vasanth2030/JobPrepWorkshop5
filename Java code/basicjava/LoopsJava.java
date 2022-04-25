package com.vasanth.basicjava;

import java.util.Scanner;

public class LoopsJava {
	public static void main(String[] args) {
//		int i=1;
		
//		while(i<=n)
//		{
//			System.out.println("Hello "+i);
//			i++;
//		}
		
//		do {
//			System.out.println("Hello "+i);
//			i++;
//		}while(i<=n);
		
//		for(int i=n;i>=1;i--)
//		{
//			System.out.println("Hello "+i);
//		}
//		
//		System.out.println("Rest of the code.");

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int ans= sumOfFirstNNumbers(n);
		System.out.println("The sum of first "+n+" natural numbers is "+ans);
		int fact=factorial(n);
		System.out.println("The factorial of "+n+" is "+fact);
		
	}
	public static int sumOfFirstNNumbers(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;    	// sum=sum+i
		}
		return sum;	
	}
	
	public static int factorial(int n)
	{
		int fact=1;
		for(int i=2;i<=n;i++)
		{
			fact*=i;     // fact=fact*i
		}
		return fact;
	}

}
