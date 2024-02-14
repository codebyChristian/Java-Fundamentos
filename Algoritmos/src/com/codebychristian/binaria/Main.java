package com.codebychristian.binaria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Inicio Busca Binária
		
		int[] numbers = new int[5];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("Digite 5 números em sequência:");
			int userNumber  = scanner.nextInt();
			numbers[i] = userNumber;
		}
		//Busca Binária Inicio
		int resultado = -1;
		int inicio = 0;
		int meio = 0;
		int fim = numbers.length - 1;
		
		System.out.println("Qual número a ser encontrado?");
		int numeroBusca = scanner.nextInt();
		
		while (inicio <= fim) {
			meio = (inicio + fim) / 2;
			// Busca a direita
			if (numbers[meio] < numeroBusca) {
				inicio = meio + 1;
			// Busca a esquerda	
			} else if (numbers[meio] > numeroBusca) {
				fim = meio - 1;
			} else if (numbers[meio] == numeroBusca) {
				resultado = meio;
				break;
			}
		}
		if (resultado < 0) {
			System.out.println("Número não encontrado no Array:");
		} else {
			System.out.println(String.format("O número %d está na posição %d.", numeroBusca, resultado));
		}
		
		
		//Busca Binária Fim
		imprimirArray(numbers);
		scanner.close();
	}
	
	//Impressão
	private static void imprimirArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
