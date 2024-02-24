package com.hernandezalejandro.apiloginforjs;

import com.hernandezalejandro.apiloginforjs.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiloginforjsApplication {

    @Autowired
    ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(ApiloginforjsApplication.class, args);
	}
}
