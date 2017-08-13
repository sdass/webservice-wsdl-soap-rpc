package com.subra;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import com.subra.AddSubstractSvcStub.Add;
import com.subra.AddSubstractSvcStub.AddResponse;

public class Axis2Client {
	public static void main(String[] args) throws RemoteException{
		System.out.println("begins");
		AddSubstractSvcStub serviceStub =  new AddSubstractSvcStub();
		Add addparam = new Add();
		addparam.setA(5); addparam.setB(7);
		AddResponse adresp =  serviceStub.add(addparam);
		int wow_retadd = adresp.get_return();
		System.out.println("wow_retadd=" + wow_retadd);
		
		com.subra.AddSubstractSvcStub.Substract substractparam = new com.subra.AddSubstractSvcStub.Substract();
		
		substractparam.setA(17); substractparam.setB(27);
		
		com.subra.AddSubstractSvcStub.SubstractResponse sub_ret = serviceStub.substract(substractparam);
		int toungeout_substract_ret = sub_ret.get_return();
		System.out.println("toungeout_substract_ret=" + toungeout_substract_ret);
		
		
		
				
	}

}
