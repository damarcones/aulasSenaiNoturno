package ClinicaJava.medico;

import ClinicaJava.Especialidade.Especialidade;

public class Medico {
	 private String nomeCompleto;
	 private String numeroCRM;
	 private String estado;
	 private Especialidade especialidadeClinica;
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getNumeroCRM() {
		return numeroCRM;
	}
	public void setNumeroCRM(String numeroCRM) {
		this.numeroCRM = numeroCRM;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Especialidade getEspecialidadeClinica() {
		return especialidadeClinica;
	}
	public void setEspecialidadeClinica(Especialidade especialidadeClinica) {
		this.especialidadeClinica = especialidadeClinica;
	}

	 
}
