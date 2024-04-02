package com.codebychristian.estruturadados.listaligadas;

public class ListaLigada<T> {
	
	private Celulas<T> primeiroNo;
	private Celulas<T> ultimoNO;
	private int tamanho;
	
	public ListaLigada() {
		this.primeiroNo = null;
		this.ultimoNO = null;
	}

}
