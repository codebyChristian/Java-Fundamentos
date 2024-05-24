package com.codebychristian.estrutura.main;

import java.util.HashMap;

public class StudyHasMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> capitaisEstado = new HashMap<String, String>();
		
		// put itens
		capitaisEstado.put("Salvador", "Bahia");
		capitaisEstado.put("Teresina", "Píaui");
		capitaisEstado.put("Fortaleza", "Céara");
		capitaisEstado.put("Aracaju", "Sergipe");
		capitaisEstado.put("Petrolina", "Pernambuco");
		System.out.println(capitaisEstado);
		// Utiliza sempre a chave para acessar
		System.out.println(capitaisEstado.get("Salvador"));
		// Usa também a chave para remover
		capitaisEstado.remove("Salvador");
		// for para chaves
		for(String i : capitaisEstado.keySet()) {
			System.out.println("Chaves:" + i);
		}
		// for para os valores
		for(String s : capitaisEstado.values()) {
			System.out.println("Valor: " + s);
		}
		// limpar todos itens
		capitaisEstado.clear();
		
		// mesclar objetos
		HashMap<String, Integer> NameIdade = new HashMap<String, Integer>();
		NameIdade.put("Shelby", 34);
		NameIdade.put("Casmurro", 24);
		NameIdade.put("Capitu", 14);
		for(String n : NameIdade.keySet()) {
			System.out.println("Nome: " + n + ", Idade: " + NameIdade.get(n));
		}
		
		
		
		

	}

}
