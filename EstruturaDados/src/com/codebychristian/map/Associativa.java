package com.codebychristian.map;

public class Associativa<K, V> { // Essa classe ela é associativa que recebe 2 valores genericos

	private K chave;
	private V valor;

	public Associativa(K chave, V valor) {
		this.chave = chave;
		this.valor = valor;
	}

	public K getChave() {
		return chave;
	}

	public V getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "Associativa [ chave = " + chave + ", valor = " + valor + "]";
	}
	
	

}
