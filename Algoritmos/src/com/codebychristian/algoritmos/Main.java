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
		
		// Melho caso: N * N = N²  - O(N²) 
		// Pior caso: N * N = N²  - O(N²)		
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
