package com.codebychristian.estruturadados.main;

import java.util.Scanner;

import com.codebychristian.estruturadados.conjuntos.Conjunto;
import com.codebychristian.estruturadados.fila.Fila;
import com.codebychristian.estruturadados.listaligadas.ListaDuplaLigada;
import com.codebychristian.estruturadados.listaligadas.ListaLigada;
import com.codebychristian.estruturadados.modelos.Pessoa;
import com.codebychristian.estruturadados.pilha.Pilha;
import com.codebychristian.estruturadados.vetores.Vetor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--ESCOLHA UMA ESTRUTURA DE DADOS--");
		System.out.println("1. Gerenciar memória");
		System.out.println("2. Vetores");
		System.out.println("3. Lista Ligada");
		System.out.println("4. Lista Duplamente Ligada");
		System.out.println("5. Pilha");
		System.out.println("6. Fila");
		System.out.println("7. Conjunto");
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
		case 4:
			fazerListaDuplaLigada();
			break;
		case 5:
			fazerPilha();
			break;
		case 6:
			fazerFila();
			break;
		case 7:
			fazerConjunto();
			break;
		}

		scanner.close();
	}

	private static void fazerConjunto() {
		Conjunto<Pessoa> conjuntoPessoas = new Conjunto<Pessoa>();
		System.out.println(conjuntoPessoas.estaVazio());
		System.out.println(conjuntoPessoas.insere(new Pessoa(1, "Name1")));
		System.out.println(conjuntoPessoas.insere(new Pessoa(3, "Name3")));
		System.out.println(conjuntoPessoas);
		System.out.println(conjuntoPessoas.insere(new Pessoa(1, "Name1")));
		System.out.println(conjuntoPessoas);
		System.out.println(conjuntoPessoas.insere(new Pessoa(1, "Name1")));
		System.out.println(conjuntoPessoas);
	}

	private static void fazerFila() {
		Fila<Pessoa> filaPessoas = new Fila<Pessoa>();
		System.out.println(filaPessoas.estaVazio());
		filaPessoas.enfileirar(new Pessoa(1, "Pitu"));
		filaPessoas.enfileirar(new Pessoa(2, "Vodka"));
		filaPessoas.enfileirar(new Pessoa(3, "Black White"));
		System.out.println(filaPessoas.toString());
		Pessoa fila1 = filaPessoas.desenfileirar();
		Pessoa fila2 = filaPessoas.desenfileirar();
		System.out.println(fila1.toString());
		System.out.println(fila2.toString());
		System.out.println(filaPessoas.toString());
	}

	private static void fazerPilha() {
		Pilha<Pessoa> pilhaPessoas = new Pilha<Pessoa>();
		System.out.println(pilhaPessoas.estaVazio());
		pilhaPessoas.empilhar(new Pessoa(1, "CR7"));
		pilhaPessoas.empilhar(new Pessoa(2, "Chris"));
		pilhaPessoas.empilhar(new Pessoa(3, "Ernań"));
		Pessoa p1 = pilhaPessoas.desempilhar();
		Pessoa p2 = pilhaPessoas.desempilhar();
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}

	private static void fazerListaDuplaLigada() {
		ListaDuplaLigada<Pessoa> listaDuplaPessoa = new ListaDuplaLigada<Pessoa>();
		listaDuplaPessoa.insere(new Pessoa(1, "Arajá"));
		listaDuplaPessoa.insere(new Pessoa(2, "Bola"));
		listaDuplaPessoa.insere(new Pessoa(3, "Corina"));
		listaDuplaPessoa.inserirPrimeiro(new Pessoa(4, "Abocá"));
		listaDuplaPessoa.inserirUltimo(new Pessoa(5, "Centavo"));
		listaDuplaPessoa.inserirEm(2, new Pessoa(6, "Nav"));
		System.out.println(listaDuplaPessoa.toString());
		listaDuplaPessoa.remover(3);
		listaDuplaPessoa.remover(2);
		System.out.println(listaDuplaPessoa.toString());
		Pessoa p = listaDuplaPessoa.recuperar(0);
		Pessoa pessoaNenhuma = new Pessoa(20, "Não importa");
		System.out.println(listaDuplaPessoa.contem(p));
		System.out.println(listaDuplaPessoa.contem(pessoaNenhuma));
		System.out.println(listaDuplaPessoa.indeci(p));
		System.out.println(listaDuplaPessoa.indeci(pessoaNenhuma));
		for(int i = 0; i < listaDuplaPessoa.tamanho(); i++) {
			System.out.println(listaDuplaPessoa.recuperar(i).toString());
		}
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
		listaPessoas.remover(p);
		System.out.println(listaPessoas.toString());
		listaPessoas.remover(1);
		System.out.println(listaPessoas.toString());
		System.out.println("Lista Pessoas");
		for (int i = 0; i < listaPessoas.tamanho(); i++) {
			System.out.println(listaPessoas.recuperar(i).toString());
		}

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
