package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;

import java.rmi.RemoteException;


public class  SCustomerCheckManager implements CustomerCheckService {


    @Override
    public boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
        return true;
    }
}