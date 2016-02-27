package Console;
import java.sql.SQLException;

import Funcoes.Apagar;
import Funcoes.Insert;
import Funcoes.Select;
import Funcoes.Update;
import Models.ContaCliente;
import Models.Investimento;

import java.util.*;

import DAO.ContaClienteDAO;
import DAO.InvestimentoDAO;



public class ConsoleApp {

	public static void main(String[] args) throws SQLException {	
		Scanner teclado = new Scanner(System.in);
		String a, b;
		
		do {
		System.out.println("O que você deseja fazer?" + "\n" + "1-Selecionar" + "\n" + "2-Inserir" + 
		"\n" + "3-Atualizar" + "\n" + "4-Apagar" + "\n" + "5-ContaCliente");
		a = teclado.next();	
		
		if (a.equals("1")) {
		Select s = new Select();	
		s.SelectTab();
		}
		else if (a.equals("2")){
			Insert ins = new Insert();
			ins.InsertI();
		}
		else if (a.equals("3")) {
			Update up = new Update();
			up.Update();
			}
		else if (a.equals("4")) {
			Apagar ap = new Apagar();
			ap.apagar();
		}
		else if (a.equals("5")) {
			List <ContaCliente> cc = new ContaClienteDAO().listar();
			for (ContaCliente ccs : cc) {
				System.out.println(ccs.getNome() + " | " + ccs.getSaldo() + "\n");
			}
					}
		
		
		System.out.println("deseja repetir a operação? 1-Sim ou 2-Não");
		b = teclado.next();
		}
	
	while (b.equals("1"));
	}
}
