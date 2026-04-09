package com.inheritance.heirarchical;

public class Animal {
	String name;
	String habitate;
	
	public Animal(String name, String habitate) {
		super();
		this.name = name;
		this.habitate = habitate;
	}

	public void displayHabitate() {
		System.out.println("animal name :"+name);
		System.out.println("Animal habitate :"+habitate);
	}
}
class Mammal extends Animal{
	boolean isWarmblooded;

	public Mammal(String name, String habitate, boolean isWarmblooded) {
		super(name, habitate);
		this.isWarmblooded = isWarmblooded;
	}
	public void displayMammalInfo() {
		System.out.println("animal name :"+name);
		System.out.println("Animal habitate :"+habitate);
		System.out.println("Animal warmBlooded :"+isWarmblooded);
	}
	
}
class Bird extends Animal{
	Boolean canfly;

	public Bird(String name, String habitate, Boolean canfly) {
		super(name, habitate);
		this.canfly = canfly;
	}
	public void displayBirdInfo() {
		System.out.println("animal name :"+name);
		System.out.println("Animal habitate :"+habitate);
		System.out.println("fly :"+canfly);
	}
}
class Reptile extends Animal{
	boolean isColdBlooded;

	public Reptile(String name, String habitate, boolean isColdBlooded) {
		super(name, habitate);
		this.isColdBlooded = isColdBlooded;
	}
	public void displayReptileInfo() {
		System.out.println("animal name :"+name);
		System.out.println("Animal habitate :"+habitate);
		System.out.println("cold blooded :"+isColdBlooded);
	}
}
