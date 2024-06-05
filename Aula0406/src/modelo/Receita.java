package modelo;

public class Receita {
	String descricao;
	String nomeMedicamento[];
	int n,i;
	
	void setMedicamentosPrecritos(String medicamento) {
		n++;
		for (i = n-1; i<n; i++) {
			this.nomeMedicamento[n-1] = medicamento; 
		}
	}
}
