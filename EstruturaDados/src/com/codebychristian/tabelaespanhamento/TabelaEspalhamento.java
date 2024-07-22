package com.codebychristian.tabelaespanhamento;

import com.codebychristian.estruturadados.listaligadas.ListaLigada;

public class TabelaEspalhamento<T> { // tipo: T = generico
	// Uma lista ligada para criar os indexedores: 0, 1, 2....
	// 0: p1, p2, p7 ---> Cada elemento terá uma lista ligada
	// 1: p3, p5, p6 ---> Cada elemento terá uma lista ligada
	// 3: p4 ---> Cada elemento terá uma lista ligada
	// por isso ela não terá ordem

	// Implementando explicação acima
	private ListaLigada<ListaLigada<T>> elementos;                         
	private int numeroCatagorias = 16;
	private int tamanho;

	public TabelaEspalhamento() {
		// Isso inicializa a lista ligada dos indexadors
		this.elementos = new ListaLigada<ListaLigada<T>>();
		for (int i = 0; i < this.numeroCatagorias; i++) {
			this.elementos.insere(new ListaLigada<T>());
		}
		this.tamanho = 0;
	}

	public boolean insere(T elemento) {
		// se dentro da categoria o elemento for repetido ele não será salvo
		if (elemento == null || this.contem(elemento)) {
			return false;
		}
		// insere o elemento sabendo que não há elementos repetidos
		int numeroEspalhamento = this.gerarNumeroEspanhalmento(elemento);
		ListaLigada<T> categoria = this.elementos.recuperar(numeroEspalhamento);
		categoria.insere(elemento);
		this.tamanho++;
		return true;
	}

	public void remover(T elemento) {
		int numeroEsplamento = this.gerarNumeroEspanhalmento(elemento);
		ListaLigada<T> categoria = this.elementos.recuperar(numeroEsplamento);
		categoria.remover(elemento);
		this.tamanho--;
	}

	public int tamanho() {
		return this.tamanho;
	}

	public boolean contem(T elemento) {
		int numeroEspalhamento = this.gerarNumeroEspanhalmento(elemento);
		ListaLigada<T> categoria = this.elementos.recuperar(numeroEspalhamento);
		return categoria.contem(elemento);
	}

	private int gerarNumeroEspanhalmento(T elemento) {
		return Math.abs(elemento.hashCode() % 16);
	}

	@Override
	public String toString() {
		return "TabelaEspalhamento [ elementos= " + elementos + "]";
	}

}
