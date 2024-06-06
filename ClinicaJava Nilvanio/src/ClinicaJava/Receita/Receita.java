package ClinicaJava.Receita;

import ClinicaJava.Medicamento;
import ClinicaJava.Consulta.Consulta;

public class Receita {
	private String descricao;
    private Consulta consulta;
    private Medicamento[] medicamentos;
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Consulta getConsulta() {
		return consulta;
	}
	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}
	public Medicamento[] getMedicamentos() {
		return medicamentos;
	}
	public void setMedicamentos(Medicamento[] medicamentos) {
		this.medicamentos = medicamentos;
	}
    
    

}
