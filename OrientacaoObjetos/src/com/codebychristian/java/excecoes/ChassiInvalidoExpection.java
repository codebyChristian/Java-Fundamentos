package com.codebychristian.java.excecoes;

public class ChassiInvalidoExpection extends Exception {

	public ChassiInvalidoExpection(String chassi) {
		super(String.format("Esse chassi está incorreto [%s]", chassi));
	}
}
