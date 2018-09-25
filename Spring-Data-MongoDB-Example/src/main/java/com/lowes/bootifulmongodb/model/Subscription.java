package com.lowes.bootifulmongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 * 
 * @author ankumar
 *
 */
@Document
public class Subscription {
	@Id
	private String id;
	private String title;
	private String frequency;
	private String description;
	private String sequence;
	private String parentId;
	private String type;
//	private Set<String> users;

	public Subscription() {

	}

//	public Subscription(final String key) {
//		setKey(key);
//	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

//	public Set<String> getUsers() {
//		return users;
//	}
//
//	public void setUsers(Set<String> users) {
//		this.users = users;
//	}
}
