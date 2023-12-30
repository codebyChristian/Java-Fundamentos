package com.codeBychristian;

import java.util.Scanner;

public class Calcular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Soma de números");
		
		Scanner number1 = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int numero1 = Integer.parseInt(number1.nextLine());
			
		
		Scanner number2 = new Scanner(System.in);
		System.out.println("Digite o segundo número: ");
		int numero2 = Integer.parseInt(number2.nextLine());
		
		int soma = numero1 + numero2;
		
		System.out.println("A soma de " + numero1 + " + "+ numero2 + " = " + soma);
		
		number1.close();
		number2.close();
		
	}

}
