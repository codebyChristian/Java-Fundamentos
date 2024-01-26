package com.codebyChristian.main;

import com.codebyChristian.Carros;

public class Main {

	public static void main(String[] args) {
// Alterando valores pelo método set() 
		try {
			Carros ferrari = new Carros();
			ferrari.setMarca("Fiat");
			ferrari.setNome("Toreto");
			ferrari.setPlaca(111333);
// Acessando construtores
			Carros celta = new Carros("celta", "chevrolet");
			System.out.println(celta.getNome());
			System.out.println(celta.getMarca());
	// testendo set - chassi
			ferrari.setChassi("1234567");
			ferrari.abastecer(11);
	// Acessar dados pelo método get()	
			System.out.println(ferrari.getMarca());
			System.out.println(ferrari.getCapacidadeDeGasolina());
			System.out.println(ferrari.getQuantidadeRodas());
			System.out.println(String.format("O veiculo %s está ligado? %b", ferrari.getNome(), ferrari.isLigado()));
			ferrari.ligar();
			System.out.println(String.format("O veiculo %s está ligado? %b", ferrari.getNome(), ferrari.isLigado()));
		} catch (Exception e) {
			System.out.println("Erro..." + e.getMessage());
		}
		
// objeto		
		Carros gol = new Carros();
		gol.setMarca("Sei lá");
		gol.setNome("Gol bolinha");
		gol.setPlaca(212132);
// Acessar dados pelo método get()	
		System.out.println(gol.getNome());
		//ferrari.ligar();
		
	}

}
