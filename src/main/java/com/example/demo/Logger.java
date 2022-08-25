package com.example.demo;


public class Logger
{
	private String firstName;
	private String lastName;
	private String age;
	private String product;
	private String price;
	
	public Logger(String firstName,String lastName,String age,String product,String price){
		super();
		this.firstName=firstName;
		this.lastName = lastName;
		this.age = age;
		this.product = product;
		this.price = price;
	}


	
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
	
	
}


