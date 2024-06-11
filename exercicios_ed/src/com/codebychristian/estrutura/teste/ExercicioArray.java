package com.codebychristian.estrutura.teste;



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
		
		char[] myArray = name.toCharArray();
		
		for(char j : myArray) {
			System.out.println(j);
		}
		
	}

}
