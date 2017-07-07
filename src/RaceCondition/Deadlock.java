package RaceCondition;
/*
* Deadlock : It is a situation where one thread is waiting for the lock acquired by  the other thread,
* and the second thread is waiting for the lock acquired by the first thread. Since, both are waiting for 
* each other to release the lock, they keep on waiting for ever which leads to deadlock.
* 
* Communication between two threads: Inter-thread communication is the process of one thread communicating 
* with other thread to release the lock
* wait(), notify(), notifyAll() --> All these method should be used inside a synchronized block or synchronized method.
  
  wait(): when you call this method inside a synhronized block, the currently executing thread will release the lock
  	on the object, so that other thread can acquire the lock and start using the same resource.
  	My current thread will keep on waiting until it gets an acknowledgement from the other thread.
  
  notify() method: when you call this method in any synchronized block, it lets the other thread which is waiting
  	to start execute. e.g: husband wife account
  	
  notifyall() : same as notify but several e.g family account: Husband, wife and clildrends etc
 */

public class Deadlock {

	final String resource1 = "Sonam"; // Recruiter 1 recruits Sonam
	final String resource2 = "Robin"; // Recr..2

	public static void main(String[] args) {
		Deadlock d = new Deadlock();

		Recruiter1 t1 = new Recruiter1(d);
		Recruiter2 t2 = new Recruiter2(d);
		t1.start(); 
		t2.start();
		
	}

}

class Recruiter1 extends Thread {
	Deadlock d;

	Recruiter1(Deadlock d) {
		this.d = d;
	}

	public void run() {
		synchronized (d.resource1) {
			System.out.println("Recruiter 1 locked" + d.resource1 + "for marketing");

			System.out.println("I am waiting for resource 2.release lock on resource 2");
			synchronized (d.resource2) {
				System.out.println("Recruiter 1 locked" + d.resource2 + "for Finance");
			}
		}
	}
}

class Recruiter2 extends Thread {
	Deadlock d;

	Recruiter2(Deadlock d) {
		this.d = d;
	}

	public void run() {

		synchronized (d.resource1) {
			System.out.println("Recruiter 1 locked" + d.resource1 + "for marketing");

			synchronized (d.resource2) {
				System.out.println("Recruiter 2 locked" + d.resource2 + "for Finance");
			}
		}

	}

}
