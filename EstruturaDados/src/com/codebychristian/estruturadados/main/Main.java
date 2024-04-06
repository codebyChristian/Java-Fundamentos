package com.codebychristian.estruturadados.main;

import java.util.Scanner;

import com.codebychristian.estruturadados.listaligadas.ListaLigada;
import com.codebychristian.estruturadados.modelos.Pessoa;
import com.codebychristian.estruturadados.vetores.Vetor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--QUAL OPÇÃO--");
		System.out.println("1. Gerenciar memória");
		System.out.println("2. Vetores");
		System.out.println("3. Lista Ligada");
		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();

		switch (opcao) {
		case 1:
			fazerGerenciamentoMemoria();
			break;
		case 2:
			fazerVetor();
			break;
		case 3:
			fazerListaLigada();
			break;
		}

		scanner.close();
	}

	private static void fazerListaLigada() {
		ListaLigada<Pessoa> listaPessoas = new ListaLigada<Pessoa>();
		listaPessoas.insere(new Pessoa(1, "Christian"));
		listaPessoas.insere(new Pessoa(2, "Ernany"));
		listaPessoas.insere(new Pessoa(3, "Sabad"));
		listaPessoas.inserirEm(1, new Pessoa(4, "Bit"));
		listaPessoas.inserirPrimeiro(new Pessoa(5, "Aççougue"));
		listaPessoas.inserirUltimo(new Pessoa(6, "Gravidade"));
		System.out.println(listaPessoas.toString());
		Pessoa p = listaPessoas.recuperar(1);
		Pessoa pessoaErrada = new Pessoa(50, "F50");
		System.out.println(listaPessoas.contem(p));
		System.out.println(listaPessoas.contem(pessoaErrada));
		System.out.println(listaPessoas.indeci(p));
		System.out.println(listaPessoas.indeci(pessoaErrada));
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
		System.out.println(a == b);
		System.out.println("***********");
		Pessoa person1 = new Pessoa(0, "Chris");
		System.out.println(person1.toString());
		Pessoa person2 = new Pessoa(0, "Chris"); // Cria um novo espaço no Heap
		System.out.println(person2.toString());
		System.out.println("***********");
		person2.setNome("Chistian");
		System.out.println(person1.toString());
		System.out.println(person2.toString());
		System.out.println(person1.equals(person2));

	}

	public static void fazerVetor() {
		Vetor<Pessoa> vetorPessoa = new Vetor<Pessoa>(); // 0 1 2 3 4
		vetorPessoa.inserir(new Pessoa(1, "CR7 7"));
		vetorPessoa.inserir(new Pessoa(2, "Chistian 6"));
		vetorPessoa.inserir(new Pessoa(3, "Maquina 5"));
		vetorPessoa.inserir(new Pessoa(4, "Besta Injaulada 4"));
		vetorPessoa.inserir(new Pessoa(5, "Bolso 3"));
		vetorPessoa.inserirArrey(1, new Pessoa(6, "Siiiiiii "));
		System.out.println(vetorPessoa);
		System.out.println("Lista Arrays");
		for (int i = 0; i < vetorPessoa.tamanho(); i++) {
			System.out.println(vetorPessoa.recuperarArrey(i).getNome());
		}
		// recurar no posicao 1, referencia com indice
		Pessoa p1 = vetorPessoa.recuperarArrey(1);
		Pessoa indicErrado = new Pessoa(15, "Perido");
		System.out.println(vetorPessoa.contemParametro(p1));
		System.out.println(vetorPessoa.contemParametro(indicErrado));
		System.out.println(vetorPessoa.indice(p1));
		System.out.println(vetorPessoa.indice(indicErrado));
		// remover
		vetorPessoa.remove(2);
		System.out.println(vetorPessoa);
		vetorPessoa.remove(p1);
		System.out.println(vetorPessoa);
	}

}
