package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {


	public String method()
	{
		return "before main";
	}
	
	public String methods() {
		return "after main";
	}
	
	
	@GetMapping("/student")
	public Logger getStudent()
	{
		return new Logger("log","the","user","into","Logger");
	}
	
	@GetMapping("/students")
	public List<Logger> getStudents(){
		List<Logger> student=new ArrayList<>();
		student.add(new Logger("log","the","user","into","Logger"));
		student.add(new Logger("log","the","user","into","Logger"));
		student.add(new Logger("log","the","user","into","Logger"));
		student.add(new Logger("log","the","user","into","Logger"));
		student.add(new Logger("log","the","user","into","Logger"));
		student.add(new Logger("log","the","user","into","Logger"));
		student.add(new Logger("log","the","user","into","Logger"));
		student.add(new Logger("log","the","user","into","Logger"));
		student.add(new Logger("log","the","user","into","Logger"));
		student.add(new Logger("log","the","user","into","Logger"));
       return student;
		
	}
	@GetMapping("/request")
	public Logger getparam(@RequestParam(name="firstName") String firstName,@RequestParam(name="lastName")String lastName,
@RequestParam(name="age")String age,@RequestParam(name="product")String product,@RequestParam(name="price")String price) {
		return new Logger(firstName, lastName, age, product, price);
		
	}
	
	
	
	
	
	
	
	
	
}
