package br.com.metodomain;

import javax.swing.JOptionPane;

import br.com.pessoas.Medico;
import br.com.pessoas.Paciente;

public class metodoMain {

	public static void main(String[] args) {

		Paciente p = new Paciente();
		Medico m1 = new Medico();

		p.setNomeCompleto(JOptionPane.showInputDialog("Digite o seu nome completo para o cadastro : "));
		p.settelefonePaciente(JOptionPane.showInputDialog("Digite o seu telefone : "));
		p.setDataNascimento(JOptionPane.showInputDialog("Digite o sua data de nascimento : "));
		p.setSexo(JOptionPane.showInputDialog("Digite o seu sexo : "));
		p.setBairro(JOptionPane.showInputDialog("Digite o seu bairro : "));
		p.setCidade(JOptionPane.showInputDialog("Digite o sua cidade : "));
		p.setEstado(JOptionPane.showInputDialog("Digite o seu estado : "));
		p.setCep(Integer.parseInt(JOptionPane.showInputDialog("Digite o seu cep : ")));
		JOptionPane.showConfirmDialog(null, "Cadastro finalizado com sucesso!");

		m1.setNomeCompleto("Jorge da silva");
		m1.setEstado("SP");
		m1.setNumeroCrm(10);
		m1.setSexo("Masculino");
		m1.setCidade("Samambaia");
		m1.setBairro("BLOCO A");
		m1.setDataNascimento("09/05/1984");
		m1.setEspecialidadeNome("Cardiologista");
		
		int opcoes;
		
		opcoes = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de acordo com qual especialidade você deseja :" + "\n\n1 - Cardiologista" + "\n2 - Ortopedista" + "\n3 - PediatraF"));
		
		switch (opcoes) {
		case 1:
			
		}


	}

}
