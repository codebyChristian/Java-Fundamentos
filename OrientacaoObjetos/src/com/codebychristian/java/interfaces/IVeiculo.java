package com.codebychristian.java.interfaces;

import com.codebychristian.java.excecoes.AbastecerLigadoException;

public interface IVeiculo {

	void abastecer(float litros) throws AbastecerLigadoException;
	void preparar();
}
