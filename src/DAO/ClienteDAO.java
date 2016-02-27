package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Factory.ConnectionFactory;
import Models.Cliente;

public class ClienteDAO{

	public void insert(Cliente cliente) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
	PreparedStatement stmt = connection.prepareStatement( "INSERT INTO Cliente VALUES (?,?,?,?,?)");
	stmt.setInt(1, 30);
	stmt.setString(2, "12/04/1990");
	stmt.setInt(3, 1234);
	stmt.setString(4, "-34");
	stmt.setString(5, "Pedro");
	stmt.execute();
	stmt.close();
	connection.close();
	}
	public void apagar(Cliente cliente) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		PreparedStatement stmt = connection.prepareStatement("DELETE FROM Cliente WHERE ID = ?");
		stmt.setInt(1, 30);
		stmt.execute();
		stmt.close();
		connection.close();
	}
	public void atualizar (Cliente cliente) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		PreparedStatement stmt = connection.prepareStatement("UPDATE cliente SET nome = ?,"
				+ " ID_conta = ?,DataDeNascimento = ?, CPF = ?  WHERE ID = ?");
		stmt.setString(1, "João");
		stmt.setInt(2, 30);
		stmt.setString(3, "12/03/1995");
		stmt.setString(4, "021.345.314-34");
		stmt.setInt(5, 30);
		stmt.execute();
		stmt.close();
		connection.close();
		
	}
	public List<Cliente> listar () throws SQLException{
		Connection connection = new ConnectionFactory().getConnection();
		PreparedStatement stmt = connection.prepareStatement("SELECT * FROM cliente");
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()){
			Cliente cliente = new Cliente();
			cliente.setID(rs.getInt("id"));
			cliente.setNome(rs.getString("nome"));
			cliente.setIdConta(rs.getInt("ID_Conta"));
			cliente.setCPF(rs.getString("CPF"));
			cliente.setDataDeNascimento(rs.getString("DataDeNascimento"));
			clientes.add(cliente);
		}		
		return clientes;
	}
}
