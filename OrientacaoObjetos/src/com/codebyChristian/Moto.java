package com.codebyChristian;

import com.codebychristian.java.excecoes.AcelerarVeiculoException;
import com.codebychristian.java.excecoes.FrearVeiculoException;

public final class Moto extends Veiculo {
	
	public Moto() {
		this.quantidadeRodas = 2;
	}
	
	public Moto(String nome, String marca) {
		this.quantidadeRodas = 2;
		this.setNome(nome);
		this.setMarca(marca);
	}
	
// métodos
	
	@Override
	public void acelerar() throws AcelerarVeiculoException {
		if(this.isLigado()) {
			this.velocidade += 3;
		} else {
			throw new AcelerarVeiculoException();
		}
	}
	
	@Override
	public void frear() throws FrearVeiculoException {
		if(this.isLigado()) {
			this.velocidade -= 3;
		} else {
			throw new FrearVeiculoException();
		}
	}
	


}
