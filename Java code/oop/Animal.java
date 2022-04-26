package com.vasanth.oop;

public class Animal {
	private String color;
	private String name;
	private int age;
	
	Animal(){}
	
	Animal(String color, String name, int age)
	{
		this.color=color;
		this.name=name;
		this.age=age;
	}

	public void eat() {
		System.out.println("Eating");
	}

	public void sleep() {
		System.out.println("Sleeping");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}

