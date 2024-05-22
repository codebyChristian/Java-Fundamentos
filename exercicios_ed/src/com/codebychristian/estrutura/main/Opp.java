package com.codebychristian.estrutura.main;

public class Opp {
	// iniciar variaveis
	public int anoModelo;
	public String nomeModelo;
	
	//construtor
	public Opp(int year, String name) {
		anoModelo = year;
		nomeModelo = name;
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

	}

}
