package com.codychristian.estruturadados.arvorebinaria;

import com.codebychristian.estruturadados.modelos.Pessoa;

public class NoArvorePessoa extends NoArvoreBinaria<Pessoa> {

	public NoArvorePessoa(Pessoa valor) {
		super(valor);
		
	}

	@Override
	public int peso() {
		// Quanto maior o ID da pessoa, maior o peso;
		return this.valor.getId();
	}

}
