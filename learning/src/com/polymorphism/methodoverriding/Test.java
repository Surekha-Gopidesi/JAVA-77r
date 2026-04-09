package com.polymorphism.methodoverriding;

class Test{
	public static void main(String[] args) {
		Animal a=new Animal();
		a.makeSound();
		Dog d=new Dog();
		d.makeSound();
	}
}