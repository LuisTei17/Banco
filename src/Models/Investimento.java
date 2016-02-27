package Models;
public class Investimento {
	private int idFuncionario;
	private String nomeDaEmpresa;
	private double preçoDaAcao;
	private String variaçãoDePreço;
		public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public String getNomeDaEmpresa() {
		return nomeDaEmpresa;
	}
	public void setNomeDaEmpresa(String nomeDaEmpresa) {
		this.nomeDaEmpresa = nomeDaEmpresa;
	}
	public double getPreçoDaAcao() {
		return preçoDaAcao;
	}
	public void setPreçoDaAcao(double preçoDaAcao) {
		this.preçoDaAcao = preçoDaAcao;
	}
	public String getVariaçãoDePreço() {
		return variaçãoDePreço;
	}
	public void setVariaçãoDePreço(String variaçãoDePreço) {
		this.variaçãoDePreço = variaçãoDePreço;
	}
	}
