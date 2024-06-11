package com.codebychristian.estrutura.teste;

import java.util.Arrays;

public class ExercicioArray {

	public static void main(String[] args) {
		// Soma de numeros de array
		int[] numberArray = {2, 4, 7, 7};
		int soma = 0;
		int i;
		
	
		for(i = 0; i < numberArray.length; i++) {
			soma += numberArray[i];
		}
		System.out.println("A soma do Array é: " + soma);

		// converter string para array
		String name = "Hello";
		
		// maneira facil de converter caractere por caractere
		char[] myArray = name.toCharArray();
		
		// mostrar todos as letras separadas
		for(char j : myArray) {
			System.out.println(j);
		}
		
		
		// Sort of Array
		String[] nomes = { "Pezão", "Galo Cego", "Zezão"};
		// função esta na biblioteca Arrays
		Arrays.sort(nomes);
		// for para mostrar a modificação
		for (String n : nomes) {
			System.out.println(n);
		}
		
	}

}
