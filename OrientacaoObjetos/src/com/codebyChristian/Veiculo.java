package com.codebyChristian;

import com.codebychristian.java.excecoes.AbastecerLigadoException;
import com.codebychristian.java.excecoes.AcelerarVeiculoException;
import com.codebychristian.java.excecoes.ChassiInvalidoExpection;
import com.codebychristian.java.excecoes.FrearVeiculoException;

public abstract class Veiculo {

// Para utilizar o get() e set(), precisamos usar como private
 	
	private int placa;
	protected int quantidadeRodas;
	private String nome;
	private String chassi;
	private String marca;
	private float capacidadeDeGasolina;
	private Boolean ligado;
	protected float velocidade;
	
	public Veiculo() {
		this.ligado = false;
		this.velocidade = 0;
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
	public float getVelocidade() {
		return velocidade;
	}
	
	
	
	
	
	
// Métodos


	public final void ligar() {
		this.ligado = true;
		this.velocidade = 0;
		System.out.println("Carro ligado...");
		
	}
	
	public final void desligar() {
		this.ligado = false;
		this.velocidade = 0;
		System.out.println("Carro desligado...");
	}
	
	public final void abastecer(float litros) throws AbastecerLigadoException {
		if(!this.ligado) {
			capacidadeDeGasolina += litros;
		} else {
			throw new AbastecerLigadoException();
		}	
		
	}
	
	public void acelerar() throws AcelerarVeiculoException {
		if(this.ligado) {
			this.velocidade += 10;
		} else {
			throw new AcelerarVeiculoException();
		}
	}
	
	public void frear() throws FrearVeiculoException {
		if(this.ligado) {
			this.velocidade -= 10;
		} else {
			throw new FrearVeiculoException();
		}
	}
	
	public abstract void preparar();
		
}

