package com.codebychristian;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner saida = new Scanner(System.in);
		Scanner saida1 = new Scanner(System.in);
		
		System.out.println("Olá! Qual seu nome? ");
		String nome = saida.nextLine(); 
		
		System.out.println("Digite sua idade! Favor");
		String idade = saida1.nextLine();
		
		System.out.println("Olá, " + nome);
		System.out.println("Não parece que você tem " + idade);
		
		saida.close();
		saida1.close();
		
		
		System.out.println("Olá, mundo!");
		System.out.print("Ola! Mundo! \n");
		System.out.print("Olá Mundo! Novamente.");
	}

}
