package com.codebychristian.estruturadados.listaligadas;

class Celulas<T> {          //Omitindo o public a class fica visivel apenas dentro do pacote

	private T elemento;
	private Celulas<T> proximo;
	
	public Celulas() {
		this.proximo = null;
	}
	
	public Celulas(T elemento) {
		this.elemento = elemento;
		this.proximo = null;
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
