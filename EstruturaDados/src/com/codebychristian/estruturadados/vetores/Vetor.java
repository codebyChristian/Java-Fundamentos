package com.codebychristian.estruturadados.vetores;

import com.codebychristian.estruturadados.modelos.Pessoa;

public class Vetor {
	
	private Pessoa[] person;
	
	public Vetor(int capacidade) {
		this.person = new Pessoa[capacidade];
	}
	
	public void inserirArrey(int posicao, Pessoa person) {
		this.person[posicao] = person;
	}
	
	public Pessoa recuperarArrey(int posicao) {
		return this.person[posicao];
	}

}
         