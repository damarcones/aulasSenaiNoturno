package br.com.medicamentos;

public class medicamentosPrescritos extends Medicamento {

private String nomeMedicamento;
	
	public String dorDeCabeça(){
		nomeMedicamento = "Dipirona";
		return nomeMedicamento;
	}
	
	public String doMuscular(){
		nomeMedicamento = "Dorflex";
		return nomeMedicamento;
	}
	
	public String problemadeMemoria(){
		nomeMedicamento = "Ritalina";
		return nomeMedicamento;
	}
	
	public String diabetes(){
		nomeMedicamento = "Insulina";
		return nomeMedicamento;
	}
	

	
}
