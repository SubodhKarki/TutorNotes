package innerClass;
/*
 * Inner classes or nested classes: Inner class is a class which is created inside a class 
 * 
 * 1. Member Inner Class : present inside a class as a member
 * 2. Anonymous class:  a class without name. (if you want to use Class only one time)
 * 		These should be used only to override the methods of the parent class
 *  		new Parentclass () {
 *  		}  
 * 3. Local Inner Class:  
 * 
 * Advantages: we can access the private member of the class
 * 
 */
public class OuterInner {
	private double balance = 100;

	void display () {
		System.out.println("From outer class ");
	}
	
	class Inner {   // Inner class
		
		void display () {
			System.out.println("From inner class ");
			System.out.println(balance);
		
	}
	}
	public static void main (String [] args) {
		 OuterInner oc = new OuterInner ();  // new class name constructor 
		 
		 OuterInner.Inner ic = oc.new Inner (); // acces the outer class. by className.   
		 // create object oc.new by using reference variable "oc"
		 ic.display();
		 oc.display();
		 
	}

}
