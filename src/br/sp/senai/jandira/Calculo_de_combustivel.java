package br.sp.senai.jandira;

import java.util.Scanner;

public class Calculo_de_combustivel {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		double Kmporlitro;
		double Distancia;
		double Valorcombustivel;
		
		System.out.println("----------------------------------------------------------");
		System.out.println("                 Calculadora de combustível");
		System.out.println("----------------------------------------------------------");
		System.out.println();
		
		System.out.print("Modelo do veículo:");
		nome = teclado.nextLine();
		
		System.out.print("Quanto o seu veículo percorre com 1L em KM: ");
		Kmporlitro = teclado.nextDouble();
		
		System.out.print("distância que deseja percorrer em KM: ");
		Distancia = teclado.nextDouble();
		
		System.out.print("Quanto está o valor do combustível na sua região?: ");
		Valorcombustivel = teclado.nextDouble();
		System.out.println();
		
		System.out.println("----------------------------------------------");
		System.out.println("                  RESULTADO");
		System.out.println("----------------------------------------------");
		System.out.println();
		
		System.out.print("Modelo do veículo: ");
		System.out.println(nome);
		
		System.out.print("Autonomia: ");
		System.out.println(Kmporlitro);
		
		
		System.out.print("Distância a percorrer: ");
		System.out.println(Distancia);
		
		
		System.out.print("Valor do combustível: ");
		System.out.println(Valorcombustivel);
		System.out.println();
		
		double Combustivelutilizado = Distancia / Kmporlitro;
		double Gasto = Combustivelutilizado * Valorcombustivel;
		
		System.out.println("------------------------------------------");
		System.out.printf("Quantidade de combustível utilizado: %.2f" , Combustivelutilizado , "L");
		System.out.println();
		
		System.out.printf("Total gasto com a viagem: R$ %.2f" , Gasto);
		System.out.println();
		System.out.println("-----------------------------------------");
		
		
		

	}

}
