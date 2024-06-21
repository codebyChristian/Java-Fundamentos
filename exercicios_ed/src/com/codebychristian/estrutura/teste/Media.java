package com.codebychristian.estrutura.teste;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] notas = {7, 7, 5, 9};

		int soma = 0, media;
		
		int menorNota = notas[0];
		
		int maiorNota = notas[0];
		
		//loop
		for (int notes : notas) {
			soma += notes;
		}
		// media
		media = soma / notas.length;
		System.out.println("A média final é: " + media);
		
		// buscar nota mais baixa
		for (int notes : notas) {
			if (menorNota > notes) {
				menorNota = notes;
			}
		}
		System.out.println("A menor nota é: " + menorNota);
		
		// maior nota 
		for (int notes : notas) {
			if (maiorNota < notes) {
				maiorNota = notes;
			}
		}
		System.out.println("A maior nota é: " + maiorNota);
	}

}
