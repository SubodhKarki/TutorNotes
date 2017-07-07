package com.Arjun.MultithreadingNotes; // Demo 0

public class ArrayDemo {

	public static void main(String[] args) {

		float [] a = new float [10];
		// a[0] = 1; // 0 to 9 is 10 elements - value assigning
		//a[1] = 2;
		// a[2] = 3;  // long process so use loop
	//	System.out.println(a[0]);
		
		for (int i =0; i<a.length; i++) {
			
			a[i] =  (int) (5 + 10* Math.random());   //""; // minimum value of math.random = zero
		}
		
		for (int i = 0; i<a.length; i++) {
			System.out.println(a[i]);   // access to values by using array 
		}
	}

}
