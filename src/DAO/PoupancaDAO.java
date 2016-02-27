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
	public void insert(Poupanca poupança) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
	
	PreparedStatement stmt = connection.prepareStatement( "INSERT INTO Poupança VALUES (?,?)");
	stmt.setInt(1, p.getIdDoCliente());
	stmt.setDouble(2, p.getSaldo());;
	
	stmt.execute();
	stmt.close();
	connection.close();
	}
	public void apagar(Poupanca poupança) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		PreparedStatement stmt = connection.prepareStatement("DELETE FROM Poupança WHERE IDdoCliente = ?");
		stmt.setInt(1, p.getIdDoCliente());
		stmt.execute();
		stmt.close();
		connection.close();
	}
	public void atualizar (Poupanca poupança) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		PreparedStatement stmt = connection.prepareStatement("UPDATE Poupança SET Saldo = ? WHERE IDdoCliente = ?");
		stmt.setDouble(1, p.getSaldo());
		stmt.setInt(2, p.getIdDoCliente());
		stmt.execute();
		stmt.close();
		connection.close();
		
	}
	public List<Poupanca> listar () throws SQLException{
		Connection connection = new ConnectionFactory().getConnection();
		PreparedStatement stmt = connection.prepareStatement("SELECT * FROM Poupança");
		List<Poupanca> poupanças = new ArrayList<Poupanca>();
		
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()){
			Poupanca poupança = new Poupanca();
			poupança.setIdDoCliente(rs.getInt("IdDoCliente"));
			poupança.setSaldo(rs.getDouble("Saldo"));
			poupanças.add(poupança);
		}		
		return poupanças;
	}

}
