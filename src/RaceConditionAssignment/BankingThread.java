package RaceConditionAssignment;

public class BankingThread {
	int accNumber;
	double accbalance;
	
	BankingThread(double accbalance) {
		this.accbalance = accbalance;
	}
	
	
	synchronized public void deposit(double amt) throws InterruptedException {
		
		
		System.out.println(Thread.currentThread().getName() + "is depositing.....");
		double newbalance;
		
		if(amt  < 0) {
			System.out.println("Amount cannot be nefative");
			
		}
		else {
			
			newbalance =  accbalance + amt; // 1200
			accbalance = newbalance;
			System.out.println("Deposit completed by " + Thread.currentThread().getName());
			notify();	   
		}
	}
	
	synchronized public void withdraw(double amt) throws InterruptedException {
		double newbalance;
		if(amt  > accbalance) {
         System.out.println("Balance is low..Waiting for Mark to deposit");
          wait();
          newbalance =  accbalance - amt; 
			accbalance = newbalance;
          
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
          
		BankingThread bt = new BankingThread(1000);
		ElenaThread Elena = new ElenaThread(bt);
		MarkThread Mark = new MarkThread(bt);
		Mark.setName("mark");
		Elena.setName("elena");
		
		
		Elena.start();
		Mark.start();
		
		
		Thread.sleep(100);
		
		System.out.println("Total balance is " + bt.accbalance );
	}
}

