package miscellaneous;
// Assert; used to restrict values.
public class AssertDemo {
	
	public static void main(String[] args) {
	
		for ( int i =0; i <10; i++) {
			System.out.println(i);
			
		assert i < 5;  // go to Run configuration and insert "-ea" under argument 
		}
	}

}
