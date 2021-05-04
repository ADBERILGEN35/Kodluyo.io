import Abstracts.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setFirstName("Oğuzhan");
        customer1.setLastName("Taşyaran");
        customer1.setNationalityID("13265896896");
        customer1.setDateOfBirth(LocalDate.of(1995,3,23));

        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(customer1);
    }
}