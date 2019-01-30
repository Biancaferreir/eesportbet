package br.com.esportbet.esportbet.dao.teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.esportbet.esportbet.dao.ConnectionFactory;
import br.com.esportbet.esportbet.dao.FuncionarioDao;
import br.com.esportbet.esportbet.modelo.Funcionario;

public class FuncionarioDaoTeste {

	public static void main(String[] args) throws SQLException {
		FuncionarioDao dao = new FuncionarioDao();
		Funcionario funcionario = dao.pesquisar(1);
		funcionario.setNome("Jeferson");
		funcionario.setEmail("haha@hahah.com");
		dao.atualizar(funcionario);
		
		Funcionario funcionario1 = dao.pesquisar(2);
		funcionario1.setNome("Emerson");
		funcionario1.setEmail("hueheu@brbr.com");
		dao.atualizar(funcionario1);
		
	}
	
	public static void cadastrar() {
		Funcionario funcionario = new Funcionario("Rafael", "4201870199","rafachato@gmail.com","hardcorebadas");
		
		FuncionarioDao funcionarioDao = new FuncionarioDao();
		funcionarioDao.cadastrar(funcionario);
	}
	
	public static void pesquisar(int id) {
		FuncionarioDao dao = new FuncionarioDao();
		Funcionario funcionario = dao.pesquisar(id);
		System.out.println(funcionario);
	}
	
}
