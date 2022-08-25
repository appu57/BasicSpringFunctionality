package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Mongoclass;
import com.example.demo.repository.ItemRepositry;

@Service
public class ServiceImplementations implements Services {

	@Autowired
	private ItemRepositry itemrepo;
	
	
	@Override
	public String save(Mongoclass Tutorial) {
		// TODO Auto-generated method stub
		return itemrepo.save(Tutorial).getId();
		
	}


	@Override
	public List<Mongoclass> get() {
		// TODO Auto-generated method stub
		return itemrepo.findAll();
	}


	@Override
	public String serve() {
		// TODO Auto-generated method stub
		itemrepo.deleteAll();
		return "Deleted";
	}


	@Override
	public Mongoclass getbyid(String id) {
		// TODO Auto-generated method stub
		return itemrepo.findById(id).get();
	}


	@Override
	public String deletebyid(String id) {
		// TODO Auto-generated method stub
		itemrepo.deleteById(id);
		return "Deleted";
	}



}
