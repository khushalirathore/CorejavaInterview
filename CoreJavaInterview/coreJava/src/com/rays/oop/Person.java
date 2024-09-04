package com.rays.oop;

public class Person {

	private String name;
	private int age;

	public Person(String name, int age) {

		this.name = name;
		this.age = age;
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

	public static void main(String[] args) {

		Person p = new Person("tftu", 89);
		p.setName("khushali");
		p.setAge(21);

		System.out.println(p.getAge() + " , " + p.getName());
	}

}
