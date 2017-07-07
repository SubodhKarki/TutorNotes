package com.Arjun.MultithreadingNotes; // Demo 1

public class RunnableDemo implements Runnable {
	
	@Override						// without this on runnable its compile time error
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread is running");
		}							
		
	}
	
	public static void main(String[] args) {

		RunnableDemo rd = new RunnableDemo ();
		Thread t1 = new Thread (rd);			//object by passing to rd
		t1.start();

	}

	

}
