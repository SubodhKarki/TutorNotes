package com.Arjun.MultithreadingNotes; // Demo 1

public class ThreadingDemo extends Thread { // extending Thread keyword

	public void run() { // this method should be present *
		System.out.println(Thread.currentThread().getName());
	//	try {
	//		Thread.sleep(1000);                          //Blocked 
	//	} catch (InterruptedExecption e) {
	//		e.ptintStackTrace();
	//	}
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}													// Terminated
	}

	public static void main(String[] args) {
		ThreadingDemo td1 = new ThreadingDemo(); // creading an object + Thread ,
												// td = thread as well not just
												// an object
		ThreadingDemo td2 = new ThreadingDemo();
		td1.start(); // runnable state. it picks up the print method *
		// or td.run(); = sequential - regular not a thread without start
		
		td2.start();  // different thread with its diff name 
		System.out.println("Thread 2.0");
		
		td1.setName("For loop Thread");       // doesnt print without ^ getName above                  
		Thread.currentThread().setName("Main Method Thread");  //current thread
		
		System.out.println(Thread.currentThread().getName());	     	  
		// System.out.println(td1.getName());
		System.out.println("Rest of the Code");

	}

	/* Lifecycle of thread:
	 1. New 2. Runnable 3. Running 4.Blocked 5.Terminated
*/
}