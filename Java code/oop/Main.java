package com.vasanth.oop;

public class Main {
	public static void main(String[] args) {
//		Animal animal=new Animal("brown","dog",10);
//		animal.setAge(20);
//		System.out.println(animal.getAge());
//		System.out.println(animal.getColor());
//		System.out.println(animal.getName());
//		animal.sleep();
//		animal.eat();
		
		Dog dog=new Dog();
		dog.sleep();
		dog.eat();
		dog.eat("Chicken");
		dog.setAge(10);
		System.out.println(dog.getAge());
	}
}
