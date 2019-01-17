package br.com.esportbet.esportbet.modelo;

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
	
	public void	cadastro(String nome, String cpf, String email, String senha) {
		//eu queria validar o nome aqui nessa, por isso deixei uns parametro pra isso, eu nao sei se ele retorna pra ser colocado o nome novamente, nao ne?
		if(nome.length() <5 || nome.length() > 30) {
			System.out.println("Nome Invalido");
		}else {
			this.nome = nome;
		}
		if(cpf.length() > 11 || cpf.equals(" ")) {
			System.out.println("Cpf Invalido");
		}else {
			this.cpf = cpf;
		}
		//nao faço ideia de como validar um email ou senha, mas essa foi a tentativa do cpf e nome
	}
	
	public boolean autentica(String senha) {
		return this.senha.equals(senha);
	}
}
