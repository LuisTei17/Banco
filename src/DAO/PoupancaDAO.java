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
	public void insert(Poupanca poupan�a) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
	
	PreparedStatement stmt = connection.prepareStatement( "INSERT INTO Poupan�a VALUES (?,?)");
	stmt.setInt(1, p.getIdDoCliente());
	stmt.setDouble(2, p.getSaldo());;
	
	stmt.execute();
	stmt.close();
	connection.close();
	}
	public void apagar(Poupanca poupan�a) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		PreparedStatement stmt = connection.prepareStatement("DELETE FROM Poupan�a WHERE IDdoCliente = ?");
		stmt.setInt(1, p.getIdDoCliente());
		stmt.execute();
		stmt.close();
		connection.close();
	}
	public void atualizar (Poupanca poupan�a) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		PreparedStatement stmt = connection.prepareStatement("UPDATE Poupan�a SET Saldo = ? WHERE IDdoCliente = ?");
		stmt.setDouble(1, p.getSaldo());
		stmt.setInt(2, p.getIdDoCliente());
		stmt.execute();
		stmt.close();
		connection.close();
		
	}
	public List<Poupanca> listar () throws SQLException{
		Connection connection = new ConnectionFactory().getConnection();
		PreparedStatement stmt = connection.prepareStatement("SELECT * FROM Poupan�a");
		List<Poupanca> poupan�as = new ArrayList<Poupanca>();
		
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()){
			Poupanca poupan�a = new Poupanca();
			poupan�a.setIdDoCliente(rs.getInt("IdDoCliente"));
			poupan�a.setSaldo(rs.getDouble("Saldo"));
			poupan�as.add(poupan�a);
		}		
		return poupan�as;
	}

}
