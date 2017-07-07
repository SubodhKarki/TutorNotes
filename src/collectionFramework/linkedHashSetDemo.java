package collectionFramework;

import java.util.LinkedHashSet;
// same order as kept

public class linkedHashSetDemo {

	public static void main(String[] args) {

			LinkedHashSet <String> hs = new LinkedHashSet <> ();
			hs.add("java");
			hs.add(".Net");
			hs.add("UI");
			hs.add("Java");
			hs.add("Python");
			
			for ( String s: hs) {
				System.out.println(s);
			}
			}

}
