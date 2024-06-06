package ClinicaJava;

import ClinicaJava.paciente.Paciente;

public class Principal {

	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente("Fulano da Silva", "01/01/1990", 'M', "Rua A", "123", "Centro", "CidadeA", "EstadoA", "", "12345-678", "9999-8888");
        Paciente paciente2 = new Paciente("Ciclana Oliveira", "15/05/1985", 'F', "Rua B", "456", "BairroB", "CidadeB", "EstadoB", "", "54321-987", "9876-5432");

        // Você pode agora usar esses objetos de paciente conforme necessário
        System.out.println("Paciente 1: " + paciente1);
        System.out.println("Paciente 2: " + paciente2);

	}

}
