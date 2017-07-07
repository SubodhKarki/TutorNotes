package RaceCondition;

// BankingThread 1   - Faulty Result on Threading - this is Called Race Condition

/* 
 * Race condition is a situation where your application malfunctions due to the unexpected order of Events.
 * 
 * Synchronization: It is the capability which controls the access of multiple threads to a shared resource.
 * 
 * Synchronized : Putting a lock on resource by one thread and releasing it when the thread is done executing the method
 * so that other thread can access the same shared resource. (bt) on below program 
 * 
 * Synchronized block: It is also same like Synchronized method, but it lets you put the lock on the resource
 * at the block level
 * 
 */
public class BankingThread {

	int accNumber;
	double accbalance;

	BankingThread(double accbalance) {
		this.accbalance = accbalance;
	}

	synchronized public void deposit (double amt) throws InterruptedException { 
		// synchronized added sequence of execution to avoid Race Condition
		// Mark & Elena trying to access at the same time 
		
		System.out.println(Thread.currentThread().getName()+"is depositing..");
		double newbalance;
		
		if (amt < 0){
			System.out.println("Amount cannot be negative");
		}
		else{
			 newbalance = accbalance + amt;
			 
			Thread.sleep(20); //delay added 20 milisec [Amount differ without this]
			 
			 accbalance = newbalance;
			 System.out.println("Deposit completed by" + Thread.currentThread().getName());
			 }
	}

	public void withdraw (double amt) throws InterruptedException {
		double newbalance;
		if (amt >accbalance){
			
		}
		else{
			synchronized(this){     //Synchronized Block
			newbalance = accbalance - amt;
			// if (Thread.currentThread())
			Thread.sleep(20);
			accbalance = newbalance;
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
			
			BankingThread bt = new BankingThread (1000); //bt = same resource
			bt.deposit (200);
			bt.deposit (200);
			
			ElenaThread Elena = new ElenaThread (bt);
			MarkThread Mark = new MarkThread (bt);

			
			Elena.start();    //running at same time
			//Elena.join(30); 
			//join method bad approach for many account - synchronized is best practice for large account
			Mark.start();
			
			
			
			Thread.sleep (100);
			
			System.out.println("Total balance is " + bt.accbalance );
			}
	
}

