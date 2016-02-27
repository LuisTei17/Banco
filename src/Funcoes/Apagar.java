package Funcoes;
import java.util.*;

import DAO.ClienteDAO;
import DAO.ContaDAO;
import DAO.FuncionarioDAO;
import DAO.InvestimentoDAO;
import DAO.PoupancaDAO;
import Models.Investimento;

import java.sql.SQLException;

public class Apagar {
	public void apagar() throws SQLException {
		String a;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual tabela tu quer apagar?" + "\n" + "1-Cliente" + "\n" + "2-Funcionario" + "\n" + "3-Conta" 
		+ "\n" + "4-Poupança" + "\n" + "5-Investimentos");
		a = teclado.next();
		if (a.equals("1")) {
			ClienteDAO c = new ClienteDAO();
			c.apagar(null);
		}
		else if (a.equals("2")) {
			FuncionarioDAO f = new FuncionarioDAO();
			f.apagar(null);
		}
		else if (a.equals("3")) {
			ContaDAO c = new ContaDAO();
			c.apagar(null);
		}
		else if (a.equals("4")) {
			PoupancaDAO p = new PoupancaDAO();
			p.apagar(null);
		}
		
		
		else if (a.equals("5")) {
			InvestimentoDAO i = new InvestimentoDAO();
			i.apagar(null);
		}
		
	}

}
