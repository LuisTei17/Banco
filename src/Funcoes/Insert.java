package Funcoes;


import java.sql.SQLException;
import java.util.*;

import DAO.ClienteDAO;
import DAO.ContaDAO;
import DAO.FuncionarioDAO;
import DAO.InvestimentoDAO;
import DAO.PoupancaDAO;
import Models.Cliente;
import Models.Funcionarios;
public class Insert {
	public void InsertI() throws SQLException {
	Scanner teclado = new Scanner(System.in);
	String a;
	System.out.println("Qual tabela você quer inserir dados?" + "\n" + "1-Cliente" + "\n" + "2-Funcionario" + "\n" + "3-Conta"
	+ "\n" + "4-Poupança" + "\n" + "5-Investimentos");
	a = teclado.next();
	
	if (a.equals("1")) {
		ClienteDAO cl = new ClienteDAO();
		cl.insert(null); 
	}
	else if (a.equals("2")) {
		FuncionarioDAO f = new FuncionarioDAO();
		f.insert(null);
	}
	
	else if (a.equals("3")) {
		ContaDAO c = new ContaDAO();
		c.insert(null);
	}
	else if (a.equals("4")) {
		PoupancaDAO p = new PoupancaDAO();
		p.insert(null);
	}
	else if (a.equals("5")) {
		InvestimentoDAO i = new InvestimentoDAO();
		i.insert(null);
	}
	
	}
}
