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
	
	static int somaNumero(int x, int y) {
		return x + y;
	}
	
	static double somaNumero(double x, double y) {
		return x + y;
	}
	
	static int sum(int k) {
		if(k > 0) {
			return k + sum(k - 1);
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMetodo("1", 2024);
		myMetodo("2", 2023);
		
		checkIdade(22);
		//soma
		int z = somaNumero(5, 5);  // recomendado armazenar o retorno da variavel
		double zz = somaNumero(12.3, 34.2);
		System.out.println(z);
		System.out.println(zz);
		
		// recursividade
		int resultado = sum(10);
		System.out.println(resultado);
		
	}

}
