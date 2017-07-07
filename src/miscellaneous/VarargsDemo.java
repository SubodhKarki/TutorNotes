package miscellaneous;

public class VarargsDemo {

	public static void main(String[] args) {

		display();
		display("SomeName");
		display("SomeName", "SomeotherName");
	}

	public static void display(String... name) {

		System.out.println("Came to display Method");

		for (String s : name) {
			System.out.println(s);
		}
	}

}
