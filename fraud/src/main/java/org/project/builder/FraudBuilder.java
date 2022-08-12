package org.project.builder;

import lombok.Builder;
import org.project.model.FraudCheckHistory;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Builder
public class FraudBuilder implements Converter<FraudCheckHistory, FraudCheckHistory> {

    @Override
    public FraudCheckHistory converter(FraudCheckHistory clss) {
        return FraudCheckHistory.builder()
                .customerId(clss.getCustomerId())
                .createdAt(new Date())
                .isFraudster(false).build();    }
}
