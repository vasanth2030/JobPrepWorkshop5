package com.vasanth.basicjava;

import java.util.Scanner;

public class ConditionalStatements {
	public static void main(String[] args) {

//		if(num==0){
//			System.out.println("The number is Zero");
//		}
//		else if (num%2== 0) {
//			System.out.println("Even number.");
//		} 
//		else {
//			System.out.println("Odd number.");
//		}
//		
//		System.out.println("Rest of the code.");
		
//		String res;
//		
//		res=(num%2==0)?"Even number":"Odd Number";
//		
//		System.out.println(res);
		
//	    switch(num) {
//	    
//	    case 1:
//	    	System.out.println("Monday");
//	    	break;
//	    case 2:
//	    	System.out.println("Tuesday");
//	    	break;
//	    case 3:
//	    	System.out.println("Wednesday");
//	    	break;
//	    case 4:
//	    	System.out.println("Thursday");
//	    	break;
//	    case 5:
//	    	System.out.println("Friday");
//	    	break;
//	    case 6:
//	    	System.out.println("Saturday");
//	    	break;
//	    case 7:
//	    	System.out.println("Sunday");
//	    	break;
//	    default:
//	    	System.out.println("Enter a number between 1 and 7");
//	    }
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		oddOrEven(num);
		
	}
	
	public static void oddOrEven(int n)
	{
		if(n%2==0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");
	}
	
	
}
