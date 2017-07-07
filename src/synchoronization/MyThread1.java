package synchoronization;

public class MyThread1 extends Thread {
	Table t; // entity reference

	public MyThread1(Table t) {
		this.t = t;  //constructor 

	}

	public void run () {
		t.printTable(2);
		
	}
}
