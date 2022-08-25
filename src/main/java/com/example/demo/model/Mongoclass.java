package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;


//@JsonInclude(JsonInclude.Include.NON_NULL) It includes only non null values if there r null values it discardss
@Document(collection="Tutorial")
public class Mongoclass {

	@Id
	private String id;
	
	private String name;
	private String password;
	private String email;
	private int age;
	private String gender;
	private String choice;
	public Mongoclass(String id,String name,String password,String email,int age,String gender,String choice)
	{
		super();
		this.id=id;
		this.name = name;
		this.password = password;
		this.email = email;
	    this.age = age;
        this.gender=gender;
        this.choice=choice;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getChoice() {
		return choice;
	}
	public void setChoice(String choice) {
		this.choice = choice;
	}
	
	
	


	
}
