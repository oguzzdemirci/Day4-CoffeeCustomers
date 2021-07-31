package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;

import java.rmi.RemoteException;

public class StarbucksCustomerManager extends BaseCustomerManager {
    CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;

    }

    public void save(Customer customer) throws NumberFormatException, RemoteException {

        if (customerCheckService.CheckIfRealPerson(customer)) {
            super.Save(customer);
        } else {
            System.out.println("Yanlýþ Giriþ !");
        }
    }
}
