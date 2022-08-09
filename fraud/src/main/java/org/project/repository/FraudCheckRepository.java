package org.project.repository;

import org.project.model.FraudCheckHistory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FraudCheckRepository extends MongoRepository<FraudCheckHistory, String> {

}
