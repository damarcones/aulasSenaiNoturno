package br.com.especialidades;

import br.com.pessoas.Medico;
import br.com.pessoas.Paciente;

public class Especialidade extends Paciente {
	
	private String nomeEspecialidade;

	public String getNomeEspecialidade() {
		return nomeEspecialidade;
	}

	public void setNomeEspecialidade(String nomeEspecialidade) {
		this.nomeEspecialidade = nomeEspecialidade;
	}

}
