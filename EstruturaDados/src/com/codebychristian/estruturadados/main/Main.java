package com.codebychristian.estruturadados.main;

import java.util.Scanner;

import com.codebychristian.estruturadados.modelos.Pessoa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--QUAL OPÇÃO--");
		System.out.println("1. Gerenciar memória");
		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();
		
		switch (opcao) {
		case 1:
			fazerGerenciamentoMemoria();
			
			break;
		}
		scanner.close();
	}
	
	public static void fazerGerenciamentoMemoria() {
		int a = 3;
		System.out.println(a);
		int b = a;
		System.out.println(b);
		b = 2;
		System.out.println("***********");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);
		System.out.println("***********");
		Pessoa person1 = new Pessoa(0, "Chris");
		System.out.println(person1.toString());
		Pessoa person2 = new Pessoa(0, "Chris");   // Cria um novo espaço no Heap
		System.out.println(person2.toString());
		System.out.println("***********");
		person2.setNome("Chistian");      
		System.out.println(person1.toString());
		System.out.println(person2.toString());
		System.out.println(person1.equals(person2));
		
	}

}
