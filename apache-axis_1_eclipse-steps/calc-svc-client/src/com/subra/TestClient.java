package com.subra;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;
import org.apache.axis.client.Service;

public class TestClient {

	public static void main(String[] args) throws MalformedURLException, RemoteException {
		System.out.println("It is");

		URL endpointUrl = new URL("http://localhost:8080/calc-svc/services/AddSubstractService");
		org.apache.axis.client.Service service = new Service();
		
		AddSubstractServiceSoapBindingStub stub = new AddSubstractServiceSoapBindingStub(endpointUrl, service);
		int ret_add = stub.add(5, 8);
		System.out.println("ret_add=" + ret_add);
		
		System.out.println("ret_substract=" + stub.substract(5, 8));
	}

}
