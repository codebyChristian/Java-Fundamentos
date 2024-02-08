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
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		scanner.close();
		
	}

}
