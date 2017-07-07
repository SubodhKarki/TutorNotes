package collectionFramework;

import java.util.HashSet;
// HasSet: used to store elements.
/*- It implements set interface
- It contains unique elements 
- it doesn't maintain any insertion order.

LinkedHasSet: It is same as HashSet, but it maintains in insertion order.

// TreeSet : ( In ascending order)
 * 
 * MAP: It is an interface which stores elements in the form of key value pairs.
 * 		Each key value pair in a map is called Entry.
 * 	Entry (sub interface of Map Interface. This represents one key value pair.
 * 
 */
public class HasSetDemo {

	public static void main(String[] args) {

	HashSet <String> hs = new HashSet <> ();
	hs.add("java");
	hs.add(".Net");
	hs.add("UI");
	hs.add("Java");
	hs.add("Python");
	
	for ( String s: hs) {  // s holds 1 element, hs holds all elements 
		System.out.println(s);
	}
	}

}
