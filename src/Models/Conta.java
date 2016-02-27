package Models;
public class Conta {
	private int ID;
	private double Saldo;
	private String dataDeCriação;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	public String getDataDeCriação() {
		return dataDeCriação;
	}
	public void setDataDeCriação(String dataDeCriação) {
		this.dataDeCriação = dataDeCriação;
	}
	
}
