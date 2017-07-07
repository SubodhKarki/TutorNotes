package innerClass;

public class AnonymousInner {

	public static void main(String[] args) {

		Parent anon = new Parent() {
			void display() {
				System.out.println("from anonymous");
			}
		}; 													// anonymous method 
		anon.display();
		 /* child c = new Child ();
		  c.display(); */
	}

}

 /*class Child extends Parent {      // anonymous avoid writing all these 
	 void display () {
		 System.out.println("from child");
	 }
 }*/

class Parent {
	void display() {
		System.out.println("from parent");
	}
}
