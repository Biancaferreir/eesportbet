package br.com.esportbet.esportbet.dao.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.esportbet.esportbet.dao.ConnectionFactory;

public class ConnectionFactoryTeste {
	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão Estabelecida!");
		connection.close();
	}
}
