package br.com.medicamentos;

import br.com.pessoas.Consulta;
import br.com.pessoas.Medico;

public class Receita {
	
	 private Medico medico;
	    private Consulta consulta;
	    private String sintoma;
	    private String remedio;

	    public void setDadosReceita(Medico medico, Consulta consulta, String sintoma, String remedio) {
	        this.medico = medico;
	        this.consulta = consulta;
	        this.sintoma = sintoma;
	        this.remedio = remedio;
	    }

	public String imprimirReceita() {
		String receituario = "Receituário\n\n" +
                "Nome do médico: " + medico.getNomeCompleto() + "\n" +
                "CRM do médico: " + medico.getNumeroCrm() + "\n" +
                "Especialidade: " + medico.getEspecialidadeNome() + "\n" +
                "Data: " + consulta.getDataConsulta() + "\n" +
                "Hora: " + consulta.getHoraConsulta() + "\n" +
                "Sintoma: " + sintoma + "\n" +
                "Remédio receitado: " + remedio;
		return receituario;
	}
}
