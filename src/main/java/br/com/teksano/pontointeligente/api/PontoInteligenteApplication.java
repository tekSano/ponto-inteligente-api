package br.com.teksano.pontointeligente.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
//@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = false)
public class PontoInteligenteApplication {

	public static void main(String[] args) {

		SpringApplication.run(PontoInteligenteApplication.class, args);
	}
}
