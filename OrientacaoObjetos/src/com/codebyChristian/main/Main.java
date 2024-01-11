package com.codebyChristian.main;

import com.codebyChristian.Carros;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Carros ferrari = new Carros();
		ferrari.marca = "Ferrari 1964";
		ferrari.nome = "Ferrari";
		ferrari.placa = 000111;
		ferrari.quantidadePortas = 2;
		ferrari.ligar();
		
		Carros gol = new Carros();
		gol.marca = "Sei lá";
		gol.nome = "Gol bolinha";
		gol.placa = 212132;
		gol.quantidadePortas = 2;
		ferrari.ligar();
		
	}

}
