package main;

import java.util.Scanner;
import modelo.Medico;
import modelo.Paciente;
import modelo.Receita;
import modelo.Consulta;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Medico medico = new Medico("Gustavo Fabiano", 325874, "DF");
		Paciente paciente = new Paciente("Fernando", "1999-11-03", "F", "avenida parque de aguas","302", "Brasilia","aguas claras", "DF", "78457124", "Proximo a padaria");
		
		medico.setEspecialidade("Endocrinologia","Pediatria");
		System.out.println("Bem vindo a Clinica Senai");
	}

}
