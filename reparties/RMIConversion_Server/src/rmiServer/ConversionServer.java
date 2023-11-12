package rmiServer;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import rmiService.ConversionImpl;
import rmiService.IConversion;

public class ConversionServer {

	public static void main(String[] args) throws RemoteException, MalformedURLException {

		//reserve a port for the connection
		LocateRegistry.createRegistry(1099);

		// create remote object or skeleton
		ConversionImpl od = new ConversionImpl();
		
		System.out.print(od.toString());

		// rebind the remote object in the RMI register
		Naming.rebind("rmi://localhost:1099/conversionObject", od);

	}

}
