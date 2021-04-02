package com.capg.dac.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "News")
public class News {

@Id	
private String id;
private String description;

public News(String id, String description) {
	super();
	this.id = id;
	this.description = description;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

@Override
public String toString() {
	return "News [id=" + id + ", description=" + description + "]";
}

}
