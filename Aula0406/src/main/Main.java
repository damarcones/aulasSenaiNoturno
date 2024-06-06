package main;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import modelo.Medico;
import modelo.Paciente;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
	      
		Scanner leia = new Scanner(System.in);
		Medico medico = new Medico("Gustavo Fabiano", 325874, "DF");
		Paciente paciente = new Paciente("Fernando", "1999-11-03", "F", "avenida parque de aguas","302", "Brasilia","aguas claras", "DF", "78457124", "Proximo a padaria");
		
		  //Setando especilidades
		  List<String> especialidades = new ArrayList<String>();
		  especialidades.add("Endocrinologista");
		  especialidades.add("Pediatra");

		  //String[] arrayDeNomes = especialidades.toArray(new String[0]);
		  //Setando números do paciente
	      List<String> numeroPaciente = new ArrayList<String>();
	      numeroPaciente.add("61986512587");
	      numeroPaciente.add("61978456932");

		  //String[] arrayDeNumeros = numeroPaciente.toArray(new String[0]);
	      //Setando nome dos medicamentos precristos
	      List<String> medicamentosPrescritos = new ArrayList<String>();
	      numeroPaciente.add("Valpromato de Sodio");
	      numeroPaciente.add("Dipirona");


		  String menu  = "Escolha a opção desejada:\n";
		  menu += "1. Ver consultas marcadas.\n";
		  menu += "2. Numeros do Paciente.\n";
		  menu += "3. Ver dados dos Pacientes cadastrados.\n";
		  menu += "4. Conferir receitas médicas do paciente.\n";
		  menu += "5. Sair";
		  
		  int opcao;
		  
		  do {
			 opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
			 switch(opcao){
			 case 1:
				 JOptionPane.showMessageDialog(null, "Consultas marcadas");
				 break;
			 
			 case 2: 
				 JOptionPane.showMessageDialog(null, "Numeros do paciente:\n" + numeroPaciente);
				 break;
			 case 3:
				 JOptionPane.showMessageDialog(null, "Dados do paciente:" + paciente.dadosDoPaciente());
				 break;
			   
			 case 4:
				 JOptionPane.showMessageDialog(null, "Receitas:" );
				 break;
			 case 5:
				 JOptionPane.showMessageDialog(null, "Sair");
				 break;
			
		  }	 
		  }while (opcao !=5);
	}
}


