package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.swagger2.annotations.EnableSwagger2;



@ComponentScan({"com.example.demo.repository,com.example.demo.confg,com.example.demo.controller,com.example.demo.services,com.example.demo.model"})
@EnableSwagger2
@SpringBootApplication
public class DemoApplication {

	
	
	public static void main(String[] args) {
		
		
		 SpringApplication.run(DemoApplication.class, args);
//        Logger component= applicationContext.getBean(Logger.class);
//        System.out.println(component.getMessage()); To interact between java classes logger is the class that is mentioned in other java class using which we create applicationcontext.getBean(logger.class) use the name u have used in other class
        
		 
//		 @Bean
//		 @LoadBalanced
//		 public RestTemplate resttemplate{
//			 return new RestTemplate();
//		 }
		  
		
	}

}
