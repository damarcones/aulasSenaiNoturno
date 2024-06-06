package br.com.medicamentos;

public class medicamentosPrescritos extends Medicamento {

private String nomeMedicamento;
	
	public String dorDeCabeça(){
		nomeMedicamento = "Dipirona - Tomar de 8 em 8 horas durante 5 dias!";
		return nomeMedicamento;
	}
	
	public String dorMuscular(){
		nomeMedicamento = "Dorflex - Tomar de 6 em 6 horas durante 7 dias!";
		return nomeMedicamento;
	}
	
	public String problemadeMemoria(){
		nomeMedicamento = "Ritalina - Tomar uma vez ao dia durante 5 dias!";
		return nomeMedicamento;
	}
	
	public String diabetes(){
		nomeMedicamento = "Insulina - Tomar 14 unidades pela manhã e 18 após o jantar!";
		return nomeMedicamento;
	}
	

	
}
