package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Mongoclass;

public interface Services {

	 String save(Mongoclass Tutorial);

	List<Mongoclass> get();
	
    String serve();

	Mongoclass getbyid(String id);

	String deletebyid(String id);

	

}
