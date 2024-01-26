package com.codebyChristian;

public class Carros extends Veiculo {
	
	private int quantidadePortas;

	
public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	// Construtores	
	public Carros() {
		this.quantidadeRodas = 4;
	}
	
	public Carros(String nome, String marca) {
		this.quantidadeRodas = 4;
		this.setNome(nome);
		this.setMarca(marca);
	}
	
	
	
}
