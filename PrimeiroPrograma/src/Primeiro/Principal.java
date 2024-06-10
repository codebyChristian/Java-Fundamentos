package Primeiro;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// nota aluno
		double nota_aluno = 8;
		double frequencia_aluno = 75;
		// regras
		double nota_aprovacao = 7;
		double frequencia_necessaria = 75;
		
		if (nota_aluno >= nota_aprovacao && frequencia_aluno >= frequencia_necessaria) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Não leia teoria!");
		}
		
		//
		
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
		  
		  
		  System.out.println("Idade: " + idade); System.out.printf("Idade: %d,\n",
		  idade); System.out.printf("Peso: %.2f\n",peso);
		  System.out.println("Ola Mundo! "); System.out.println("Hello Word!");
		  
		  if(idade <18) { System.out.println("Criança"); } else if(idade <65) {
		  System.out.println("Idoso"); } else { System.out.println("Muito Idoso"); }
		 
				
	}	
		
}