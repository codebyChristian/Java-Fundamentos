package com.codebychristian.algoritmos;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
// Em um espaço de memória há 5 divisões, começando do 0, 1, 2, 3, 4;		
		int[] numbers = new int[5];
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Adicione um número a lista!");
			int number = scanner.nextInt();
			numbers[i] = number;
		}
		// Algoritmo de Busca:
		System.out.println("---BUSCA LINEAR---");
		System.out.println("Digite um número para saber a posição na lista: ");
		int busca = scanner.nextInt();
		int marcadorResultado = -1;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] == busca) {
				marcadorResultado = i;
			} 
		}
		if (marcadorResultado < 0) {
			System.out.println("Número não encontrado na lista.");
		} else {
			System.out.println(String.format("O número %d está na posição %d.", busca, marcadorResultado));
		}		
		// Fim Algoritmo de Busca:		
		System.out.println("Vetor");
		imprimirArray(numbers);
		scanner.close();		
	}
	
	private static void imprimirArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
