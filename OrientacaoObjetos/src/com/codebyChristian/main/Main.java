package com.codebyChristian.main;

import com.codebyChristian.Carros;

public class Main {

	public static void main(String[] args) {
// Alterando valores pelo método set() 
	
		Carros ferrari = new Carros();
		ferrari.setMarca("Fiat");
		ferrari.setNome("Toreto");
		ferrari.setPlaca(111333);
		ferrari.setQuantidadePortas(2);
// Acessar dados pelo método get()	
		System.out.println(ferrari.getMarca());
		
		ferrari.ligar();
		
		Carros gol = new Carros();
		gol.setMarca("Sei lá");
		gol.setNome("Gol bolinha");
		gol.setPlaca(212132);
		gol.setQuantidadePortas(2);
// Acessar dados pelo método get()	
		System.out.println(gol.getNome());
		ferrari.ligar();
		
	}

}
