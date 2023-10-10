package br.com.osdev.ordem_servico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class OrdemServicoApplication {
	@GetMapping
	public String getHomeTeste() {
		return "ORDEM DE SERVIÇO - API - Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(OrdemServicoApplication.class, args);
	}

}
