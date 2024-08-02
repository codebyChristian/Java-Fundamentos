package com.codychristian.estruturadados.arvorebinaria;

public class NoArvoreBinaria<T> {

	private T valor;
	private NoArvoreBinaria<T> noEsquerdo;
	private NoArvoreBinaria<T> noDireito;
	
	public NoArvoreBinaria(T valor) {
		this.valor = valor;
		this.noDireito = null;
		this.noEsquerdo = null;
	}

	public NoArvoreBinaria<T> getNoEsquerdo() {
		return noEsquerdo;
	}

	public void setNoEsquerdo(NoArvoreBinaria<T> noEsquerdo) {
		this.noEsquerdo = noEsquerdo;
	}

	public NoArvoreBinaria<T> getNoDireito() {
		return noDireito;
	}

	public void setNoDireito(NoArvoreBinaria<T> noDireito) {
		this.noDireito = noDireito;
	}

	public T getValor() {
		return valor;
	}
	
	public int peso() {
		return this.valor.hashCode();
	}

}
