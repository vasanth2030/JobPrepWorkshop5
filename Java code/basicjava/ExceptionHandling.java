package com.vasanth.basicjava;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("Start of program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		try {
			int div = num1 / num2;
			System.out.println("The value after division is " + div);

		} catch (ArithmeticException e) {

			System.out.println("Enter a non-zero divisor.");
		} finally {
			System.out.println("Inside finally.");
		}
		System.out.println("End of program");
	}

}
