package collectionFramework;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	
	public static void main(String[] args) {
	
	PriorityQueue<String> pq = new PriorityQueue <> ();
	
	pq.add("java");
	pq.add(".Net");
	pq.add("UI");
	pq.add("Python");
	pq.add("SQL");
	
	for (String s :pq)
		System.out.println(s);
	
	System.out.println();
	while(pq.size() > 0) {
		 System.out.println(pq.remove());
				 
	}

}
}

