package com.codebyChristian;

import com.codebychristian.java.excecoes.AbastecerLigadoException;
import com.codebychristian.java.excecoes.ChassiInvalidoExpection;

public class Veiculo {

// Para utilizar o get() e set(), precisamos usar como private
 	
	private int placa;
	protected int quantidadeRodas;
	private String nome;
	private String chassi;
	private String marca;
	private float capacidadeDeGasolina;
	private Boolean ligado;
	
	public Veiculo() {
		this.ligado = false;
	}
	
	public int getPlaca() {
		return placa;
	}

	public void setPlaca(int placa) {
		this.placa = placa;
	}

	public int getQuantidadeRodas() {
		return quantidadeRodas;
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

	public void setChassi(String chassi) throws ChassiInvalidoExpection{
		if(chassi.length() == 7) {
			this.chassi = chassi;
		} else {
			
			throw new ChassiInvalidoExpection(chassi);
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
	
	public Boolean isLigado() {
		return ligado;
	}
	
// Métodos


	public void ligar() {
		this.ligado = true;
		System.out.println("Carro ligado...");
		
	}
	
	public void desligar() {
		this.ligado = false;
		System.out.println("Carro desligado...");
	}
	
	public void abastecer(float litros) throws AbastecerLigadoException {
		if(!this.ligado) {
			capacidadeDeGasolina += litros;
		} else {
			throw new AbastecerLigadoException();
		}
		
		
	}
	
		
}

