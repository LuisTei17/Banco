package Funcoes;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import DAO.ClienteDAO;
import DAO.ContaDAO;
import DAO.FuncionarioDAO;
import DAO.InvestimentoDAO;
import DAO.PoupancaDAO;

import Models.Cliente;
import Models.Conta;

import Models.Funcionarios;
import Models.Investimento;
import Models.Poupanca;

public class Select {

	public void SelectTab() throws SQLException {
		String a;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		System.out.println("Qual tabela voc� quer  selecionar?" + "\n" + "1-Cliente" + "\n" + "2-Funcionario" + "\n" + "3-Conta" 
		+ "\n" + "4-Poupan�a" + "\n" + "5-Investimentos" + "\n" + "6-ContaCliente");
		a = teclado.next();
		if (a.equals("1")) {
			List<Cliente> clientes = new ClienteDAO().listar();

			for (Cliente cliente : clientes) {
			 	System.out.println(cliente.getID() + "\n" + cliente.getNome() + "\n" + cliente.getCPF() + "\n"
						+ cliente.getIdConta() + "\n" + cliente.getDataDeNascimento() + "\n");
			}

		 
		} else if (a.equals("2")) {
			List<Funcionarios> funcionarios = new FuncionarioDAO().listar();
			for (Funcionarios funcionario : funcionarios) {
				System.out.println(funcionario.getID() + "\n" + funcionario.getNome() + "\n" + funcionario.getSal�rio()
						+ "\n" + funcionario.getDepartamento() + "\n" + funcionario.getCargo());
			}
		}
		else if (a.equals("3")) { 
			List<Conta> contas = new ContaDAO().listar();
			
			for (Conta conta : contas) {
			System.out.println(conta.getID() + "\n" + conta.getSaldo() + "\n" + conta.getDataDeCria��o() + "\n");
		}
		}
		else if (a.equals("4")) {
			List <Poupanca> poupan�as = new PoupancaDAO().listar();
			for (Poupanca poupan�a : poupan�as) {
				System.out.println(poupan�a.getIdDoCliente() + "\n" + poupan�a.getSaldo());
			}
		}
		else if (a.equals("5")) {
			List <Investimento> investimentos = new InvestimentoDAO().listar();
			for (Investimento investimento : investimentos) {
				System.out.println(investimento.getIdFuncionario() + "\n" + investimento.getNomeDaEmpresa()
				+ "\n" + investimento.getPre�oDaAcao() + "\n" + investimento.getVaria��oDePre�o());
			}
		}
	}
}
		

