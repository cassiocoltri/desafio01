package com.desafios.desafio01;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.desafios.desafio01.entities.Order;
import com.desafios.desafio01.services.OrderService;

@SpringBootApplication
@ComponentScan({"com.desafios.desafio01"})
public class Desafio01Application {
	
	
	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		OrderService os = new OrderService();
		
		int cod = sc.nextInt();
		double basic = sc.nextDouble();
		double discont = sc.nextDouble();
		
		Order o1 = new Order(cod, basic, discont);
		
		System.out.println("Pedido código " + o1.getCod());
		System.out.println("Valor total: R$ " + String.format("%.2f", os.total(o1)));
		
		sc.close();
		
	}

}
