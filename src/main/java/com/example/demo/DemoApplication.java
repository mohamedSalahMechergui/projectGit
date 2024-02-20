package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static int factorielle(int n) {
		int resultat = 1;
		for (int i = 1; i <= n; i++) {
			resultat *= i;
		}
		return resultat;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
