package com.assignment.arjun.MultiThreading;

public class ImplementRunnableInterface implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Implement Runnable is running");
		}	
	}
		
	
	public static void main(String[] args) {
		
		ImplementRunnableInterface rd = new ImplementRunnableInterface ();
		Thread t1 = new Thread (rd);
		t1.start();
		System.out.println("Test Print");
		
	}
	
	
	

}
