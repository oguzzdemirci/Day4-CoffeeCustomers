package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapterService implements CustomerCheckService {
    KPSPublicSoapProxy consumer= new KPSPublicSoapProxy();

    @Override
    public boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
        boolean results= consumer.TCKimlikNoDogrula(Long.parseLong(customer.getNationalId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
        if (results==true) {
            System.out.println("Başarılı Doğrulama !!!");

        }else {
            System.out.println("Başarısız Doğrulama !!!");
        }
        return results;
    }
}