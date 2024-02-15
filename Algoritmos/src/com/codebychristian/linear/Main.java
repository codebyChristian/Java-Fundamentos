package com.codebychristian.linear;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Array with five numbers
		int[] numbers = new int[5];
		
		Scanner scanner = new Scanner(System.in);
		
		// Melhor caso: 1 posição  - O(1) 
		// Pior caso: n posição
		// O(n) 
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("Digite 5 números em seguida!");
			int userNumbers = scanner.nextInt();
			numbers[i] = userNumbers;
		}
		//Search position
		System.out.println("Busca linear");
		System.out.println("Digite um número para descobrir sua posição!");
		int positionNumber = scanner.nextInt();
		int markPosition = -1;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == positionNumber) {
				markPosition = i;
				break;
			}
		}
		if(markPosition < 0) {
			System.out.println("Número não encontrado.");
		} else {
			System.out.println(String.format("O número %d está na posição %d.", positionNumber, markPosition));
		}
		scanner.close();
	}

}
