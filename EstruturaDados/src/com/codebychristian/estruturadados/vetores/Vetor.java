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
		if(this.elementos[posicao] != null) {
			// 1, 2, 3, 4  tranformar // 1, 5, 2, 3, 4
			Object[] arrayFinal = Arrays.copyOfRange(this.elementos, posicao, this.elementos.length);
			Object[] arrayInicio = new Object[posicao + 1];
			System.arraycopy(this.elementos, 0, arrayInicio, 0, posicao);
			arrayInicio[arrayInicio.length - 1] = element;
			// ArrayInicio = 1, 5
			// ArrayFinal = 2, 3, 4   (falta juntar)
			int juntarArray = arrayFinal.length + arrayInicio.length;
			this.elementos = new Object[juntarArray];
			System.arraycopy(arrayInicio, 0, this.elementos, 0, arrayInicio.length);
			System.arraycopy(arrayFinal, 0, this.elementos, arrayInicio.length, arrayFinal.length);
		} else {
			this.elementos[posicao] = element;
		}
	}
	
	@SuppressWarnings("unchecked")
	public T recuperarArrey(int posicao) {
		return (T)this.elementos[posicao];
	}

}
         