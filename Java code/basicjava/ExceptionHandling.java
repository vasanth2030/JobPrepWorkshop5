package com.vasanth.basicjava;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("Start of program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

//		try {
//			int div = num1 / num2;
//			System.out.println("The value after division is " + div);
//
//		} catch (ArithmeticException e) {
//
//			System.out.println("Enter a non-zero divisor.");
//		} finally {
//			System.out.println("Inside finally.");
//		}

		int div;
		try {
			div = divide(num1, num2);
			System.out.println("Answer: " + div);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("End of program");
	}

	public static int divide(int a, int b) throws Exception {
		throw new Exception("Manually created exception");
	}

}
