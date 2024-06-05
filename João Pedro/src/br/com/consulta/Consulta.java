package br.com.consulta;
import br.com.medico.*;
import br.com.paciente.*;
public class Consulta {

	public String dataConsulta;
	
	public String getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public String ConsultarPaciente() {
		String dados = "\nData da consulta: " + this.getDataConsulta() ;
		return dados;
	
	}
}
