package br.com.metodomain;

import javax.swing.JOptionPane;

import br.com.pessoas.*;
import br.com.medicamentos.*;
import br.com.clinica.*;

public class metodoMain {

	public static void main(String[] args) {

		Paciente p = new Paciente();
		Medico m1 = new Medico();
		Medico m2 = new Medico();
		Medico m3 = new Medico();
		Medico medics = null;
		medicamentosPrescritos medic = new medicamentosPrescritos();
		Consulta consulta = new Consulta();

		// Cadastrando paciente
//		p.setNomeCompleto(JOptionPane.showInputDialog("Digite o seu nome completo para o cadastro : "));
//		p.settelefonePaciente(JOptionPane.showInputDialog("Digite o seu telefone : "));
//		p.setDataNascimento(JOptionPane.showInputDialog("Digite o sua data de nascimento : "));
//		p.setSexo(JOptionPane.showInputDialog("Digite o seu sexo : "));
//		p.setBairro(JOptionPane.showInputDialog("Digite o seu bairro : "));
//		p.setCidade(JOptionPane.showInputDialog("Digite o sua cidade : "));
//		p.setEstado(JOptionPane.showInputDialog("Digite o seu estado : "));
//		

		// metodo para dar erro quando digitar letra
		try {
			p.setCep(Integer.parseInt(JOptionPane.showInputDialog("Digite o seu cep : ")));
		} catch (NumberFormatException e) {
			p.setCep(Integer.parseInt(
					JOptionPane.showInputDialog("Você digitou uma letra!" + "\nDigite o seu cep novamente : ")));
		} finally {
			JOptionPane.showMessageDialog(null, "Cadastro finalizado com sucesso!");
		}

		// set medico 1
		m1.setNomeCompleto("Jorge da silva");
		m1.setEstado("DF");
		m1.setNumeroCrm(10);
		m1.setSexo("Masculino");
		m1.setCidade("Samambaia");
		m1.setBairro("BLOCO A");
		m1.setDataNascimento("09/05/1984");
		m1.setEspecialidadeNome("Cardiologista");

		// set medico 2
		m2.setNomeCompleto("Cesar Souza");
		m2.setEstado("DF");
		m2.setNumeroCrm(42);
		m2.setSexo("Masculino");
		m2.setCidade("Vicente Pires");
		m2.setBairro("Rua 10");
		m2.setDataNascimento("14/10/1992");
		m2.setEspecialidadeNome("Pediatra");

		// set medico 3
		m3.setNomeCompleto("Fernanda");
		m3.setEstado("DF");
		m3.setNumeroCrm(12);
		m3.setSexo("Feminino");
		m3.setCidade("Recanto das Emas");
		m3.setBairro("Lote 2");
		m3.setDataNascimento("27/04/1998");
		m3.setEspecialidadeNome("Ortopedista");

		int opcoes;

		do {

			opcoes = Integer.parseInt(JOptionPane.showInputDialog(
					"Escolha a operação que deseja fazer :" + "\n\n1 - Consultar meus dados" + "\n2 - Marcar consulta"
							+ "\n3 - Consultar sintomas" + "\n4 - Imprimir receita" + "\n5 - Fechar programa"));

			switch (opcoes) {

			case 1:
				JOptionPane.showConfirmDialog(null,
						"Nome : " + p.getNomeCompleto() + "\nTelefone : " + p.gettelefonePaciente()
								+ "\nData de Nascimento : " + p.getDataNascimento() + "\nSexo : " + p.getSexo()
								+ "\nEstado : " + p.getEstado() + "\nCidade : " + p.getCidade() + "\nBairro : "
								+ p.getBairro() + "\nCEP : " + p.getCep());
				break;
			case 2:

				String[] datas = { "05/10 ás 14h30", "05/10 ás 10h30", "05/10 ás 18h", "05/10 ás 13h", "05/10 ás 16h" };

				int marcar;

				marcar = Integer.parseInt(JOptionPane.showInputDialog("Escolha a especialidade que você deseja : "
						+ "\n1 - Cardiologista" + "\n2 - Pediatra" + "\n3 - Ortopedista" + "\n4 - Dentista"));

				if (marcar == 1) {
					medics = m1;
				} else if (marcar == 2) {
					medics = m2;
				} else if (marcar == 3) {
					medics = m3;
				} else if (marcar == 4) {
					JOptionPane.showConfirmDialog(null, "Não há medicos disponiveis para esta especialidade!");
				} else {
					JOptionPane.showConfirmDialog(null, "Opção inválida.");
				}

				// Pede que o paciente escolha a data e a hora da consulta
				String dataHoraEscolhida = (String) JOptionPane.showInputDialog(null,
						"Selecione a data e a hora que você deseja : ", "", JOptionPane.QUESTION_MESSAGE, null, datas,
						datas[0]);

				if (dataHoraEscolhida == null) {
					JOptionPane.showMessageDialog(null, "Opção inválida.");
					break;
				}

				String[] partes = dataHoraEscolhida.split(" às ");
				String data = partes[0];
				String hora = partes[1];

				consulta.setDataConsulta(data);
				consulta.setHoraConsulta(hora);

				JOptionPane.showMessageDialog(null, "Consulta marcada com sucesso!\n" + medics.mostrarDadosMedico()
						+ "\nData : " + consulta.getDataConsulta() + "\nHora : " + consulta.getHoraConsulta());

				break;
			case 3:
				int sintomas;
				sintomas = Integer.parseInt(JOptionPane
						.showInputDialog("Digite o número de acordo com o seu sintoma : " + "\n1 - Dor de Cabeça"
								+ "\n2 - Dor Muscular" + "\n3 - Problemas de Memórias" + "\n4 - Diabetes"));
				if (sintomas == 1) {
					JOptionPane.showMessageDialog(null,
							"Para dor de cabeça o remedio indicado é " + medic.dorDeCabeça());
				} else if (sintomas == 2) {
					JOptionPane.showMessageDialog(null,
							"Para dor de cabeça o remedio indicado é " + medic.doMuscular());
				} else if (sintomas == 3) {
					JOptionPane.showMessageDialog(null,
							"Para dor de cabeça o remedio indicado é " + medic.problemadeMemoria());
				} else if (sintomas == 4) {
					JOptionPane.showMessageDialog(null, "Para dor de cabeça o remedio indicado é " + medic.diabetes());
				} else {
					JOptionPane.showMessageDialog(null, "Opção inválida.");
				}

				break;
			}

		} while (opcoes != 5);

	}

}
