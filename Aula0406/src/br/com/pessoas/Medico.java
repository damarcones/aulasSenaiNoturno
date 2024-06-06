package br.com.pessoas;

public class Medico extends Paciente {

	protected int numeroCrm;
	protected String especialidadeNome;
	
	public void setNumeroCrm(int numeroCrm) {
		this.numeroCrm = numeroCrm;
	}
	public int getNumeroCrm() {
		return numeroCrm;
	}
	public String getEspecialidadeNome() {
		return especialidadeNome;
	}
	public void setEspecialidadeNome(String especialidadeNome) {
		this.especialidadeNome = especialidadeNome;
	}
	
	
	
	
	
	
}
