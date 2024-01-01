package com.codeBychristian;

import java.util.Scanner;

public class Calcular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Soma de números");
		
		Scanner number1 = new Scanner(System.in);
		
		/*System.out.println("Digite qualquer messagem:");
		// nextLine = mostra a mensagem toda
		//String mensagem = number1.nextLine();
		// next = mostra a 1ª palavra até o 1º espaço
		String mensagem = number1.next();
		System.out.println(mensagem);*/
		
		System.out.println("Digite o primeiro número: ");
		
		// Aqui pega uma string e transforma para um número 
		
		//int numero1 = Integer.parseInt(number1.nextLine());
		  
		// Nesse não converte, a variável já espera um inteiro 
		int numero1 = number1.nextInt();
		
		// Qual a operação
		System.out.println("Digite a operação: ");
		char operacao = number1.next().charAt(0);
		  
		  
		Scanner number2 = new Scanner(System.in);
		System.out.println("Digite o segundo número: "); //int numero2 =
		//int numero2 = Integer.parseInt(number2.nextLine()); int numero2 = number2.nextInt();
		
		int numero2 = number2.nextInt();
		
		int soma = numero1 + numero2;
		  
		System.out.println("A soma de " + numero1 + "" + operacao + numero2 + " = " + soma);
		 
		
		number1.close();
		number2.close();
		
	}

}
