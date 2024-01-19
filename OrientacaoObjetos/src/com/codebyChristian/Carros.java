package com.codebyChristian;

public class Carros {

// Para utilizar o get() e set(), precisamos usar como private
 	
	private int placa;
	private int quantidadePortas;
	private String nome;
	private String chassi;
	private String marca;
	private float capacidadeDeGasolina;
	
	
	
	
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

	public void setChassi(String chassi) throws Exception{
		if(chassi.length() == 7) {
			this.chassi = chassi;
		} else {
			throw new Exception("O chassi adulterado ou incorreto");
		}
		
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getCapacidadeDeGasolina() {
		return capacidadeDeGasolina;
	}


// Métodos


	public void ligar() {
		System.out.println("Carro ligado...");
		
	}
	
	public void desligar() {
		System.out.println("Carro desligado...");
	}
	
	public void abastecer(float litros) {
		capacidadeDeGasolina += litros;
		
	}
	
		
}
