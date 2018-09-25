package com.lowes.bootifulmongodb.dal;

import java.util.List;

import com.lowes.bootifulmongodb.model.Subscription;
/**
 * 
 * @author ankumar
 *
 */
public interface SubscriptionDAL {



	public String addNewSubscription(Subscription subscription);

	public String addBulkSubscription(Subscription subscription, int loopCount);

	public List<Subscription> getAllSubscriptions();
	
	public Subscription getOneSubscriptions(String id) ;

	
}