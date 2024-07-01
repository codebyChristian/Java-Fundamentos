package com.codebychristian.models;

import java.util.Objects;

public class Pessoa implements Comparable<Pessoa> {

	private int id;
	private String name;

	// construtor
	public Pessoa(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	// get set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pessoa [id = " + id + ", name = " + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Pessoa o) {
		// usando ID
		// 0; objetos iguias.
		if (this.getId() == o.getId()) {
			return 0;
		}
		// < 0: instancia é "menor" do que o argumento
		if (this.getId() < o.getId()) 
			return -1;
		// > 0: instancia é "maior" do que o argumento
		return 1;
	}
	
	

}
