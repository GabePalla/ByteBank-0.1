package com.api.ByteBank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ByteBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(ByteBankApplication.class, args);
	}
	@GetMapping(path = "/statusteste")
	public String status() {
		return "MARAUENSE ONLINE";
	}

}
