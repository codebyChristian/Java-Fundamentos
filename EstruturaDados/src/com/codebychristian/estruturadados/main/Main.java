package com.codebychristian.estruturadados.main;

import java.util.Scanner;

import com.codebychristian.estruturadados.modelos.Pessoa;
import com.codebychristian.estruturadados.vetores.Vetor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--QUAL OPÇÃO--");
		System.out.println("1. Gerenciar memória");
		System.out.println("2. Vetores");
		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();
		
		switch (opcao) {
		case 1:
			fazerGerenciamentoMemoria();	
			break;
		case 2:
			fazerVetor();
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
	
	public static void fazerVetor() {
		Vetor<Pessoa> vetorPessoa = new Vetor<Pessoa>();   // 0 1 2 3 4
		vetorPessoa.inserir(new Pessoa(1, "CR7 7"));
		vetorPessoa.inserir(new Pessoa(2, "Chistian 6"));
		vetorPessoa.inserir(new Pessoa(3, "Maquina 5"));
		vetorPessoa.inserir(new Pessoa(4, "Besta Injaulada 4"));
		vetorPessoa.inserir(new Pessoa(5, "Bolso 3"));
		vetorPessoa.inserir(new Pessoa(6, "Siiiiiii 2"));
		System.out.println(vetorPessoa);
	}

}
