package RaceConditionAssignment;
//Assignment Class
import RaceCondition.BankingThread;

public class MarkThread {
BankingThread bt;  //Keeping a reference of another class - aggregation
	
	MarkThread (BankingThread bt) {
		this.bt = bt ;
		
	}
	public void run() {
		

		try {
			bt.deposit(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
