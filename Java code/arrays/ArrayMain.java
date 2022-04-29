package com.vasanth.arrays;

import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {

//		int arr[]= {10,20,30,40,50};

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the number: ");
			arr[i] = sc.nextInt();
		}

		printArray(arr);

		System.out.println("The sum of elements in the array is: " + sumOfElementsInArray(arr));

		int secondLargest = secondLargestElement(arr);

		if (secondLargest == -1)
			System.out.println("All elements are equal");
		else
			System.out.println("The second largest element in the array is: " + secondLargest);

		System.out.println("Enter element you want to search: ");
		int x = sc.nextInt();

		linearSearch(arr, x);
		binarySearch(arr, x);
	}

	public static int sumOfElementsInArray(int arr[]) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i]; // sum=sum+arr[i]
		}

		return sum;
	}

	public static int secondLargestElement(int arr[]) {
		int largest = arr[0];
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}

		if (secondLargest == Integer.MIN_VALUE)
			return -1;
		return secondLargest;
	}

	public static void linearSearch(int arr[], int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				System.out.println("Linear Search: Element found at index " + i);
				return;
			}
		}
		System.out.println("Linear Search: Element not found.");
	}

	public static void binarySearch(int arr[], int x) {
		int l = 0;
		int r = arr.length - 1;

		while (l <= r) {
			int mid = (l + r) / 2;

			if (arr[mid] == x) {
				System.out.println("Binary Search: Element found at index " + mid);
				return;
			} else if (arr[mid] < x)
				l = mid + 1;
			else
				r = mid - 1;
		}
		
		System.out.println("Binary Search: Element not found.");
	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
