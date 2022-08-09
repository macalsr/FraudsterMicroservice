package org.project.builder;

import org.project.model.FraudCheckHistory;

import java.util.Date;

public interface FraudBuilder {

    default FraudCheckHistory buildById(String customerId) {
        return FraudCheckHistory.builder()
                .customerId(customerId)
                .createdAt(new Date())
                .isFraudster(false).build();
    }


}
