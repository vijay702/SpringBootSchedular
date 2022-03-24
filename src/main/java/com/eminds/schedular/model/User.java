package com.eminds.schedular.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String name;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User(Long id, String name) {
		super();
		Id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + "]";
	}
	
	
	public User(){
		
	}
	
	
	
}
