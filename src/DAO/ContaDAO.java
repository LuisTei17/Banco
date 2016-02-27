package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Factory.ConnectionFactory;
import Models.Conta;

public class ContaDAO {
	public  void insert(Conta conta) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
	PreparedStatement stmt = connection.prepareStatement( "INSERT INTO Conta VALUES (?,?,?)");
	stmt.setInt(1, 30);
	stmt.setDouble(2, 13000.00);
	stmt.setString(3, "12/03/1980");
	
	stmt.execute();
	stmt.close();
	connection.close();
	}
	public void apagar(Conta conta) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		PreparedStatement stmt = connection.prepareStatement("DELETE FROM Conta WHERE ID = ?");
		stmt.setInt(1, 30);
		stmt.execute();
		stmt.close();
		connection.close();
	}
	public void atualizar (Conta conta) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		PreparedStatement stmt = connection.prepareStatement("UPDATE Conta SET saldo = ?, dataDeCriação = ? WHERE ID = ?");
		stmt.setDouble(1, 1200.12);
		stmt.setString(2, "16/07/2001");
		stmt.setInt(3, 30);
		stmt.execute();
		stmt.close();
		connection.close();
		
	}
	public List<Conta> listar () throws SQLException{
		Connection connection = new ConnectionFactory().getConnection();
		PreparedStatement stmt = connection.prepareStatement("SELECT * FROM Conta");
		List<Conta>  contas = new ArrayList<Conta>();
		
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()){
			Conta conta = new Conta();
			conta.setID(rs.getInt("ID"));
			conta.setSaldo(rs.getDouble("saldo"));
			conta.setDataDeCriação(rs.getString("DataDeCriação"));
			contas.add(conta);
			
		}		
		return contas;
		
	}


	}
