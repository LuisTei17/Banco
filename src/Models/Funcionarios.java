package Models;
public class Funcionarios {
	private int ID;
	private String nome;
	private double sal�rio;
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
	public double getSal�rio() {
		return sal�rio;
	}
	public void setSal�rio(double sal�rio) {
		this.sal�rio = sal�rio;
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
