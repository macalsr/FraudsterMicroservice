package org.project.customer.builder;

import org.project.customer.model.Customer;
import org.project.customer.service.CustomerRegistrationRequest;

public class CustomerBuilder implements Converter<Customer, CustomerRegistrationRequest> {


    @Override
    public Customer converter(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .email(request.email())
                .phone(request.phone())
                .address(request.address())
                .city(request.city())
                .state(request.state())
                .zip(request.zip())
                .build();
        return customer;
    }
}
