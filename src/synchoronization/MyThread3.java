package synchoronization;

public class MyThread3 extends Thread {
	Table t; // entity reference

	public MyThread3(Table t) {

		this.t = t;

	}

	public void run () {
		t.printTable(3);
		
	}
}
