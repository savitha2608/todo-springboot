package com.springframework.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

@SpringBootApplication
public class TodoSpringbootApplication extends SpringBootServletInitializer{
	
	
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(TodoSpringbootApplication.class);
	        
	    }
	 
	 @Bean
		public ResourceBundleMessageSource messageSource() {
		    ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		    source.setBasenames("messages"); // name of the resource bundle
		    source.setUseCodeAsDefaultMessage(true);  
		    return source;
		}   
	 
	 
	 public static void main(String[] args) {
			SpringApplication.run(TodoSpringbootApplication.class, args);
		}
	 
	
	

}
