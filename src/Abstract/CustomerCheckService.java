package Abstract;

import Entities.Customer;

import java.rmi.RemoteException;

public interface CustomerCheckService {

    public  boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
}
