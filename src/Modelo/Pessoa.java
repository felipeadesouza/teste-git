package Modelo;

import java.time.LocalDate;

public class Pessoa {

	private String nome;
	private LocalDate nascimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public Pessoa(String nome, LocalDate nascimento) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
	}

	public Pessoa() {
		super();
	}

}
