package Serialization;


import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;


public class FileInputDemo {

	public static void main(String[] args) throws IOException {
	
		/*FileInputStream fi1 = new FileInputStream ("C:\\Test31.txt");
		FileInputStream fi2 = new FileInputStream ("C:\\Test32.txt");
		
		SequenceInputStream st = new SequenceInputStream (fi1,fi2);
		int i;
		while  (st.read() != -1 )
		{
			System.out.println((char)st.read());
		}*/
		
		FileInputStream fo1 = new FileInputStream ("D:\\newTest31.txt");
		FileInputStream fo2 = new FileInputStream ("D:\\Test32.txt");
		
	ByteArrayOutputStream bt = new ByteArrayOutputStream();
	String s= "Robin,Sonam, TIka";
	
	bt.write (s.getBytes());
	bt.write(65);
	bt.writeTo(fo1);
	bt.writeTo(fo2);
	bt.close();
	}

}
