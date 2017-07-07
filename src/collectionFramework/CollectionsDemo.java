package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsDemo {

	public static void main (String[] args) {
		
		LinkedList <String> 11 = new LinkedList <>();
		11.add ("Name1");
		11.add("Name2");
		11.add("Name3");
		
		ArrayList <String> al = new ArrayList();  //array can hold any object , data types.
		
		// al.add(1);
		al.add("Something");
		al.add("Temp");
		
		 // using indexes you can access array.
	// int i = (int) al.get(0); // add int cast	
	// String s = (String) al.get(1); // after typecast
	
	// int j = (int) al.get(2);  // you cannot typecast String into int & program will throw an exception.
		
		for (String s: al ) {
			
			System.out.println(s);
			//System.out.println(al.get(1));
		}
	
	Iterator <String> it =  al.iterator(); 
	
	System.out.println("Using iterator");
	System.out.println();
	
	while(it.hasNext()){
		System.out.println(it.next());
	}
		
	}
}
 