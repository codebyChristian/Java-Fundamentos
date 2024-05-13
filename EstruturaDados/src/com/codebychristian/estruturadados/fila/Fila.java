package com.codebychristian.estruturadados.fila;

import com.codebychristian.estruturadados.listaligadas.ListaLigada;

public class Fila<T> {
	
	private ListaLigada<T> elementos;
	
	public Fila() {
		this.elementos = new ListaLigada<T>();
	}
	
	public void enfileirar(T elemeto) {
		this.elementos.insere(elemeto);
	}
	
	public T desenfileirar() {
		if(estaVazio()) {
			return null;
		}
		T resultado = this.elementos.recuperar(0);
		this.elementos.remover(0);
		return resultado;
	}
	
	public boolean estaVazio() {
		return this.elementos.listaVazia();
	}

	@Override
	public String toString() {
		return "Fila [" + elementos.toString() + "]";
	}

	
	
}
