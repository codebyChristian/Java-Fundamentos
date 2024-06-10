package com.codebychristian.estrutura.teste;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Adicionar 2 numeros
		
		int number1, number2, soma;
		
		System.out.println("----SOMA----");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		number1 = teclado.nextInt();
		System.out.println("Digite o segundo número: ");
		number2 = teclado.nextInt();
		soma = number1 + number2;
		System.out.println("A soma é: " + soma);
		

		teclado.close();
	}

}
