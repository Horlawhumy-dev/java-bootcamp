package com.HaroffCode;

import java.util.Scanner;

public class TemperatureConversion {
	public static void main(String[] args) {
		System.out.println("Java Program that converts temperature from celcius to farheit");
		
		try (Scanner in = new Scanner(System.in)) {
			float tempC = in.nextFloat();
			float tempF = (float) (tempC * 1.8) + 32;
			System.out.println(tempF);
		}
	}
}
