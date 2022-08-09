package org.project.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "fraud_check_history")
public class FraudCheckHistory {

    @MongoId
    private String id;
    private String customerId;
    private Boolean isFraudster;
    private Date createdAt;
}
