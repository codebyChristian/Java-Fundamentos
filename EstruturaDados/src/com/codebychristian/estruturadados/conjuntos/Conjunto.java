package com.codebychristian.estruturadados.conjuntos;

import com.codebychristian.estruturadados.listaligadas.ListaLigada;

public class Conjunto<T> {
	// aula: 998
	// Estruturas que não permiti dados duplicados
	
	private ListaLigada<T> elementos;
	
	public Conjunto() {
		this.elementos = new ListaLigada<T>();
	}
	
	public void insere(T elemento) {
		this.elementos.insere(elemento);
	}
	
	public void insereEm(int posicao, T elemento) {
		this.elementos.inserirEm(posicao, elemento);
	}
	
	public void inserePrimeiro(T elemento) {
		this.elementos.inserirPrimeiro(elemento);
	}
	
	public void insereUltimo(T elemento) {
		this.elementos.inserirUltimo(elemento);
	}
	
	public void recuperar(int posicao) {
		this.elementos.recuperar(posicao);
	}
	
	public boolean estaVazio() {
		return this.elementos.listaVazia();
	}
	
	public int tamanho() {
		return this.elementos.tamanho();
	}
	
	public boolean contem(T elemento) {
		return this.elementos.contem(elemento);
	}
	
	public int indeci(T elemento) {
		return this.elementos.indeci(elemento);
	}
	
	public void remove(int posicao) {
		this.elementos.remover(posicao);
	}
	
	public void remove(T elemento) {
		this.elementos.remover(elemento);
	}

}
