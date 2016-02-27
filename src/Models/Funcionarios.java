package Models;
public class Funcionarios {
	private int ID;
	private String nome;
	private double salário;
	private String departamento;
	private String cargo;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalário() {
		return salário;
	}
	public void setSalário(double salário) {
		this.salário = salário;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}
