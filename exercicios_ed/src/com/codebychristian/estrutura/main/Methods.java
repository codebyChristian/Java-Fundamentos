package com.codebychristian.estrutura.main;

public class Methods {
	
	static void myMetodo(String fname, int year) {
		System.out.println( fname + " Hello, World!" + "ano de " + year);
	}
	
	static void checkIdade(int idade) {
		if(idade >= 18) {
			System.out.println("Entrada autorizada!");
		} else {
			System.out.println("Entrada proibida.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMetodo("1", 2024);
		myMetodo("2", 2023);
		
		checkIdade(22);
		
	}

}
