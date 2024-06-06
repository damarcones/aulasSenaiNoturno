package br.com.metodomain;

import javax.swing.JOptionPane;

import br.com.pessoas.Medico;
import br.com.pessoas.Paciente;
import br.com.medicamentos.*;

public class metodoMain {

	public static void main(String[] args) {

		Paciente p = new Paciente();
		Medico m1 = new Medico();
		Medico m2 = new Medico();
		Medico m3 = new Medico();
		medicamentosPrescritos medic = new medicamentosPrescritos();

//		p.setNomeCompleto(JOptionPane.showInputDialog("Digite o seu nome completo para o cadastro : "));
//		p.settelefonePaciente(JOptionPane.showInputDialog("Digite o seu telefone : "));
//		p.setDataNascimento(JOptionPane.showInputDialog("Digite o sua data de nascimento : "));
//		p.setSexo(JOptionPane.showInputDialog("Digite o seu sexo : "));
//		p.setBairro(JOptionPane.showInputDialog("Digite o seu bairro : "));
//		p.setCidade(JOptionPane.showInputDialog("Digite o sua cidade : "));
//		p.setEstado(JOptionPane.showInputDialog("Digite o seu estado : "));
//		p.setCep(Integer.parseInt(JOptionPane.showInputDialog("Digite o seu cep : ")));
//		JOptionPane.showConfirmDialog(null, "Cadastro finalizado com sucesso!");

		m1.setNomeCompleto("Jorge da silva");
		m1.setEstado("DF");
		m1.setNumeroCrm(10);
		m1.setSexo("Masculino");
		m1.setCidade("Samambaia");
		m1.setBairro("BLOCO A");
		m1.setDataNascimento("09/05/1984");
		m1.setEspecialidadeNome("Cardiologista");

		m2.setNomeCompleto("Cesar Souza");
		m2.setEstado("DF");
		m2.setNumeroCrm(42);
		m2.setSexo("Masculino");
		m2.setCidade("Vicente Pires");
		m2.setBairro("Rua 10");
		m2.setDataNascimento("14/10/1992");
		m2.setEspecialidadeNome("Pediatra");

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
				int marcar;

				marcar = Integer.parseInt(JOptionPane.showInputDialog("Escolha a especialidade que você deseja : "
						+ "\n1 - Cardiologista" + "\n2 - Pediatra" + "\n3 - Ortopedista" + "\n4 - Dentista"));

				if (marcar == 1) {
					JOptionPane.showConfirmDialog(null,
							"Consulta marcada com sucesso ! \nA seguir dados do médico selecionado.\n\n "
									+ "\nNome do médico : " + m1.getNomeCompleto() + "\nNúmero Crm : "
									+ m1.getNumeroCrm() + "\nEspecialidade : " + m1.getEspecialidadeNome());

				} else if (marcar == 2) {
					JOptionPane.showConfirmDialog(null,
							"Consulta marcada com sucesso ! \nA seguir dados do médico selecionado.\n\n "
									+ "\nNome do médico : " + m2.getNomeCompleto() + "\nNúmero Crm : "
									+ m2.getNumeroCrm() + "\nEspecialidade : " + m2.getEspecialidadeNome());
				} else if (marcar == 3) {
					JOptionPane.showConfirmDialog(null,
							"Consulta marcada com sucesso ! \nA seguir dados do médico selecionado.\n\n "
									+ "\nNome do médico : " + m3.getNomeCompleto() + "\nNúmero Crm : "
									+ m3.getNumeroCrm() + "\nEspecialidade : " + m3.getEspecialidadeNome());
				} else if (marcar == 4) {
					JOptionPane.showConfirmDialog(null, "Não há medicos disponiveis para esta especialidade!");
				} else {
					JOptionPane.showConfirmDialog(null, "Opção inválida.");
				}
				break;
			case 3:
				int sintomas;
				sintomas = Integer.parseInt(JOptionPane
						.showInputDialog("Digite o número de acordo com o seu sintoma : " + "\n1 - Dor de Cabeça"
								+ "\n2 - Dor Muscular" + "\n3 - Problemas de Memórias" + "\n4 - Diabetes"));
				if (sintomas == 1) {
					JOptionPane.showConfirmDialog(null,
							"Para dor de cabeça o remedio indicado é " + medic.dorDeCabeça());
				} else if (sintomas == 2) {
					JOptionPane.showConfirmDialog(null,
							"Para dor de cabeça o remedio indicado é " + medic.doMuscular());
				} else if (sintomas == 3) {
					JOptionPane.showConfirmDialog(null,
							"Para dor de cabeça o remedio indicado é " + medic.problemadeMemoria());
				} else if (sintomas == 4) {
					JOptionPane.showConfirmDialog(null, "Para dor de cabeça o remedio indicado é " + medic.diabetes());
				} else {
					JOptionPane.showConfirmDialog(null, "Opção inválida.");
				}

				break;
			}

		} while (opcoes != 5);

	}

}
