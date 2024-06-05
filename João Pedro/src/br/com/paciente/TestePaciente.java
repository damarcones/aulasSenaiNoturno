package br.com.paciente;
import br.com.paciente.*;
import br.com.consulta.*;
public class TestePaciente {

	public static void main(String[] args) {

		Consulta cn = new Consulta();
		Paciente pa = new Paciente();
		pa.setNomeCompleto("Pedro da Silva");
		pa.setIdade("17");
		pa.setGenero("M");
		
		System.out.println("------- DODOS DO PACIENTE ------");
		System.out.println("\n" + pa.dadosDoPaciente() + cn.ConsultarPaciente());
		
	}

}
