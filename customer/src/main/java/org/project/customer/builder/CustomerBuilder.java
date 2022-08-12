package org.project.customer.builder;

import lombok.Builder;
import org.project.customer.model.Customer;
import org.project.customer.service.CustomerRegistrationRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Builder
@Service
public class CustomerBuilder implements Converter<Customer, CustomerRegistrationRequest> {


    @Override
    public Customer converter(CustomerRegistrationRequest request) {
        return Customer.builder()
                .firstName(request.firstName())
                .email(request.email())
                .phone(request.phone())
                .address(request.address())
                .city(request.city())
                .state(request.state())
                .zip(request.zip())
                .build();
    }
}
