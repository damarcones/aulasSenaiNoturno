package br.com.medico;

import java.util.Date;

public class Medico {
	
	private String nomeCompleto;
	private int numeroCrm;
	private char estado;
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	public int getNumeroCrm() {
		return numeroCrm;
	}
	public void setNumeroCrm(int numeroCrm) {
		this.numeroCrm = numeroCrm;
	}
	
	public char getEstado() {
		return estado;
	}
	public void setEstado(char estado) {
		this.estado = estado;
	}
	
	// métodos negociais 
	
	public void realizarConsulta(Date dataConsulta, String especialidade, String paciente, String estado) {
		
	}
	
	public void prescreverMedicamento() {
		
	}
	
	
	

}
