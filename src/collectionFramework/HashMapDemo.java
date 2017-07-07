package collectionFramework;

import java.util.HashMap;
import java.util.Map;

/* Map.Entry: --> Gives one key value pair.
* entrySet():--> Gives the set of all key value pairs.
* .put (key,value);
* 
* HashMap : doesn't contains any duplicate key. but can contain duplicate value
* 		The performance is fast.
* 
* LinkedHasMap --> maintains the Insertion order.
*  TreeMap ---> cannot contains null key. it can have null value.
*  
*  HashTable : same as HashMap . It is synchronized - but doesn't contain null values or Null Keys.
*  			The performance is slow.
* */

public class HashMapDemo {

	 public static void main(String[] args) {

	HashMap <Integer, String> hm = new HashMap <Integer, String> ();
	hm.put(103," Java");
	hm.put(101,".Net");
	hm.put(102," UI");
	hm.put(104," Adv.Java");
	hm.put(106, " Java");
	hm.put(null , null);
	
	for (Map.Entry m : hm.entrySet() ) { // m holds 1 pair of variables
		System.out.println(m.getKey()+ "" + m.getValue() );  // it will get the key of first value
	}
	

	}
}


