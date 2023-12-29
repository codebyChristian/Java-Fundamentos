package Primeiro;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int idade = 10;
		String nome = "Christian";
		idade = idade +2;
		double peso = 72.5;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite idade, peso e nome: ");
		idade = teclado.nextInt();
		peso = teclado.nextDouble();
		nome = teclado.next();
		teclado.close();
		
		
		System.out.println();
		
		System.out.println("Nome:" + nome);
		System.out.printf("Idade: %d,\n", idade);
		System.out.printf("Peso: %.2f\n",peso);
		
		
		System.out.println("Idade: " + idade);
		System.out.printf("Idade: %d,\n", idade);
		System.out.printf("Peso: %.2f\n",peso);
		System.out.println("Ola Mundo! ");
		System.out.println("Hello Word!");	
		
		if(idade <18) {
			System.out.println("Criança");
		}
		else if(idade <65) {
			System.out.println("Idoso");
		}
		else {
			System.out.println("Muito Idoso");
		}
				
	}	
		
}