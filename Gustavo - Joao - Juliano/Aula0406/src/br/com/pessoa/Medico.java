package br.com.pessoa;

public class Medico {
	private String nomeCompletoMedico, estado, especialidade;
	private int numeroCrm;
	
	//GET - SET - NOME COMPLETO//
	public String getNomeCompletoMedico() {
		return nomeCompletoMedico;
	}
	public void setNomeCompleto(String nomeCompletoMedico) {
		this.nomeCompletoMedico = nomeCompletoMedico;
	}
	//GET - SET NUMERO CRM//
	public int getNumeroCrm () {
		return numeroCrm;
	}
	public void setNumeroCrm(int numeroCrm) {
		this.numeroCrm = numeroCrm;
	}
	//GET - SET ESTADO//
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	//GET - SET ESPECIALIDADE//
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

}
