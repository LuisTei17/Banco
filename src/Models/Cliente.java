package Models;
public class Cliente {
	private int ID;
	private int IdConta;
	private String dataDeNascimento;
	private String CPF;
	private String nome;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getIdConta() {
		return IdConta;
	}
	public void setIdConta(int idConta) {
		IdConta = idConta;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
		

}
