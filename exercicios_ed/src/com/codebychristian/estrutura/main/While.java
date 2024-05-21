package com.codebychristian.estrutura.main;

public class While {

	public static void main(String[] args) {
		// vai ser executado pelos menos 1 vez, se for falsa.
		int i = 0;
		
		do {
			System.out.println(i);
			i++;
		} 
		while (i < 2);
		
		// exemplo
		int contagem = 3;
		
		while(contagem > 0) {
			System.out.println(contagem);
			contagem--;
		}
		System.out.println("Acabou");
		
		// while and if
		int escolha = 1;
		while(escolha <= 5) {
			if(escolha < 5) {
				System.out.println("Não acertou!");
			} else {
				System.out.println("???");
			}
			escolha = escolha + 1;
		}
		
		// for
		for(int i1 = 0; i1 < 11; i1++) {
			System.out.println(i1);
		}
		
		// for each; usado especificamente para string
		String[] cars = {"007", "CR7", "CE6"};
		for(String i1 : cars) {
			System.out.println(i1);
		}
		
		// tabuada simples
		int number = 5;
		for(int i2 = 1; i2 <= 10; i2++) {
			System.out.println(number + " x " + i2 + " = " + number * i2 );
		}
		
		// idades
		int ages[] = {23, 53, 52, 75, 13};	
		
		float media, soma = 0;
		
		//tamanho do array
		int lenght = ages.length;
		
		// idade mais nova
		int newAge = ages[0];
		
		// loop
		for(int age : ages) {
			// aqui verifica se a idade atual é menor
			if(newAge > age) {
				// quando encontrada ela se torna a mais nova
				newAge = age;
			}
		}
		System.out.println("A idade mais nova é: " + newAge);
		
		
		// Multidimensional Arrays
		int numeros[][] = { {0, 1, 2, 3}, {4, 5, 6} };
		System.out.println(numeros[1][0]); // saida 4
		numeros[1][0] = 99;  // alterar
		System.out.println(numeros[1][0]);  // saida 99
		
		
		
		
	}

}
