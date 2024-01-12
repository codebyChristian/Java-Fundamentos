package com.codebyChristian;

public class Carros {

// Para utilizar o get() e set(), precisamos usar como private
 	
	private int placa;
	private int quantidadePortas;
	private String nome;
	private String chassi;
	private String marca;
	
	
	
	
	
	public int getPlaca() {
		return placa;
	}

	public void setPlaca(int placa) {
		this.placa = placa;
	}

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	
// Métodos


	public void ligar() {
		System.out.println("Carro ligado...");
		
	}
	
	public void desligar() {
		System.out.println("Carro desligado...");
	}
	
	
	
		
}
