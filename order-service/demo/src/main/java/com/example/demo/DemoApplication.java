package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public String home() {
		return "Welcome to Order Service!";
	}

	@GetMapping("/orders")
	public List<String> getOrders() {
		return List.of("Order-001", "Order-002", "Order-003");
	}
}

