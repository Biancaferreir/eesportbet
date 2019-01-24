package br.com.esportbet.esportbet.modelo;

import java.sql.*;//importação do pacote de banco de dados do java

public class Funcionario {
	private String nome;
	private String cpf;
	private String email;
	private String senha;
	
	public Funcionario(String nome, String cpf, String email, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
	}
	public boolean autentica(String senha) {
		return this.senha.equals(senha);
	}
}
