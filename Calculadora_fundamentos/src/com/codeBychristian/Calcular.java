package com.codeBychristian;

import java.util.Scanner;

public class Calcular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*System.out.println("Digite qualquer messagem:");
		// nextLine = mostra a mensagem toda
		//String mensagem = number1.nextLine();
		// next = mostra a 1ª palavra até o 1º espaço
		String mensagem = number1.next();
		System.out.println(mensagem);*/
		

		
		// Aqui pega uma string e transforma para um número 
		
		//int numero1 = Integer.parseInt(number1.nextLine());
		  
		// Nesse não converte, a variável já espera um inteiro 

		//int numero2 = Integer.parseInt(number2.nextLine());
		
		System.out.println("Soma de números");
		
		System.out.println("Digite o primeiro número: ");
		
		Scanner number1 = new Scanner(System.in);
		
		int numero1 = number1.nextInt();
		
		// Qual a operação
		System.out.println("Digite a operação: ");
		char operacao = number1.next().charAt(0);
	
		System.out.println("Digite o segundo número: "); 
		
		int numero2 = number1.nextInt();

		// Interpolação
		System.out.println(String.format("Você quer fazer a operação %d %c %d", numero1, operacao, numero2));
		
		//int numero2 = number2.nextInt();
		
		//int soma = numero1 + numero2;
		  
		//System.out.println("A soma de " + numero1 + "" + operacao + numero2 + " = " + soma);	 
		
		number1.close();
		
	}

}
