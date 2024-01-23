package com.codebyChristian;

public class Carros extends Veiculo {

	public Carros() {
		this.quantidadeRodas = 4;
	}
	
	public Carros(String nome, String marca) {
		this.quantidadeRodas = 4;
		this.setNome(nome);
		this.setMarca(marca);
	}
	
	public Carros(String nome, String chassi, String marca) {
		
	}
	
}
