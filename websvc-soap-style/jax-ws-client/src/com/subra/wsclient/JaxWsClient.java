package com.subra.wsclient;

import java.util.List;

import javax.xml.namespace.QName;

import com.subra.docs.HelloImpl;
import com.subra.docs.HelloImplService;
import com.subra.docs.Person;

public class JaxWsClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* http://localhost:9993/arbitray/HelloEmployeeSvc?wsdl
		 [go to] C:/users/Nielam/Programming/Java/workspace/eclipse/jax-ws-client
		 [next execute] wsimport -keep -verbose -s ./src -d ./bin http://localhost:9993/arbitray/HelloEmployeeSvc?wsdl
		*/
		/* http://localhost:9993/arbitray/HelloEmployeeSvc?wsdl */
		System.out.println("client calls");
		//HelloImpl
		//1st way
		HelloImpl helloservce = new HelloImplService().getPort(new QName("http://docs.subra.com/", "HelloImplPort"), HelloImpl.class);
		Person p = helloservce.getPerson(23);
		System.out.println(p.getFirst() + " " + p.getLast() + " " + p.getAge());
		System.out.println(helloservce.sayHello("Dunkin Fish!"));
		List<Person> lp = helloservce.getAllList();
		for(Person a : lp){
			System.out.println(a.getFirst() + " " + a.getLast() + " " + a.getAge());
		}
		
		HelloImpl anewWaysvc = new HelloImplService().getHelloImplPort(); // 2nd way
		System.out.println("---------");
		System.out.println(helloservce.sayHello("Kosla Lion!"));
		

	}

}
