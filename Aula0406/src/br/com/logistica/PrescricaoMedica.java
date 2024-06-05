package br.com.logistica;

public class PrescricaoMedica {
	String receita;
	String medicamento;
	
	public void medicamentosPrescritos() {
		this.medicamento = getMedicamento();
	}
	public String getReceita() {
		return receita;
	}
	public void setReceita(String receita) {
		this.receita = receita;
	}
	public String getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}
}
