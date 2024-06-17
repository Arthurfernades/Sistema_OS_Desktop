package com.A5.SistemaOS;

import com.A5.SistemaOS.view.DashBoard;
import com.A5.SistemaOS.view.Inicio;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaOsApplication {

	public static void main(String[] args) {

		DashBoard inicio = new DashBoard();
		inicio.setVisible(true);

		SpringApplication.run(SistemaOsApplication.class, args);

	}
}
