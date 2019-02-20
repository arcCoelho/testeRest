package br.com.soapTestes.model;

import java.util.List;

public class Game {

	private String nome;
	private String genero;
	
	public Game() {
		// TODO Auto-generated constructor stub
	}
	
	public Game(String nome, String genero) {
		super();
		this.nome = nome;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
}
