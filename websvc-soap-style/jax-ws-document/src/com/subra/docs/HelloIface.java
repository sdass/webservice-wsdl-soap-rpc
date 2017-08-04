package com.subra.docs;

import java.util.List;

import javax.jws.WebService;

import com.subra.entity.Person;

@WebService
public interface HelloIface {
	
	public  String sayHello(String name);
	
	public  List<Person> getAllList();
	
	public  Person getPerson(int age);

}
