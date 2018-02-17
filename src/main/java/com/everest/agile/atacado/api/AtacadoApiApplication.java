package com.everest.agile.atacado.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AtacadoApiApplication {

	@Value("${app.ambiente.nome}")
	private String nomeAmbiente;
	
	public static void main(String[] args) {
		SpringApplication.run(AtacadoApiApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(){
		return args -> {
			System.out.println(">>>> O ambiente usado eh: " + nomeAmbiente);
		};
	}
}
