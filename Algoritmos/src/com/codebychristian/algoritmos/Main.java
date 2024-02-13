package com.codebychristian.algoritmos;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
// Em um espaço de memória há 5 divisões, começando do 0, 1, 2, 3, 4;		
		int[] numbers = new int[5];
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("O Array terá 5 números! Digite eles.");
			int number = scanner.nextInt();
			numbers[i] = number;
		}
		
		// Inicio Ordenação -- SELECTION SORT --
		// Vetor desodernado
		imprimirArray(numbers);
		for (int i = 0; i < numbers.length; i++) {
			int menorAlgoritmo = i;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] < numbers[menorAlgoritmo]) {
					menorAlgoritmo = j;
				}
			}
			// Aqui irá ocorre a seleção
			int temp = numbers[menorAlgoritmo];
			numbers[menorAlgoritmo] = numbers[i];
			numbers[i] = temp;
		}
		System.out.println("Vetor ordenado!");
		imprimirArray(numbers);
		// Fim Ordenação -- SELECTION SORT --
				
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
