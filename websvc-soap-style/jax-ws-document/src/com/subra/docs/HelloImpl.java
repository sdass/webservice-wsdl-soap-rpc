package com.subra.docs;

import java.util.List;

import javax.jws.WebService;

import com.subra.entity.Person;

@WebService
public class HelloImpl implements HelloIface {
	
	HelloDao dao = new HelloDao();
	
	@Override
	public String sayHello(String name) {
		return dao.sayHello(name);
	}

	@Override
	public List<Person> getAllList() {

		return dao.getAllList();
	}

	@Override
	public Person getPerson(int age) {
		return dao.getPerson(age);
	}

}




