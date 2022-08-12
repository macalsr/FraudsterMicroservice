package org.project.customer.service;

import lombok.AllArgsConstructor;
import org.project.customer.repository.CustomerRepository;
import org.project.customer.builder.CustomerBuilder;
import org.project.customer.model.Customer;
import org.project.customer.web.rest.FraudCheckResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository repository;
    private final CustomerBuilder builder;
    private final RestTemplate restTemplate;

    public void registerCustomer(CustomerRegistrationRequest request) {
      Customer customer = builder.converter(request);
        //todo: check if email not taken
        //todo: check if email is valid
        repository.save(customer);
        repository.saveAndFlush(customer);
        FraudCheckResponse fraudCheckResponse = restTemplate.getForObject("http://FRAUD/api/v1/fraud-check/{customerId)",
                FraudCheckResponse.class,
                customer.getId());

        if(Objects.requireNonNull(fraudCheckResponse).isFraudster()){
            throw new IllegalStateException("fraudster");
        }

        //todo: check if fraudster
        //todo: send notification
    }

}
