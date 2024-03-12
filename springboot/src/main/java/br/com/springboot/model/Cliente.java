package br.com.springboot.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Clientes")
public class Cliente {
	
	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false, length = 50)
	private String nome;
	@Column(length = 11)
	private String cpf;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Column(name="data_nascimento", columnDefinition = "DATE")
	private LocalDate dataNascimento;
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	@Column(length = 10)
	private String telefone;
	@Column(length = 11)
	private String celular;
	@Column(length = 50)
	private String email;
	private boolean ativo;
	
	
	// Metódos Acessores
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public String toString() {
		String cliente = "";
		cliente += "Cliente\n";
		cliente += "--------------\n";
		cliente += "ID..." + this.id + "\n";
		cliente += "Nome..." + this.nome + "\n";
		cliente += "Cpf..." + this.cpf + "\n";
		cliente += "Data Nasc..." + this.dataNascimento + "\n";
		cliente += "Sexo..." + this.sexo.getDescricao() + "\n";
		cliente += "Telefone..." + this.telefone + "\n";
		cliente += "Celular..." + this.celular + "\n";
		cliente += "Email..." + this.email + "\n";
		cliente += "Ativo..." + (this.ativo ? "Sim" : "Não") + "\n";
		return cliente;
	}
}	

