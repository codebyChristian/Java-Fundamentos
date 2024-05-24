package com.codebychristian.estrutura.main;

import java.util.*;
import java.util.Collections;

public class ListArray {

	public static void main(String[] args) {
		// Com arrayList podemos adicionar e remover, sem precisar criar outro array.
		// Usado para armazenar e acessar dados.
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Corsa");
		cars.add("Jeep");
		cars.add("Fusca");
		cars.add("S10");
		System.out.println(cars.get(1));
		// set arrayList
		cars.set(1, "Corrola");
		System.out.println(cars.get(1));
		// remover
		cars.remove(1);
		System.out.println(cars.get(1));
		// size
		System.out.println(cars.size());
		// colectins 
		Collections.sort(cars);
		// for usando size
		for(int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		// loop com for each
		for(String i : cars) {
			System.out.println(i);
		}
		// Primitivos não pode ser passados pelo ArrayList
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(52);
		numbers.add(12);
		numbers.add(0);
		numbers.add(43);
		numbers.add(7);
		// orgaizar os numeros em ordem
		Collections.sort(numbers);
		for(Integer s : numbers) {
			System.out.println(s);
		}
		
		// remover todos os dados do array
		cars.clear();
		
		// LinkdList, usado com a mesma sintax do arrayList, porém
		// Usado para manipular dados, e tem métodos de pegar itens do inicio e fim;
		LinkedList<Integer> numbersLink = new LinkedList<Integer>();
		numbersLink.add(1);
		numbersLink.add(4);
		numbersLink.add(2);
		for(Integer n : numbersLink) {
			System.out.println(n);
		}
		
	}

}
