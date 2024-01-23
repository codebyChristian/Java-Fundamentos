package com.codebychristian.java.excecoes;

public class ChassiInvalidoExpection extends Exception {

	private static final long serialVersionUID = -5458953010105828006L;

	public ChassiInvalidoExpection(String chassi) {
		super(String.format("Esse chassi está incorreto [%s]", chassi));
	}
}
