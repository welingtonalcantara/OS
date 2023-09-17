package br.com.osdev.os;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class OsApplication {
	@GetMapping
	public String getHomeTeste() {
		return "OS - API - Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(OsApplication.class, args);
	}

}
