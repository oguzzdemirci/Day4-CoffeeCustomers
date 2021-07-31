package Abstract;

import Entities.Customer;

import java.rmi.RemoteException;

public interface CustomerService {
       void Save(Customer customer) throws NumberFormatException, RemoteException;
}
