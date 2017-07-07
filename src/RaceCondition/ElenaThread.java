package RaceCondition;
// BankingThread  3
public class ElenaThread extends Thread{
		BankingThread bt;  //Keeping a reference of another class - aggregation
		
		ElenaThread (BankingThread bt) {
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


