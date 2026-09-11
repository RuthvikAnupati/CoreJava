package com.javaintro_lab;

public class GarbageCollection_1 {
	
	@Override
	protected void finalize() {
		System.err.println("finalize called");
	}
	
	static void fourthtypegc() {
		GarbageCollection_1 gc5 = new GarbageCollection_1();
	}

	public static void main(String[] args) {
		
		GarbageCollection_1 gc1 = new GarbageCollection_1();
		System.out.println("gc1 : " + gc1);
		
		GarbageCollection_1 gc2 = new GarbageCollection_1();
		System.out.println("gc2 : " + gc2);
		
		gc1 = null;
		
		GarbageCollection_1 gc3 = new GarbageCollection_1();
		System.out.println("gc3 : " + gc3);
		
		GarbageCollection_1 gc4 = new GarbageCollection_1();
		System.out.println("gc4 : " + gc4);
		
		gc4 = gc3;
		System.out.println("gc3 garbage collected");
		
		new GarbageCollection_1();
		
		fourthtypegc();
		
		System.gc();
		System.err.println("ended");
		
	}

}
