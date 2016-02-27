package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Factory.ConnectionFactory;
import Models.ContaCliente;

public class ContaClienteDAO {
	/*
	 * public List <ClienteConta> listar() throws SQLException {
	 * 
	 * PreparedStament stmt = connection.prepareStatement(
	 * "SELECT * FROM Cliente c, Conta co WHERE c.IDConta = co.ID")
	 */
	public List<ContaCliente> listar() throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		PreparedStatement stmt = connection
				.prepareStatement("SELECT saldo, nome FROM Conta co, Cliente c WHERE c.ID_Conta = co.ID;");
		List<ContaCliente> ccs = new ArrayList<ContaCliente>();
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			System.out.println("Nome:" + rs.getString(2) + " \n" +"Saldo:"+ rs.getString(1) + "\n");
			
				}
		return ccs;

	}
}
