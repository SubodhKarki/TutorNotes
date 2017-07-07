package com.assignment.arjun.MultiThreading;

public class EvenOdd extends Thread{

	public static void main(String[] args) {								

		 Even e = new Even();
		Odd o = new Odd();
		
		 e.start();
		 o.start();
		
		System.out.println("Even  Odd");
		
		
	
	}

}
