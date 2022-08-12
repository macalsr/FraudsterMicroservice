package org.project.service;

import org.project.builder.FraudBuilder;
import org.project.model.FraudCheckHistory;
import org.project.repository.FraudCheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraudCheckService {

    private final FraudCheckRepository repository;
    private final FraudBuilder builder;

    @Autowired
    public FraudCheckService(FraudCheckRepository repository, FraudBuilder builder, FraudBuilder builder1) {
        this.repository = repository;
        this.builder = builder1;
    }

    public boolean isFradulentCustomer(String customerId){
        FraudCheckHistory history = repository.findByCustomerId(customerId);
        repository.save(builder.converter(history));
        return false;
    }
}
