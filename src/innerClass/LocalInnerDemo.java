package innerClass;

public class LocalInnerDemo {
	
	void display () {
		
		class Local {  
			void display () {
				System.out.println("From local Inner Class");
			}
			
		}
		Local lc = new Local();
		lc.display();   		// Local inner within the block
	}

	public static void main(String[] args) {
		LocalInnerDemo oc = new LocalInnerDemo ();
		oc.display();

	}

}
