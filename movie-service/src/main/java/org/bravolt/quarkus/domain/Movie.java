package org.bravolt.quarkus.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.quarkus.runtime.annotations.RegisterForReflection;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@RegisterForReflection
public class Movie {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

	String title;
	
	String description;	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
