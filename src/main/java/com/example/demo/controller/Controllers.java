package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Mongoclass;
import com.example.demo.repository.ItemRepositry;
import com.example.demo.services.Services;



@RestController
public class Controllers {
	
	@Autowired
	private Services service;
	
	@Autowired
	private ItemRepositry itemrepo;
	
	
	@GetMapping("/get")
	public List<Mongoclass> display() {
		return service.get();
	}
	
	
	@PostMapping("/additem")
	public String create(@RequestBody Mongoclass Tutorial  )
	{	
		    return service.save(Tutorial);		
	}
	
//  Two way of adding data one using services one using ResponseEntity
//	@PostMapping("/trial")
//	public ResponseEntity<String> store(@RequestBody Mongoclass item)
//	{
//		itemrepo.save(item);
//		return new ResponseEntity<String>("Object Inserted",HttpStatus.OK);
//	}
	
	@DeleteMapping("/subtract")
	public String delete()
	{
		return service.serve();
	}
	
	
	@GetMapping("/get/{id}")
	public Mongoclass get(@PathVariable String id)
	{
		return service.getbyid(id);
	}
	
	 @DeleteMapping("/delete/{id}")
	 public String deleteid(@PathVariable String id)
	 {
		 return service.deletebyid(id);
	 }
    
	
}
