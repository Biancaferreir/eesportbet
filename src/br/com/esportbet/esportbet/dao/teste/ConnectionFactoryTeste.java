package br.com.esportbet.esportbet.dao.teste;

import java.sql.Connection;

import br.com.esportbet.esportbet.dao.ConnectionFactory;

public class ConnectionFactoryTeste {
	public static void main(String[] args) {
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão Estabelecida!");
		
	}
}
