package com.HaroffCode;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Please enter your favorite club: ");

		Scanner input = new Scanner(System.in);
		String club = input.nextLine();
		
		System.out.println(club);
		
	}
}
