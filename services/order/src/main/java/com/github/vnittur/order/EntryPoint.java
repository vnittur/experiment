package com.github.vnittur.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EntryPoint {
	private static final Logger log = LoggerFactory.getLogger(EntryPoint.class);
	public static void main(String [] args)
	{
		log.info("Starting the application");
		SpringApplication.run(EntryPoint.class, args);
		log.info("Application Started");
	}
}
