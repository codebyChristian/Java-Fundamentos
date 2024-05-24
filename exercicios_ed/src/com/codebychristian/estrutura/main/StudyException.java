package com.codebychristian.estrutura.main;

public class StudyException {
	
	static void CheckAge(int age) {
		if(age < 18) {
			throw new ArithmeticException("Acesso negado! Idade não suficiente.");
		} else {
			System.out.println("Acesso liberado.");
		}
	}

	public static void main(String[] args) {
		// try and catch
		try {
			int[] number = {1, 4, 8};
			System.out.println(number[10]);
		} catch (Exception e) {
			System.out.println("Erro fatal.");
		} finally {
			System.out.println("Não importa o erro, ira executar o finally.");
		}
		
		// The throw statement allows you to create a custom error
		CheckAge(21);
		
		

	}

}
