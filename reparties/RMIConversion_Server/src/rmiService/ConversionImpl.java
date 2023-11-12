package rmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConversionImpl extends UnicastRemoteObject implements IConversion {
	public ConversionImpl() throws RemoteException {
        super();
        // Call the constructor of the mother class "UnicastRemoteObject"
        // this will help initialise the functionalities of remote communication
    }

	public double convertirMontant(double mt) {
		return mt*3.3;
	}
}
