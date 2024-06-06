package br.com.especialistas;
import br.com.hospital.Enderecos;
import br.com.hospital.Pessoa;

public class Medico extends Pessoa {
	int numeroCrm;
	String estado;	
	String especialidade[];
	public Medico(){}
	
	public Medico(String nomeCompleto, int numeroCrm, String estado) {
		this.setNomeCompleto(nomeCompleto);
		this.setNumeroCrm(numeroCrm);
		this.setEstado(estado);
		//puxar enderecos da classe enderecos
		System.out.println("Cadastrando.");
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String[] getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String[] especialidade) {
		this.especialidade = especialidade;
	}
	public int getNumeroCrm() {
		return numeroCrm;
	}
	public void setNumeroCrm(int numeroCrm) {
		this.numeroCrm = numeroCrm;
	}public String receita() {
		return this.getDescricao();
	}
	
}
