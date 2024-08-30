package com.api.crud.apicrud;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApicrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApicrudApplication.class, args);
		Logger.getLogger("API CRUD iniciada.");
	}

}
