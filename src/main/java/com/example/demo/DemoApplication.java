package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static int factorielle(int n) {
		int resultat = 1;
		for (int i = 1; i <= n; i++) {
			resultat *= i+1;
		}
		return resultat;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4, 5};

        // Utilisation des méthodes de JeanDupont
        int somme = JeanDupont.calculerSomme(tableau);
        double moyenne = JeanDupont.calculerMoyenne(tableau);

        System.out.println("Somme: " + somme);
        System.out.println("Moyenne: " + moyenne);
    }

}


