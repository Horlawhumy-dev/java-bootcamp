package com.HaroffCode;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Program that compute the factorial of number.");
		System.out.print("Enter your favorite number here: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		long result = num; 
		if(num > 0) {
			for(int i = 1; i<num; i++) {
				result = result * i;
			}
		}else {
			System.out.println("Number must be positive.");
		}
		System.out.println("Factorial is: " + result);
		}
	}
