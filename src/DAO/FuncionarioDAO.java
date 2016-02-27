package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Factory.ConnectionFactory;
import Models.Cliente;
import Models.Funcionarios;

public class FuncionarioDAO {
	public void insert (Funcionarios funcionario) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		PreparedStatement stmt = connection.prepareStatement("INSERT INTO Funcion�rio VALUES (?, ?, ?, ?, ?)");
		stmt.setInt(1, 30);
		stmt.setString (2, "Jo�o");
		stmt.setDouble(3, 3200.34);
		stmt.setString(4, "Jur�dico");
		stmt.setString(5, "Advogado");
		stmt.execute();
		stmt.close();
		connection.close();
		}
	public void atualizar (Funcionarios funcionario) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		PreparedStatement stmt = connection.prepareStatement("UPDATE Funcion�rio SET nome = ?, Sal�rio = ?, "
				+ "Departamento = ?, Cargo = ? WHERE ID = ?");
		stmt.setString(1, "Jo�o");
		stmt.setDouble(2, 2800.23);
		stmt.setString(3, "Financeiro");
		stmt.setString(4, "Economista");
		stmt.setInt(5, 30);
		stmt.execute();
		stmt.close();
		connection.close();
		}
	public void apagar (Funcionarios funcionario) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		PreparedStatement stmt = connection.prepareStatement("DELETE FROM Funcion�rio WHERE ID = ?");
		stmt.setInt(1, 30);
		stmt.execute();
		stmt.close();
		connection.close();
	}
	public  List<Funcionarios> listar() throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		PreparedStatement stmt = connection.prepareStatement("SELECT * FROM Funcion�rio");
		List<Funcionarios> funcionarios = new ArrayList<Funcionarios>();
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()){
			Funcionarios funcionario = new Funcionarios();
			funcionario.setID(rs.getInt("ID"));
			funcionario.setNome(rs.getString("nome"));
			funcionario.setSal�rio(rs.getDouble("Sal�rio"));
			funcionario.setCargo(rs.getString("Cargo"));
			funcionario.setDepartamento(rs.getString("Departamento"));
			funcionarios.add(funcionario);
		}			
		return funcionarios;
		
	}
	
	

}
