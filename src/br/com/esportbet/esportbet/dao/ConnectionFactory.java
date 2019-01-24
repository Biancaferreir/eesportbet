package br.com.esportbet.esportbet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		String url = "jdbc:mysql://localhost/esportbetbd?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String usuario = "root";
		String senha = "root";
		Connection conexao = null;
		try {
			//estabelecer a conexao com o banco de dados, e jogar no console falha na conexão se nao conseguir conectar
			conexao = DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conexao;
	}
}
