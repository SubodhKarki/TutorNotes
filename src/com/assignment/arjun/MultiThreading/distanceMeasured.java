package com.assignment.arjun.MultiThreading;

import java.util.Scanner;

public class distanceMeasured {

	private static Scanner sc;

	public static void main(String[] args) throws InterruptedException {
		sc = new Scanner (System.in);
	String memo = null;
		do{
			System.out.println("Enter a String in centimeters: ");
			float centimeters= sc.nextFloat();
			
			CentimetersToMeters tm = new CentimetersToMeters (centimeters);
			
			tm.start();
			tm.join();
			System.out.println("Do you wish to Continue? Y / N ");
			memo = sc.next();
			
		}
		while (memo.equals("y"));

	}

}
