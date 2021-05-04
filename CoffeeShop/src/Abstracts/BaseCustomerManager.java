package Abstracts;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

    @Override
    public void save(Customer customer) {
        System.out.printf("Veritabanına Kaydedildi :  " + customer.getFirstName());

    }
}