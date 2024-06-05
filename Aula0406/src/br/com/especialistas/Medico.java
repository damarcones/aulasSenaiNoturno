package br.com.especialistas;

import br.com.hospital.Pessoa;

public class Medico extends Pessoa {
	int numeroCrm;

	public int getNumeroCrm() {
		return numeroCrm;
	}

	public void setNumeroCrm(int numeroCrm) {
		this.numeroCrm = numeroCrm;
	}public String receita() {
		return this.getDescricao();
	}
}
