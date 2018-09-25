package com.lowes.bootifulmongodb.dal;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lowes.bootifulmongodb.model.Subscription;
/**
 * 
 * @author ankumar
 *
 */
@Repository
public interface SubscriptionMongoRepository extends MongoRepository<Subscription, String> {
}
