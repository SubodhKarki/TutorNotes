package miscellaneous;

public class EnumDemo {

	public static void main(String[] args) {
		
		// Directions s = Directions.East;
		
		for (Directions d : Directions.values()) {
			System.out.println(d);
		}
		
	}

}

 enum Directions {
	 
	 East,
	 West,
	 North,
	 South

 }