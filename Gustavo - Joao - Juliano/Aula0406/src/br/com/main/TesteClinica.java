package br.com.main;
import br.com.clinica.*;
import br.com.pessoa.*;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.*;
import java.awt.*;


public class TesteClinica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente paciente1 = new Paciente();
		paciente1.setNomeCompleto("Juliano Ferreira de Oliveira");
		paciente1.setDataNascimento("27/07/1990");
		paciente1.setSexo("M");
		paciente1.setRua("QNP 10");
		paciente1.setBairro("Psul");
		paciente1.setCidade("Brasília");
		paciente1.setEstado("DF");
		paciente1.setComplemento("Conjunto G");
		paciente1.setNumeroCasa(23);
		paciente1.setTelefonePaciente(995648383);
		
		Paciente paciente2 = new Paciente();
		paciente2.setNomeCompleto("Maria da Silva");
		paciente2.setDataNascimento("15/03/1985");
		paciente2.setSexo("F");
		paciente2.setRua("Rua das Flores");
		paciente2.setBairro("Centro");
		paciente2.setCidade("São Paulo");
		paciente2.setEstado("SP");
		paciente2.setComplemento("Apto 301");
		paciente2.setNumeroCasa(10);
		paciente2.setTelefonePaciente(987654321);
		
		Medico medico1 = new Medico();
		medico1.setNomeCompleto("Dr. Drauzio Vrau Nelas");
		medico1.setNumeroCrm(666);
		medico1.setEstado("AC");
		medico1.setEspecialidade("Ortopedista");
		
		 Medico medico2 = new Medico();
	     medico2.setNomeCompleto("Dr. José da Silva");
	     medico2.setNumeroCrm(777);
	     medico2.setEstado("SP");
	     medico2.setEspecialidade("Cardiologista");
		
		Consulta consulta = new Consulta();
		consulta.setDataConsulta("10/08/2024");
		
		Receita receita = new Receita();
		receita.setDescricao("Paratudo de 8h em 8h durante 7 dias.");
		
		/* --VERSÃO01 ORIGINAL 
		System.out.println(" ###### PACIENTES ######");
		System.out.println("Nome: " + paciente1.getNomeCompletoPaciente());
		System.out.println("Data de Nascimento: " + paciente1.getDataNascimento());
		System.out.println("Sexo: " + paciente1.getSexo());
		System.out.println("Endereço: Rua " + paciente1.getRua() + " " + paciente1.getComplemento() + " Casa " + paciente1.getNumeroCasa());
		System.out.println("Bairro: " + paciente1.getBairro() + " / Cidade: " + paciente1.getCidade() + " / Estado: " + paciente1.getEstado());
		System.out.println("Telefone: " + paciente1.getTelefonePaciente());
		
		System.out.println("\n" + "Nome: " + paciente2.getNomeCompletoPaciente());
		System.out.println("Data de Nascimento: " + paciente2.getDataNascimento());
		System.out.println("Sexo: " + paciente2.getSexo());
		System.out.println("Endereço: Rua " + paciente2.getRua() + " " + paciente2.getComplemento() + " Casa " + paciente2.getNumeroCasa());
		System.out.println("Bairro: " + paciente2.getBairro() + " / Cidade: " + paciente2.getCidade() + " / Estado: " + paciente2.getEstado());
		System.out.println("Telefone: " + paciente2.getTelefonePaciente());
		
		System.out.println("\n" + " ###### MÉDICO ######");
		System.out.println("Nome: " + medico.getNomeCompletoMedico());
		System.out.println("Especialidade: " + medico.getEspecialidade());
		System.out.println("CRM Nº " + medico.getNumeroCrm() + "/ " + medico.getEstado());
		
		
		System.out.println("\n" + " ###### PRONTUÁRIO ######");
		System.out.println("Paciente: " + paciente1.getNomeCompletoPaciente() + "\n" +
                "Foi atendido pelo Médico: " + medico.getNomeCompletoMedico() +
                ", teve como prescrição a seguinte medicação: " + receita.getDescricao());
*/
	/* VERSÃO 02 APOS PESQUISA NA NET	
		// Mostrar informações dos pacientes em JOptionPane
        String infoPaciente1 = "Nome: " + paciente1.getNomeCompletoPaciente() + "\n" +
                "Data de Nascimento: " + paciente1.getDataNascimento() + "\n" +
                "Sexo: " + paciente1.getSexo() + "\n" +
                "Endereço: Rua " + paciente1.getRua() + " " + paciente1.getComplemento() + " Casa " + paciente1.getNumeroCasa() + "\n" +
                "Bairro: " + paciente1.getBairro() + " / Cidade: " + paciente1.getCidade() + " / Estado: " + paciente1.getEstado() + "\n" +
                "Telefone: " + paciente1.getTelefonePaciente();
        JOptionPane.showMessageDialog(null, infoPaciente1, "Paciente 1", JOptionPane.INFORMATION_MESSAGE);

        String infoPaciente2 = "Nome: " + paciente2.getNomeCompletoPaciente() + "\n" +
                "Data de Nascimento: " + paciente2.getDataNascimento() + "\n" +
                "Sexo: " + paciente2.getSexo() + "\n" +
                "Endereço: Rua " + paciente2.getRua() + " " + paciente2.getComplemento() + " Casa " + paciente2.getNumeroCasa() + "\n" +
                "Bairro: " + paciente2.getBairro() + " / Cidade: " + paciente2.getCidade() + " / Estado: " + paciente2.getEstado() + "\n" +
                "Telefone: " + paciente2.getTelefonePaciente();
        JOptionPane.showMessageDialog(null, infoPaciente2, "Paciente 2", JOptionPane.INFORMATION_MESSAGE);

        // Mostrar informações do médico em JOptionPane
        String infoMedico = "Nome: " + medico.getNomeCompletoMedico() + "\n" +
                "Especialidade: " + medico.getEspecialidade() + "\n" +
                "CRM Nº " + medico.getNumeroCrm() + "/ " + medico.getEstado();
        JOptionPane.showMessageDialog(null, infoMedico, "Médico", JOptionPane.INFORMATION_MESSAGE);

        // Mostrar informações da consulta em JOptionPane
        String infoConsulta = "Data da Consulta: " + consulta.getDataConsulta();
        JOptionPane.showMessageDialog(null, infoConsulta, "Consulta", JOptionPane.INFORMATION_MESSAGE);

        // Mostrar informações da receita em JOptionPane
        String infoReceita = "Descrição da Receita: " + receita.getDescricao();
        JOptionPane.showMessageDialog(null, infoReceita, "Receita", JOptionPane.INFORMATION_MESSAGE);
		*/
		/*depois de outra alteração 002
		 // Concatenar todas as informações em uma única string
        StringBuilder info = new StringBuilder();
        info.append("#### PACIENTE 1 ####\n");
        info.append("Nome: ").append(paciente1.getNomeCompletoPaciente()).append("\n");
        info.append("Data de Nascimento: ").append(paciente1.getDataNascimento()).append("\n");
        info.append("Sexo: ").append(paciente1.getSexo()).append("\n");
        info.append("Endereço: Rua ").append(paciente1.getRua()).append(" ").append(paciente1.getComplemento()).append(" Casa ").append(paciente1.getNumeroCasa()).append("\n");
        info.append("Bairro: ").append(paciente1.getBairro()).append(" / Cidade: ").append(paciente1.getCidade()).append(" / Estado: ").append(paciente1.getEstado()).append("\n");
        info.append("Telefone: ").append(paciente1.getTelefonePaciente()).append("\n\n");

        info.append("#### PACIENTE 2 ####\n");
        info.append("Nome: ").append(paciente2.getNomeCompletoPaciente()).append("\n");
        info.append("Data de Nascimento: ").append(paciente2.getDataNascimento()).append("\n");
        info.append("Sexo: ").append(paciente2.getSexo()).append("\n");
        info.append("Endereço: Rua ").append(paciente2.getRua()).append(" ").append(paciente2.getComplemento()).append(" Casa ").append(paciente2.getNumeroCasa()).append("\n");
        info.append("Bairro: ").append(paciente2.getBairro()).append(" / Cidade: ").append(paciente2.getCidade()).append(" / Estado: ").append(paciente2.getEstado()).append("\n");
        info.append("Telefone: ").append(paciente2.getTelefonePaciente()).append("\n\n");

        info.append("#### MÉDICO ####\n");
        info.append("Nome: ").append(medico.getNomeCompletoMedico()).append("\n");
        info.append("Especialidade: ").append(medico.getEspecialidade()).append("\n");
        info.append("CRM Nº ").append(medico.getNumeroCrm()).append("/ ").append(medico.getEstado()).append("\n\n");

        info.append("#### CONSULTA ####\n");
        info.append("Data da Consulta: ").append(consulta.getDataConsulta()).append("\n\n");

        info.append("#### RECEITA ####\n");
        info.append("Descrição da Receita: ").append(receita.getDescricao()).append("\n");

        // Mostrar todas as informações em um único JOptionPane
        JOptionPane.showMessageDialog(null, info.toString(), "Informações", JOptionPane.INFORMATION_MESSAGE);
		*/
		
		 // Concatenar todas as informações em uma única string
        StringBuilder info = new StringBuilder();
        info.append("#### PACIENTE 1 ####\n");
        info.append("Nome: ").append(paciente1.getNomeCompletoPaciente()).append("\n");
        info.append("Data de Nascimento: ").append(paciente1.getDataNascimento()).append("\n");
        info.append("Sexo: ").append(paciente1.getSexo()).append("\n");
        info.append("Endereço: Rua ").append(paciente1.getRua()).append(" ").append(paciente1.getComplemento()).append(" Casa ").append(paciente1.getNumeroCasa()).append("\n");
        info.append("Bairro: ").append(paciente1.getBairro()).append(" / Cidade: ").append(paciente1.getCidade()).append(" / Estado: ").append(paciente1.getEstado()).append("\n");
        info.append("Telefone: ").append(paciente1.getTelefonePaciente()).append("\n\n");

        info.append("#### PACIENTE 2 ####\n");
        info.append("Nome: ").append(paciente2.getNomeCompletoPaciente()).append("\n");
        info.append("Data de Nascimento: ").append(paciente2.getDataNascimento()).append("\n");
        info.append("Sexo: ").append(paciente2.getSexo()).append("\n");
        info.append("Endereço: Rua ").append(paciente2.getRua()).append(" ").append(paciente2.getComplemento()).append(" Casa ").append(paciente2.getNumeroCasa()).append("\n");
        info.append("Bairro: ").append(paciente2.getBairro()).append(" / Cidade: ").append(paciente2.getCidade()).append(" / Estado: ").append(paciente2.getEstado()).append("\n");
        info.append("Telefone: ").append(paciente2.getTelefonePaciente()).append("\n\n");

        info.append("#### MÉDICO 1 ####\n");
        info.append("Nome: ").append(medico1.getNomeCompletoMedico()).append("\n");
        info.append("Especialidade: ").append(medico1.getEspecialidade()).append("\n");
        info.append("CRM Nº ").append(medico1.getNumeroCrm()).append("/ ").append(medico1.getEstado()).append("\n\n");
        
        info.append("#### MÉDICO 2 ####\n");
        info.append("Nome: ").append(medico2.getNomeCompletoMedico()).append("\n");
        info.append("Especialidade: ").append(medico2.getEspecialidade()).append("\n");
        info.append("CRM Nº ").append(medico2.getNumeroCrm()).append("/ ").append(medico2.getEstado()).append("\n\n");

        info.append("#### CONSULTA ####\n");
        info.append("Data da Consulta: ").append(consulta.getDataConsulta()).append("\n\n");

        info.append("#### RECEITA ####\n");
        info.append("Descrição da Receita: ").append(receita.getDescricao()).append("\n");

        // Criar um JTextArea para armazenar as informações
        JTextArea textArea = new JTextArea(info.toString());
        textArea.setEditable(false); // Para tornar o JTextArea somente leitura

        // Adicionar JTextArea a um JScrollPane para adicionar uma barra de rolagem
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Mostrar todas as informações em um único JOptionPane com uma barra de rolagem
        JOptionPane.showMessageDialog(null, scrollPane, "Informações", JOptionPane.INFORMATION_MESSAGE);

	}

}

