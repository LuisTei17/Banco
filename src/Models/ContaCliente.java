package Models;

public class ContaCliente {
	private String nome;
	private double saldo;
	private int ID;
	private int IdConta;
	Cliente c = new Cliente();
	Conta co = new Conta();

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = co.getID();
	}

	public int getIdConta() {
		return IdConta;
	}

	public void setIdConta(int idConta) {
		IdConta = c.getIdConta();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		c.setNome(nome);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		 co.setSaldo(saldo);
	}

}
