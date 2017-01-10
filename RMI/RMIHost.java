import java.rmi.*;
import java.rmi.server.*;

interface AddServerInterface extends Remote {
	public int sum (int a, int b) throws RemoteException;
}

public class RMIHost extends UnicastRemoteObject implements AddServerInterface {
	RMIHost() throws RemoteException {
		super();
	}
	public int sum (int a, int b) {
		return a + b;
	}
}