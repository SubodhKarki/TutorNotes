package synchoronization; //(since java 5)
/*
 * DeadLock in Java:
 * it is
 */
		
public class Test1 {

	public static void main(String[] args) {
		Table t = new Table ();
		MyThread1 m1=new MyThread1 (t);
		MyThread2 m2=new MyThread2 (t);
		MyThread3 m3=new MyThread3 (t);
		m1.start();
		m2.start();
		m3.start();
	}

}
