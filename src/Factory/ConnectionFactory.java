package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() throws SQLException{
		String url = "jdbc:mysql://127.0.0.1:3306/banco";
		String user = "root"; //nome do usu�rio do MySql
		String password = "poltrona1590"; // Senha do MySql
		
		Connection conex�o = DriverManager.getConnection(url, user, password);
		return conex�o;
		
	}


}
