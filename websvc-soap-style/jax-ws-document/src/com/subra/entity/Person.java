package com.subra.entity;

public class Person {

	private String first;
	private String last;
	private int age;
	
	
	
	public Person(String first, String last, int age) {
		super();
		this.first = first;
		this.last = last;
		this.age = age;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [first=" + first + ", last=" + last + ", age=" + age
				+ "]";
	}
	
	
	
}
