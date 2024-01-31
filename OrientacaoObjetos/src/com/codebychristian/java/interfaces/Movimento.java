package com.codebychristian.java.interfaces;

import com.codebychristian.java.excecoes.AcelerarVeiculoException;
import com.codebychristian.java.excecoes.FrearVeiculoException;

public interface Movimento {

	void acelerar() throws AcelerarVeiculoException;
	void frear() throws FrearVeiculoException;
}
