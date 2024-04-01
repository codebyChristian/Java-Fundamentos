package com.codebychristian.estruturadados.listaligadas;

public class Celulas<T> {

	private T elemento;
	private Celulas<T> proximo;
	
	public Celulas() {
		this.proximo = null;
	}
	
	public Celulas(T elemento) {
		this.elemento = elemento;
		this.elemento = null;
	}

	public Celulas(T elemento, Celulas<T> proximo) {
		this.elemento = elemento;
		this.proximo = proximo;
	}



	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}

	public Celulas<T> getProximo() {
		return proximo;
	}

	public void setProximo(Celulas<T> proximo) {
		this.proximo = proximo;
	}

}
