package br.com.principal;

import javax.swing.JOptionPane;

import br.com.especialidades.Especialidade;
import br.com.pessoas.*;
import br.com.procedimentos.Consulta;

public class Main {

	public static void main(String[] args) {

		Paciente p1 = new Paciente();
		Medico m1 = new Medico();
		Especialidade especialidade = new Especialidade();
		Consulta consulta = new Consulta();

		p1.setNomeCompleto("Marcos");
		p1.setDataNascimento("05/06/1980");
		p1.setSexo('M');
		p1.setRua("Qnb");
		p1.setNumero(1);
		p1.setBairro("Norte");
		p1.setCidade("Taguatinga");
		p1.setEstado("DF");
		p1.setComplemento("Casa 2");
		p1.setCep(7200102);
		p1.setTelefone("61 981020405");

		m1.setNomeCompleto("Ana");
		m1.setDataNascimento("22/06/1975");
		m1.setSexo('F');
		m1.setRua("Qng");
		m1.setNumero(2);
		m1.setBairro("Norte");
		m1.setCidade("Taguatinga");
		m1.setEstado("DF");
		m1.setComplemento("Casa 6");
		m1.setCep(7200506);
		m1.setTelefone("(61)9899-9899");
		m1.setNumeroCrm(123456);
		especialidade.setNomeEspecialidade("Clinica Geral");

		// Menu inicial

		String menu1 = "Menu Inicial\n";
		menu1 = menu1 + "1. Paciente\n";
		menu1 = menu1 + "2. Médico";

		int opcaoMenu1;
		do {
			opcaoMenu1 = Integer.parseInt(JOptionPane.showInputDialog(menu1));
			
			String menu2 = "Escolha uma opção!\n";
			menu2 = menu2 + "1. Realizar Consulta\n";
			menu2 = menu2 + "2. Consultas Marcadas";

			int opcaoMenu2;
			
			switch (opcaoMenu1) {
			case 1:
				JOptionPane.showMessageDialog(null, "Em construção!");
				break;
			case 2:
				do {
					opcaoMenu2 = Integer.parseInt(JOptionPane.showInputDialog(menu2));
					switch (opcaoMenu2) {
					case 1:
						consulta.prescreverMedicamento();
						consulta.imprimirReceita();
						JOptionPane.showMessageDialog(null,
								"Laudo Médico \n" + "Nome Paciente: " + p1.getNomeCompleto() + "\nSintomas: "
										+ consulta.getSintomas() + "\n" + "Diagnóstico: " + consulta.getDiagnostico()
										+ "\n" + "Receita: " + consulta.getReceita());
						break;
					case 2:
						JOptionPane.showMessageDialog(null, "Em construção!");
						break;
					default: 
						JOptionPane.showMessageDialog(null, "Opção inválida1!");
						break;
					}
				} while (opcaoMenu2 != 2);
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida2!");
				break;
			}

		} while (opcaoMenu1 != 2);

	}

}
