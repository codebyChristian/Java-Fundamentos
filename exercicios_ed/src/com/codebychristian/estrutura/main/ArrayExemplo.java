package com.codebychristian.estrutura.main;

public class ArrayExemplo {

	// Soma dos numeros de dentro do array
	public static void main(String[] args) {
		
		int[] number = {10, 11, 51, 31, 21};
		
		int  soma = 0;
		for(int numero : number) {
			soma += numero;
		}
		System.out.println("A soma é: " + soma);
		
		
		// caracteristicas do aluno
		String nomeEstudante = "Christian";
		int idadeEstudante = 23;
		float mensalidadeEstudante = 198.20f;
		char faseAluno = 'A';
		
		System.out.println("O " + nomeEstudante + " com idade de " + idadeEstudante + " anos, está com a mensalidade de " + 
		mensalidadeEstudante + "R$, e na fase " + faseAluno);
		
		// Area do retangulo
		
		int altura = 10;
		int comprimento = 5;
		int area;
		
		area = comprimento * altura;
		System.out.println("A altura é de: " + altura);
		System.out.println("O comprimento é de: " + comprimento);
		System.out.println("A area é de: " + area);
		char myChar1 = 66, myChar2 = 67, myChar3 = 68;
		System.out.println(myChar1);
		System.out.println(myChar2);
		System.out.println(myChar3);
		
		// custo itens
		int totalItens = 50;
		float valorCadaIten = 9.85f;
		float totalCusto = totalItens * valorCadaIten;
		char cifrao = '$';
		System.out.println("Total de itens: " + totalItens);
		System.out.println("Valor de cada iten: " + valorCadaIten);
		System.out.println("A valor total é: " + totalCusto + cifrao);
		
		// Conversão automatica de primeitivos
		int myInt = 8;
		double myDouble = myInt;   // automaicamente convertido
		// Widening Casting ( byte -> short -> char -> int -> long -> float -> double )
		System.out.println(myInt);
		System.out.println(myDouble);
		
		// Conversão manual de primitivos
		// Narrowing Casting (manually) - converting a larger type to a smaller size type
		//  double -> float -> long -> int -> char -> short -> byte 
		double newDouble = 9.6;
		int newInt = (int) newDouble;  // must be done manually by placing the type in parentheses () in front of the value
		System.out.println(newInt);
		System.out.println(newDouble);
		
		// Prática de cast com porcentagem
		int maximoScore = 500;
		// usuário
		int atualScoreUsuario = 411;
		// converter
		float porcentagemUsuario = (float) atualScoreUsuario / maximoScore * 100.0f;
		// visualizar
		System.out.println(porcentagemUsuario);
		
		// tamanho da string
		String txt = "Hello, World! \t é uma \"citação\". \b Esté \\ não sabia! ";
		System.out.println("O tamanho do texto é:" + txt.length());
		// indexOf() method returns the index (the position)
		//of the first occurrence of a specified text in a string (including whitespace):
		System.out.println(txt.indexOf("World"));
		// citações
		System.out.println(txt);
		
		// if
		int idadeAtual = 23;
		int idadeVotar = 18;
		
		if(idadeAtual >= idadeVotar) {
			System.out.println("Apto a votar!");
		} else {
			System.out.println("Não apto a votar!");
		}
		// ternario
		int time = 20;
		String resultado = (time < 18) ? "Good Morning" : "Good evening";
		System.out.println(resultado);
		
		// teste de senha simples
		int senhaCartao = 0101;
		if(senhaCartao == 0101) {
			System.out.println("Comprar aprovada!");
		} else {
			System.out.println("Senha incorreta.");
		}
		
		// par ou impar
		int numberPar = 2;
		if(numberPar % 2 == 0) {
			System.out.println("Número par!");
		} else {
			System.out.println("Número ímpar!");
		}
		
		
		
		
	}
	

}
