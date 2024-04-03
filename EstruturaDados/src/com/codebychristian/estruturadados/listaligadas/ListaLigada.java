package com.codebychristian.estruturadados.listaligadas;

public class ListaLigada<T> {
	
	private Celulas<T> primeiroNo;
	private Celulas<T> ultimoNo;
	private int tamanho;
	
	public ListaLigada() {
		this.primeiroNo = null;
		this.ultimoNo = null;
		tamanho = 0;
	}

	public void insere(T elemento) {
		Celulas<T> novoNo = new Celulas<T>(elemento);
		if(listaVazia()) {
			this.primeiroNo = novoNo;
			this.ultimoNo = novoNo;
		} else {
			this.ultimoNo.setProximo(novoNo);
			this.ultimoNo = novoNo;
		}
		this.tamanho++;	
	}
	
	public boolean listaVazia() {
		return this.tamanho == 0;
	}
	
	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		if(listaVazia()) {
			return "ListaLigada []";
		} else {
			Celulas<T> celulaAtual = this.primeiroNo;
			StringBuilder sb = new StringBuilder();
			sb.append("Lista [");
			sb.append(celulaAtual.getElemento() != null ? celulaAtual.getElemento().toString() : "<NULO>");
			sb.append(",");
			while(celulaAtual.getProximo() != null) {
				sb.append(celulaAtual.getProximo().getElemento() != null ? celulaAtual.getProximo().getElemento().toString() : "<NULO>");
				sb.append(",");
				celulaAtual = celulaAtual.getProximo();
			}
			sb.append("]");
			return sb.toString();		
		}
		
	}
	
	
 	
}
