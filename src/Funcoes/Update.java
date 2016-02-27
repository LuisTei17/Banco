package Funcoes;


import java.sql.SQLException;
import java.util.*;

import DAO.ClienteDAO;
import DAO.ContaDAO;
import DAO.FuncionarioDAO;
import DAO.InvestimentoDAO;
import DAO.PoupancaDAO;

public class Update {
	public void Update () throws SQLException {
		String a;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a tabela que é desejada a atualização" + "\n" + "1-Cliente" + "\n" + "2-Funcionarios"
		+ "\n" + "3-Conta" + "\n" + "4-Poupança" + "\n" + "5-investimentos");
		a = teclado.next();
		if (a.equals("1")) {
			ClienteDAO c = new ClienteDAO();
			c.atualizar(null);
		}
		else if (a.equals("2")) {
			FuncionarioDAO f = new FuncionarioDAO();
			f.atualizar(null);
		}
		else if (a.equals("3")) {
			ContaDAO c = new ContaDAO();
			c.atualizar(null);
		}
		else if (a.equals("4")) {
			PoupancaDAO p = new PoupancaDAO();
			p.atualizar(null);
		}
		else if (a.equals("5")) {
			InvestimentoDAO i = new InvestimentoDAO();
			i.atualizar(null);
		}
		
	}
	

}
