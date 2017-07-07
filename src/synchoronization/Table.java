package synchoronization;
/*// capability to control access of multiple threads to a shared resources
1. To prevent thread interference.
2. to prevent consistency problems 
 concept of lock : Synchronization is built around the concept of local
 - every object has a lock associated with it.
 if a thread need consistent access of objects shared shared resource
  then it need to acquire the lock of particular object.
 
*/
public class Table {

	void printTable(int n) {
		synchronized (this) {
			for (int i = 1; i <= 5; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
		System.out.println("Some other line of code");
		System.out.println("rest of the code");

	}
}
