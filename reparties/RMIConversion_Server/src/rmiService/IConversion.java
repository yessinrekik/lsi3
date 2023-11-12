package rmiService;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IConversion extends Remote{
	// signature of the methode of conversion to implement
	// the method has for parameters a variable (type double) and returns a result (type double)
	double convertirMontant(double mt) throws RemoteException;
}
