package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Factory.ConnectionFactory;
import Models.Cliente;
import Models.Investimento;

public class InvestimentoDAO {
	public void insert(Investimento investimento) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
	PreparedStatement stmt = connection.prepareStatement( "INSERT INTO Investimentos VALUES (?,?,?,?)");
	stmt.setInt(1, 30);
	stmt.setString(2, "Microsoft");
	stmt.setDouble(3, 72.32);
	stmt.setString(4, "Positivo");
	
	stmt.execute();
	stmt.close();
	connection.close();
	}
	public void apagar(Investimento investimento) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		PreparedStatement stmt = connection.prepareStatement("DELETE FROM Investimentos WHERE IdFuncionário = ?");
		stmt.setInt(1, 30);
		stmt.execute();
		stmt.close();
		connection.close();
	}
	public void atualizar (Investimento investimento) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		PreparedStatement stmt = connection.prepareStatement("UPDATE investimentos SET NomeEmpresa = ?,"
		+ " PreçoDaAção = ?, VariaçãoDePreço = ? WHERE IdFuncionário = ?");
		stmt.setString(1, "Apple");
		stmt.setDouble(2, 50.12);
		stmt.setString(3, "Negativo");
		stmt.setInt(4, 30);
		stmt.execute();
		stmt.close();
		connection.close();
		
	}
	public List<Investimento> listar () throws SQLException{
		Connection connection = new ConnectionFactory().getConnection();
		PreparedStatement stmt = connection.prepareStatement("SELECT * FROM investimentos");
		List<Investimento> investimentos = new ArrayList<Investimento>();
		
		ResultSet rs = stmt.executeQuery();
	
		while(rs.next()){
			Investimento investimento = new Investimento();
			investimento.setIdFuncionario(rs.getInt("IdFuncionário"));
			investimento.setNomeDaEmpresa(rs.getString("NomeEmpresa")); 
			investimento.setPreçoDaAcao(rs.getDouble("PreçoDaAção"));
			investimento.setVariaçãoDePreço(rs.getString("VariaçãoDePreço"));
			investimentos.add(investimento);
		}		
		return investimentos;
	}

}
