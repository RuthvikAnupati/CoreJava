/*
Create a Java program to fulfill the following requirements:
› Create a Vehicle class with a field type and a one-argument constructor accepting type.
› Create a Car class that extends Vehicle, brand and price, 
  and a three-argument constructor accepting type, brand, and price.
> Create an ElectricCar class that extends Car, with a field batteryCapacity 
  and a four-argument constructor accepting type, brand, price, and batteryCapacity.
> In the ElectricCar class, create an object by passing all four values.
› The values should be passed from Electriccar to Car, 
  and from Car to Vehicle through constructor chaining.
› Create a display() method inside Electriccar and print type, brand, price, 
  and batterycapacity.
*/
package com.javafundamentals_lab;

class Vehicle{
	String type;
	
	Vehicle(String type) {
		this.type = type;
	}
}

class Car extends Vehicle{
	String brand;
	int price;
	
	Car(String type,String brand,int price){
		super(type);
		this.brand = brand;
		this.price = price;
	}
}

class ElectricCar extends Car{
	double batteryCap;
	ElectricCar(String type,String brand,int price ,double batteryCap){
		super(type, brand, price);
		this.batteryCap = batteryCap;
		

	}
	void display() {
		System.out.println(type);
		System.out.println(brand);
		System.out.println(price);
		System.out.println(batteryCap);
	}
}

public class Vehicle_Constructor_26_10 {

	public static void main(String[] args) {
		ElectricCar c1 = new ElectricCar("EV", "Mahindra",1400000, 3.2);
		c1.display();
	}

}
