package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

	public static void main(String[] args) throws IOException {
		
		Person p = new Person (101,"Nima");
		FileOutputStream fo = new FileOutputStream("C:\\Temp\\something1.txt");
		ObjectOutputStream os = new ObjectOutputStream (fo);
		
		os.writeObject(p);
		System.out.println("Serialiation Sucess");
		
	}

}

class Person implements Serializable {
	int id;
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	String name;
}
