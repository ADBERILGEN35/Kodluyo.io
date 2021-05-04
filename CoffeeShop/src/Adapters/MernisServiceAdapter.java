package Adapters;
import MernisServiceReference.KPSPublic;
import Abstracts.CustomerCheckService;
import Entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkPerson(Customer customer) {
        KPSPublic kpsPublic = new KPSPublic();
        return kpsPublic.getKPSPublicSoap().tcKimlikNoDogrula(
                Long.parseLong(customer.getNationalityID()),
                customer.getFirstName().toUpperCase(),
                customer.getLastName().toUpperCase(),
                customer.getDateOfBirth().getYear());


    }


}