package synchoronization;

public class MyThread2 extends Thread {
	Table t; // entity reference

	public MyThread2(Table t) {

		this.t = t;

	}

	public void run () {
		t.printTable(2);
		
	}
}
