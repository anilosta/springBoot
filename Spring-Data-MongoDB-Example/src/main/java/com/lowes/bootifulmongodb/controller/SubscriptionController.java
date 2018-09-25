package com.lowes.bootifulmongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lowes.bootifulmongodb.dal.SubscriptionDAL;
import com.lowes.bootifulmongodb.model.Subscription;

/**
 * 
 * @author ankumar
 *
 */
@RestController
@RequestMapping(value = "/subscription")
public class SubscriptionController {

	@Autowired
	private SubscriptionDAL subscriptionDAL;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String addNewSubscription(@RequestBody Subscription subscription) {
		return subscriptionDAL.addNewSubscription(subscription);
	}

	@RequestMapping(value = "/bulkCreate", method = RequestMethod.POST)
	public String addBulkSubscription(@RequestBody Subscription subscription, @RequestHeader(value = "loopCount") int loopCount) {
		return subscriptionDAL.addBulkSubscription(subscription, loopCount);

	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public List<Subscription> getAllSubscriptions() {
		return subscriptionDAL.getAllSubscriptions();
	}

	@RequestMapping(value = "/getOne", method = RequestMethod.GET)
	public Subscription getOneSubscriptions(@RequestHeader(value="id") String id) {
		return subscriptionDAL.getOneSubscriptions(id);
	}
	

}