package br.com.principal;

import javax.swing.JOptionPane;

import br.com.especialidades.Especialidade;
import br.com.pessoas.*;

public class Main {
	
	public static void main(String[] args) {
		
		Paciente p1 = new Paciente();
		
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
		
		Medico m1 = new Medico();
		Especialidade especialidade = new Especialidade();
		
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
		
		String menu = "Escolha uma opção!\n";
				menu = menu + "1. Realizar Consulta\n";
				menu = menu + "2. Consultas Marcadas";
		
		int opcao;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
					switch (opcao) {
						case 1:
					}
			
		} while (opcao != 2);
		
	}

}
