package br.com.procedimentos;

import java.util.Date;
import javax.swing.JOptionPane;
import br.com.especialidades.*;
import br.com.pessoas.*;
import br.com.principal.*;

public class Consulta {
	
	private Date dataConsulta;
	private String diagnostico;
	private String receita;
	private String sintomas;
	
	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getReceita() {
		return receita;
	}

	public void setReceita(String receita) {
		this.receita = receita;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public Date getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	
	// métodos negociais 
	
	public void marcarConsulta(Date dataConsulta) {
			this.setDataConsulta(dataConsulta);
		}
	
	public void realizarConsulta(String diagnostico, String nomePaciente, String medicamentoPrescrito) {
		// inserir atestado??
	}

	/*
	 * NomePaciente,
	 * Sintomas
	 * Diagnostico 
	 * Receita
	 * */
	
	
	public void prescreverMedicamento() {
			String sintomas = JOptionPane.showInputDialog("Descreva os sintomas: ");
			setSintomas(sintomas);
			String diagnostico = JOptionPane.showInputDialog("Descreva o diagnostico: ");
			setDiagnostico(diagnostico);
			String receita = JOptionPane.showInputDialog("Descreva a receita médica: ");
			setReceita(receita);		
		}
	
	public void imprimirReceita() {
		
	}
	

}
