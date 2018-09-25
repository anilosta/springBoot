package com.lowes.bootifulmongodb.dal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lowes.bootifulmongodb.model.Subscription;
/**
 * 
 * @author ankumar
 *
 */
@Repository
public class SubscriptionDALImpl implements SubscriptionDAL {
	
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private SubscriptionMongoRepository subscriptionRepository;
	
	@Override
	public String addNewSubscription(Subscription subscription) {
		return subscriptionRepository.save(subscription).getId();
	}

	@Override
	public String addBulkSubscription(Subscription subscription, int loopCount) {
		LOG.info("Bulk Create subscriptions.");
		List<Subscription> subscriptionList = new ArrayList<>();
		Subscription ssubs = null;
		for (int i = 0; i < loopCount; i++) {
			ssubs = new Subscription();
			// ssubs.setId(UUID.randomUUID().toString());
			ssubs.setDescription(subscription.getDescription());
			ssubs.setFrequency(subscription.getFrequency());
			ssubs.setParentId(subscription.getParentId());
			ssubs.setSequence(subscription.getSequence());
			ssubs.setTitle(subscription.getTitle());
			ssubs.setType(subscription.getTitle());
			subscriptionList.add(ssubs);
		}
		subscriptionRepository.save(subscriptionList);
		return "Done";
	}

	@Override
	public List<Subscription> getAllSubscriptions() {
		LOG.info("Getting all subscriptions.");
		Iterable<Subscription> findAll = subscriptionRepository.findAll();
		return  (List<Subscription>) makeCollection(findAll);
	}
	



	@Override
	public Subscription getOneSubscriptions(String id) {
		LOG.info("Getting one subscriptions.");
		Subscription findOne = subscriptionRepository.findOne(id);
		return  findOne;
	}
	

	public static <E> Collection<E> makeCollection(Iterable<E> iter) {
	    Collection<E> list = new ArrayList<E>();
	    for (E item : iter) {
	        list.add(item);
	    }
	    return list;
	}

	
}
