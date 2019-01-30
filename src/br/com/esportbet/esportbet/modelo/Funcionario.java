package br.com.esportbet.esportbet.modelo;

import java.sql.*;//importação do pacote de banco de dados do java

public class Funcionario {
	private int id;
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
	public Funcionario(int id, String nome, String cpf, String email, String senha) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		
	}
	public boolean autentica(String senha) {
		return this.senha.equals(senha);
	}
	@Override
	public String toString() {
		return "[Nome: "+this.nome+", Cpf: "+this.cpf+", Email: "+this.email+"]";
	}
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEmail() {
		return email;
	}
	public String getSenha() {
		return senha;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
