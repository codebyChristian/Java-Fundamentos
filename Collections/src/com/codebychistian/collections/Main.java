package com.codebychistian.collections;

import java.util.ArrayList;
import java.util.List;

import com.codebychristian.models.Pessoa;

public class Main {

	public static void main(String[] args) {
		// List , ArrayList , Collections podem ser instanciados
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa(1, "Chris"));
		pessoas.add(new Pessoa(2, "Japinha"));
		pessoas.add(new Pessoa(3, "Doquinha"));
		System.out.println(pessoas.toString());

}
}