package com.codebychristian.estruturadados.listaligadas;

public class ListaLigada<T> {
	
	private Celulas<T> primeiroNo;
	private Celulas<T> ultimoNO;
	private int tamanho;
	
	public ListaLigada() {
		this.primeiroNo = null;
		this.ultimoNO = null;
		tamanho = 0;
	}

	public void insere(T elemento) {
		Celulas<T> novoNo = new Celulas<T>(elemento);
		if(listaVazia()) {
			this.primeiroNo = novoNo;
			this.ultimoNO = novoNo;
		} else {
			this.ultimoNO.setProximo(novoNo);
			this.ultimoNO = novoNo;
		}
		this.tamanho++;	
	}
	
	public boolean listaVazia() {
		return this.tamanho == 0;
	}
	
	public int tamanho() {
		return this.tamanho;
	}
 	
}
