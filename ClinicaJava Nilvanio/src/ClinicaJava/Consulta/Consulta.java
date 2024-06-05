package ClinicaJava.Consulta;

import ClinicaJava.medico.Medico;
import ClinicaJava.paciente.Paciente;

public class Consulta {
	private String dataConsulta;
    private Paciente paciente;
    private Medico medico;
	public String getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
    
  
}
