package com.codebychristian.estrutura.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FilesJava {
	
	

	public static void main(String[] args) {
		// criar arquivo
		try {
			File myArquivo = new File("/home/codybychristian/Documents/raiz/test.txt");
			if(myArquivo.createNewFile()) {
				System.out.println("Arquivo criado: " + myArquivo.getName());
			} else {
				System.out.println("Arquivo já existe.");
			}
		} catch (IOException e) {
			System.out.println("Erro ao criar o arquivo.");
			e.printStackTrace();
		}

		// escrever arquivo
		try {
			FileWriter escreveMyarquivo = new FileWriter("/home/codybychristian/Documents/raiz/test.txt");
			escreveMyarquivo.write("Informações severamente sensiveis: senha do cartão = 0000; contém 1000 pesos argentinos.");
			escreveMyarquivo.close();
			System.out.println("Arquivo escrito, (escrevido)!");
		} catch (IOException e) {
			System.out.println("Erro ao escrever arquivo.");
			e.printStackTrace();
		}
		
		// mostrar informações do arquivo
		try {
			File myArquivo = new File("/home/codybychristian/Documents/raiz/test.txt");
			Scanner tecladoTexto = new Scanner(myArquivo);
			while (tecladoTexto.hasNextLine()) {
				String data = tecladoTexto.nextLine();
				System.out.println(data);
			}
			tecladoTexto.close();
		} catch (FileNotFoundException e) {
			System.out.println("Erro.");
			e.printStackTrace();
		}
		
		// informações sobre o arquivo
		File myArquivo = new File("/home/codybychristian/Documents/raiz/test.txt");
		if (myArquivo.exists()) {
			System.out.println("Nome do arquivo: " + myArquivo.getName());
			System.out.println("Camainho do arquivo: " + myArquivo.getAbsolutePath());
			System.out.println("Pode ser escrito: " + myArquivo.canWrite());
			System.out.println("Pode ser lido: " + myArquivo.canRead());
			System.out.println("Tamanho em bytes: " + myArquivo.length());
		} else {
			System.out.println("Arquivo não existe.");
		}
		
	}

}
