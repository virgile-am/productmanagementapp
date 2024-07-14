package io.reflectoring.productmanagementapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("io.reflectoring.productmanagementapp.entity")
public class ProductmanagementappApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProductmanagementappApplication.class, args);
	}
}
