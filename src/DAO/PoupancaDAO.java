package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Factory.ConnectionFactory;
import Models.Cliente;
import Models.Poupanca;

public class PoupancaDAO {

	Poupanca p = new Poupanca();
	public void insert(Poupanca poupanša) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
	
	PreparedStatement stmt = connection.prepareStatement( "INSERT INTO Poupanša VALUES (?,?)");
	stmt.setInt(1, p.getIdDoCliente());
	stmt.setDouble(2, p.getSaldo());;
	
	stmt.execute();
	stmt.close();
	connection.close();
	}
	public void apagar(Poupanca poupanša) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		PreparedStatement stmt = connection.prepareStatement("DELETE FROM Poupanša WHERE IDdoCliente = ?");
		stmt.setInt(1, p.getIdDoCliente());
		stmt.execute();
		stmt.close();
		connection.close();
	}
	public void atualizar (Poupanca poupanša) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		PreparedStatement stmt = connection.prepareStatement("UPDATE Poupanša SET Saldo = ? WHERE IDdoCliente = ?");
		stmt.setDouble(1, p.getSaldo());
		stmt.setInt(2, p.getIdDoCliente());
		stmt.execute();
		stmt.close();
		connection.close();
		
	}
	public List<Poupanca> listar () throws SQLException{
		Connection connection = new ConnectionFactory().getConnection();
		PreparedStatement stmt = connection.prepareStatement("SELECT * FROM Poupanša");
		List<Poupanca> poupanšas = new ArrayList<Poupanca>();
		
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()){
			Poupanca poupanša = new Poupanca();
			poupanša.setIdDoCliente(rs.getInt("IdDoCliente"));
			poupanša.setSaldo(rs.getDouble("Saldo"));
			poupanšas.add(poupanša);
		}		
		return poupanšas;
	}

}
