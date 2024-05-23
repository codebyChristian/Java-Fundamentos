package com.codebychristian.estrutura.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Opp {
	// iniciar variaveis
	public int anoModelo;
	public String nomeModelo;
	
	//construtor
	public Opp(int year, String name) {
		anoModelo = year;
		nomeModelo = name;
	}
	public Opp() {
		
	}
	
	
	// static
	static void visualizarStatic() {
		System.out.println("Static, não cria objeto!");
	}
	
	public void visualizarPublic() {
		System.out.println("Criar uma instância!");
	}
	
	// métodos para carros
	public void velocidadeMaxima() {
		System.out.println("Velocidade maxima alcançada!");
	}
	// velocidade
	public void ponteiroKm(int km) {
		System.out.println("Velocidade em KM/h é: " + km);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// chamar static
		visualizarStatic();
		// chamar public
		Opp objPublic = new Opp(1969, "Fusca");
		objPublic.visualizarPublic();  // The dot (.) is used to access the object's attributes and methods.
		
		// instancia carro
		// colocar o que o construtor pede
		Opp carroVelocidade = new Opp(2001, "Corsa");
		carroVelocidade.ponteiroKm(200);
		carroVelocidade.velocidadeMaxima();
		System.out.println(carroVelocidade.nomeModelo + " " + carroVelocidade.anoModelo);
		
		// Scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Entre com Nome, Idade e Salário: ");
		String nameInput = input.nextLine();
		// scanner com int
		int idadeInput = input.nextInt();
		// float scanner
		float salarioInput = input.nextFloat();
		System.out.println("Você é " + nameInput);
		System.out.println("Idade de " + idadeInput);
		System.out.println("Salário de " + salarioInput);
		
		// Localdate para date
		LocalDate dataAgora = LocalDate.now();
		System.out.println(dataAgora);
		
		// LocalTime para hora e minutos
		LocalTime horaAgora = LocalTime.now();
		System.out.println(horaAgora);
		
		// LocalDateTime para data e hora
		LocalDateTime  dataHoraAgora = LocalDateTime.now();
		System.out.println("Antes de formatar");
		System.out.println(dataHoraAgora);
		
		// formatar date e hora
		DateTimeFormatter formatarDataHora = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String novoFormato = dataHoraAgora.format(formatarDataHora);
		System.out.println("Depois de formatar");
		System.out.println(novoFormato);
		
		
		
		// fechar variavel
		input.close();
	}

}
