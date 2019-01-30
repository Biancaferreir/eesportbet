package br.com.esportbet.esportbet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.esportbet.esportbet.modelo.Funcionario;

public class FuncionarioDao {
	Connection conexao;
	
	public FuncionarioDao() {
		conexao = new ConnectionFactory().getConnection();
	}
	
	public void cadastrar(Funcionario funcionario){
		String sql = "INSERT INTO funcionarios "
				+ "(nome, cpf, email, senha) "
				+ "VALUES (?, ?, ?, ?)";
		PreparedStatement statement = null;
		try {
			statement = conexao.prepareStatement(sql);
			statement.setString(1, funcionario.getNome());
			statement.setString(2, funcionario.getCpf());
			statement.setString(3, funcionario.getEmail());
			statement.setString(4, funcionario.getSenha());
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Funcionario pesquisar(int id) {
		String sql = "SELECT * FROM funcionarios "
				+ "WHERE id = ?";
		Funcionario funcionario = null;
		
		try {
			PreparedStatement statement = conexao.prepareStatement(sql);
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				int identificacao = rs.getInt("id");
				String nome = rs.getString("nome");
				String cpf = rs.getString("cpf");
				String email = rs.getString("email");
				String senha = rs.getString("senha");
				funcionario = new Funcionario(identificacao, nome, cpf, email, senha);
			}
			rs.close();
			statement.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return funcionario;
	}

	public void atualizar(Funcionario funcionario) {
		String sql = "UPDATE funcionarios "
				+ "SET nome = ?, cpf = ?, email = ?"
				+ "WHERE id = ?";
		try {
			PreparedStatement statement = conexao.prepareStatement(sql);
			statement.setString(1, funcionario.getNome());
			statement.setString(2, funcionario.getCpf());
			statement.setString(3, funcionario.getEmail());
			statement.setInt(4, funcionario.getId());
			statement.execute();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
