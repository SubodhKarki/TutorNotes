package com.Arjun.MultithreadingNotes; // Demo 1

public class MultiThreadingDemo1 {

	public static void main(String[] args) throws InterruptedException {  //InterruptedException after creating JOIN

		Even e = new Even();
		Odd o = new Odd();

		e.setPriority(Thread.MAX_PRIORITY); // not important
		o.setPriority(Thread.MIN_PRIORITY); // Random Even and odd Print

		o.join(); // it makes more sense than Priority - it executes 1st and moves to next thread 
		o.start();

		e.start();
		e.join();

		System.out.println("Rest of the code");

	}

}

class Even extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}

	class Odd extends Thread {

		public void run (){
			for (int i=0; i < 10; i++){
				if (i % 2!= 0 ){
					System.out.println(i);
				}
			}
		
		}
	}

