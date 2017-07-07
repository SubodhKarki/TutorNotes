package innerClass;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
/* 
 * Java I/O : Java provide library i/o to process inputs and outputs 
 * Streams: Streams makes the i/o processing faster. Streams takes data only in the form of bytes.
 * 	Input Stream: System.in
 * 	Output Stream: System.out
 * 
 * *  1) FileInputStream: It is an input stream which does input operations on file.
 *  * 2) FileInputStream: It is an input stream which does input operations on file.
 *  * 3) BufferedOutputStream: It lets you buffer the data before writing to the file.
 *  * 4) BufferedInputStream:It lets you buffer the data before reading from the file. (buffer used for performance gaining 
 */
import java.io.FileInputStream;  // library package
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException; 

public class javaIO {  //File input Demo

	public static void main(String[] args) throws IOException {  // add throw auto generated 

		FileInputStream fin = new FileInputStream("C:\\Cubictest.txt");  // file path (add argument) 
		//FileOutputStream fout = new FileOutputStream ("C:\\CubicTemp.txt");  
		// Output will create a file, after this file path argument 
		BufferedOutputStream bo = new BufferedOutputStream(fout); 
		// Buffer for performance for large file
		BufferedInputStream bin = new BufferedInputStream(fin);
		// System.out.println((char)bin.read());
		
		
		String s = "Cubic Technologies";
		byte[] b = s.getBytes();
		bout.write(b);
		bin.close();
		bout.flush();
		fout.close();
		fin.close();
		
		fout.close();
		fin.close();		
		
		//fout.write(65); 
		// fout.write(66); 
		
		bo.write(67);
		
		bo.flush(); // it will clear the data - close the file to help program Run
		fout.close();
		fin.close();
		/*int s;
		while( (s = fin.read())!= -1) {
		}*/
	
		System.out.println((char) fin.read());
	}

}
