import Concrete.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.rmi.RemoteException;
import java.time.LocalDate;

import Adapters.MernisAdapterService;

public class Main {

    public static void main(String[] args) throws RemoteException {
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisAdapterService());
        customerManager.Save(new Customer(1,"Oguz","Demirci",LocalDate.of(1995,04,21),"123145654"));

    }
}
