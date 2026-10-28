package com.javafundamentals_lab;

public class ObjectCount {
	
	static int count = 0;
	
	public ObjectCount() {
		count++;
	}

	public static void main(String[] args) {
		ObjectCount ob1 = new ObjectCount();
		ObjectCount ob2 = new ObjectCount();
		ObjectCount ob3 = new ObjectCount();
		ObjectCount ob4 = new ObjectCount();
		ObjectCount ob5 = new ObjectCount();
		
		System.out.println(count);
	}

}
