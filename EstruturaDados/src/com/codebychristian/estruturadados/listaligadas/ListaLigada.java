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
		if (listaVazia()) {
			this.primeiroNo = novoNo;
			this.ultimoNo = novoNo;
		} else {
			this.ultimoNo.setProximo(novoNo);
			this.ultimoNo = novoNo;
		}
		this.tamanho++;
	}

	public void inserirEm(int posicao, T elemento) {
		if (posicao >= tamanho()) {
			throw new IllegalArgumentException(String.format("Não é possivel adicionar [%d]", posicao));
		}
		if (posicao == 0) {
			Celulas<T> novoNo = new Celulas<T>(elemento);
			novoNo.setProximo(this.primeiroNo);
			this.primeiroNo = novoNo;
		} else if (posicao == this.tamanho - 1) {
			Celulas<T> novoNo = new Celulas<T>(elemento);
			this.ultimoNo.setProximo(novoNo);
			this.ultimoNo = novoNo;
		} else {
			Celulas<T> noAnterior = recuperarNo(posicao - 1);
			Celulas<T> noAtual = recuperarNo(posicao);
			Celulas<T> novoNo = new Celulas<>(elemento);
			noAnterior.setProximo(novoNo);
			novoNo.setProximo(noAtual);
		}
		this.tamanho++;
	}

	public void inserirPrimeiro(T elemento) {
		inserirEm(0, elemento);
	}

	public void inserirUltimo(T elemento) {
		inserirEm(tamanho - 1, elemento);
	}

	public T recuperar(int posicao) {
		Celulas<T> no = recuperarNo(posicao);
		if (no != null) {
			return no.getElemento();
		}
		return null;
	}

	public boolean listaVazia() {
		return this.tamanho == 0;
	}

	public int tamanho() {
		return this.tamanho;
	}

	public boolean contem(T elemento) {
		for (int i = 0; i < tamanho(); i++) {
			Celulas<T> noAtual = recuperarNo(i);
			if (noAtual.getElemento() != null && noAtual.getElemento().equals(elemento)) {
				return true;
			}
		}
		return false;
	}
	
	public int indeci(T elemento) {
		for (int i = 0; i < tamanho(); i++) {
			Celulas<T> noAtual = recuperarNo(i);
			if (noAtual.getElemento() != null && noAtual.getElemento().equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	

	private Celulas<T> recuperarNo(int posicao) {
		if (posicao >= tamanho()) {
			throw new IllegalArgumentException(String.format("Não é possivel adicionar [%d]", posicao));
		}
		Celulas<T> resultado = null;
		for (int i = 0; i <= posicao; i++) {
			if (i == 0) {
				resultado = this.primeiroNo;
			} else {
				resultado = resultado.getProximo();
			}
		}
		return resultado;
	}

	@Override
	public String toString() {
		if (listaVazia()) {
			return "ListaLigada []";
		} else {
			Celulas<T> celulaAtual = this.primeiroNo;
			StringBuilder sb = new StringBuilder();
			sb.append("Lista [");
			sb.append(celulaAtual.getElemento() != null ? celulaAtual.getElemento().toString() : "<NULO>");
			sb.append(",");
			while (celulaAtual.getProximo() != null) {
				sb.append(celulaAtual.getProximo().getElemento() != null
						? celulaAtual.getProximo().getElemento().toString()
						: "<NULO>");
				sb.append(",");
				celulaAtual = celulaAtual.getProximo();
			}
			sb.append("]");
			return sb.toString();
		}

	}

}
