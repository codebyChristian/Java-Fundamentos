package com.codebychristian.estruturadados.vetores;

import java.util.Arrays;

public class Vetor<T> {
	
	private Object[] elementos;
	private int posicao;
	
	public Vetor(int capacidade) {
		this.elementos = new Object[capacidade];
		this.posicao = 0;
	}
	
	public Vetor() {
		this.elementos = new Object[3];         // 4 indices
		this.posicao = 0;
	}
	
	public void inserir(T element) {
		if(posicao >= this.elementos.length) {
			this.elementos = Arrays.copyOf(this.elementos, this.elementos.length + 1);
		}
		this.elementos[this.posicao] = element;
		posicao++;
	}
	
	@Override
	public String toString() {
		return "Vetor [elementos=" + Arrays.toString(elementos) + "]";
	}

	public void inserirArrey(int posicao, T element) {
		if(posicao > this.elementos.length) {
			throw new IllegalArgumentException(String.format("Posição inválida [%d]", posicao));
		}
		this.elementos[posicao] = element;
	}
	
	@SuppressWarnings("unchecked")
	public T recuperarArrey(int posicao) {
		return (T)this.elementos[posicao];
	}

}
         