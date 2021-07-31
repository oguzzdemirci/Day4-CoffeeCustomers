package Concrete;

import Abstract.CustomerService;
import Entities.Customer;

import java.rmi.RemoteException;

public abstract class BaseCustomerManager implements CustomerService {
    @Override
    public final void Save(Customer customer) throws NumberFormatException, RemoteException {
        System.out.println("Save to db:" + customer.getFirstName());
    }
}