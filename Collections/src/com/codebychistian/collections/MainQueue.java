package com.codebychistian.collections;

import java.util.PriorityQueue;
import java.util.Queue;

import com.codebychristian.models.Pessoa;

public class MainQueue {

	public static void main(String[] args) {
		// Usar lambda para determinar a ordem da lista
		Queue<Pessoa> queue = new PriorityQueue<Pessoa>( (p1, p2) -> {
			return p1.getName().compareTo(p2.getName());
		});
		
		queue.add(new Pessoa(3, "Três"));
		queue.add(new Pessoa(1, "Um"));
		queue.add(new Pessoa(2, "Dois"));
		queue.offer(new Pessoa(4, "Quatro"));
		System.out.println(queue);
		
		while (!queue.isEmpty()) {
			Pessoa p = queue.poll();
			// o método - peek() - não retira da lista, e formar o laço infinito
			System.out.println(p);
		}

	}

}
