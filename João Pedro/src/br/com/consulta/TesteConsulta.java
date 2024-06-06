package br.com.consulta;
import  br.com.paciente.*;
public class TesteConsulta {

	private static void main(String[] args) {
		Consulta cn = new Consulta();
		Paciente pa = new Paciente();
		cn.setDataConsulta("20/06/2024");
	
		
		System.out.println("\n" + cn.ConsultarPaciente());
	}

}
