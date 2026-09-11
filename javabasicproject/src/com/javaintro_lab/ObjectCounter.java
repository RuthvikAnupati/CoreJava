package com.javaintro_lab;

public class ObjectCounter {
	
//  static variable 
//	will be counting common for each object we create rather than differently for each object we created
	static int count = 0;
	
//  instance block - as it will be executed every time when object is created,
//	then count will be increased for each object created
	{
		count++;
	}

	public static void main(String[] args) {
		
		ObjectCounter oc1 = new ObjectCounter();
		ObjectCounter oc2 = new ObjectCounter();
		ObjectCounter oc3 = new ObjectCounter();
		ObjectCounter oc4 = new ObjectCounter();
		ObjectCounter oc5 = new ObjectCounter();
		
		System.out.println(count);

	}

}
