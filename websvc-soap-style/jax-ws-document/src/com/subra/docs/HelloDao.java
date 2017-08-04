package com.subra.docs;

import java.util.ArrayList;
import java.util.List;

import com.subra.entity.Person;

public class HelloDao {
	static List<Person> tosend = new ArrayList<Person>();
	
	static String mm = "dfdf"; 
	
	static {
		tosend.add(new Person("Mask", "Dave", 23));
		tosend.add(new Person("Dolly", "Swan", 19));
		tosend.add(new Person("Lusky", "Klan", 53));
		//sayHello("df"); not allowed 
		
	}
	
	public String sayHello(String name) {
		
		System.out.println(mm);// from instance context I can access static variable
		return "Here " + name;
	}

	//@Override
	public List<Person> getAllList() {
		 
		tosend.add(new Person("a", "f", 2));

		 return tosend;
	}

	//@Override
	public Person getPerson(int age) {
		// TODO Auto-generated method stub
		
		new Person("Abc", "Kfc", 23);
		return tosend.get(0);
	}

}
