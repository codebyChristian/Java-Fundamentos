package com.codebychristian.java.interfaces;

import com.codebychristian.java.excecoes.AbastecerLigadoException;
import com.codebychristian.java.excecoes.AcelerarVeiculoException;
import com.codebychristian.java.excecoes.FrearVeiculoException;

public interface IVeiculoInterface {

	void ligar();
	void desligar();
	void abastecer(float litros) throws AbastecerLigadoException;
	void acelerar() throws AcelerarVeiculoException;
	void frear() throws FrearVeiculoException;
	void preparar();
}
