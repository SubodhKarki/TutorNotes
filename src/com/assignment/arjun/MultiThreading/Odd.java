package com.assignment.arjun.MultiThreading;

public class Odd extends Thread{

	public void run() {
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(100); // 1000 = 1 sec time-frame 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (i % 2 != 0) {
				System.out.println("\t"+ i);
			}
		}
	}

}
