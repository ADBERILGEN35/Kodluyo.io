package Concrete;

import Abstracts.BaseCustomerManager;
import Abstracts.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }



    @Override
    public void save(Customer customer) {

        if (customerCheckService.checkPerson(customer)) {
            super.save(customer);
        } else {
            System.out.println("Not a valid person!");
        }

    }
}