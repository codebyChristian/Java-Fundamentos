package com.codychristian.estruturadados.arvorebinaria;

public class Arvore<T> {

	private NoArvoreBinaria<T> raiz;

	public Arvore() {
		this.raiz = null;
	}

	public NoArvoreBinaria<T> getRaiz() {
		return this.raiz;
	}

	public void inserir(NoArvoreBinaria<T> no) {
		no.setNoDireito(null);
		no.setNoEsquerdo(null);
		if (this.raiz == null) {
			this.raiz = no;
		} else if(raiz.peso() < no.peso()) {
			this.raiz.setNoDireito(no);
		}
	}

}
