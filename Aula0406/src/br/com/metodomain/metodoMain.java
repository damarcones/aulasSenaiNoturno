package br.com.metodomain;

import javax.swing.*;

import br.com.pessoas.Medico;
import br.com.pessoas.Paciente;
import br.com.medicamentos.*;
import br.com.pessoas.Consulta;
import br.com.medicamentos.Receita;

public class metodoMain {

    public static void main(String[] args) {

        Paciente p = new Paciente();
        Medico m1 = new Medico();
        Medico m2 = new Medico();
        Medico m3 = new Medico();
        Medico medicoSelecionado = null; // Adiciona esta linha
        medicamentosPrescritos medic = new medicamentosPrescritos();
        Consulta consulta = new Consulta();

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Adiciona cada campo de entrada à caixa de diálogo
        panel.add(new JLabel("Nome completo:"));
        JTextField nomeCompletoField = new JTextField(20);
        panel.add(nomeCompletoField);

        panel.add(new JLabel("Telefone:"));
        JTextField telefoneField = new JTextField(20);
        panel.add(telefoneField);

        panel.add(new JLabel("Data de nascimento (DD/MM/AAAA):"));
        JTextField dataNascimentoField = new JTextField(20);
        panel.add(dataNascimentoField);

        panel.add(new JLabel("Sexo:"));
        JTextField sexoField = new JTextField(20);
        panel.add(sexoField);

        panel.add(new JLabel("Bairro:"));
        JTextField bairroField = new JTextField(20);
        panel.add(bairroField);

        panel.add(new JLabel("Cidade:"));
        JTextField cidadeField = new JTextField(20);
        panel.add(cidadeField);

        panel.add(new JLabel("Estado:"));
        JTextField estadoField = new JTextField(20);
        panel.add(estadoField);

        panel.add(new JLabel("CEP:"));
        JTextField cepField = new JTextField(20);
        panel.add(cepField);

        // Exibe a caixa de diálogo
        int result = JOptionPane.showConfirmDialog(null, panel, "Cadastro de Paciente",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        // Processa os valores inseridos pelo usuário
        if (result == JOptionPane.OK_OPTION) {
            p.setNomeCompleto(nomeCompletoField.getText());
            p.settelefonePaciente(telefoneField.getText());
            p.setDataNascimento(dataNascimentoField.getText());
            p.setSexo(sexoField.getText());
            p.setBairro(bairroField.getText());
            p.setCidade(cidadeField.getText());
            p.setEstado(estadoField.getText());
            p.setCep(Integer.parseInt(cepField.getText()));

            JOptionPane.showMessageDialog(null, "Cadastro finalizado com sucesso!");
        }

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
                String[] especialidades = {"Cardiologista", "Pediatra", "Ortopedista", "Dentista"};
                String[] datas = {"10/06/2024 às 10:00", "15/06/2024 às 14:00", "20/06/2024 às 16:00"};

                // Solicita a especialidade
                String especialidadeEscolhida = (String) JOptionPane.showInputDialog(null, "Escolha a especialidade que você deseja:", 
                        "Especialidades", JOptionPane.QUESTION_MESSAGE, null, especialidades, especialidades[0]);

                if (especialidadeEscolhida == null) {
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
                }

                if (especialidadeEscolhida.equals("Cardiologista")) {
                    medicoSelecionado = m1;
                } else if (especialidadeEscolhida.equals("Pediatra")) {
                    medicoSelecionado = m2;
                } else if (especialidadeEscolhida.equals("Ortopedista")) {
                    medicoSelecionado = m3;
                } else {
                    JOptionPane.showMessageDialog(null, "Não há médicos disponíveis para esta especialidade!");
                    break;
                }

                // Solicita a data e hora
                String dataHoraEscolhida = (String) JOptionPane.showInputDialog(null, "Escolha a data e hora da consulta:", 
                        "Datas e Horas Disponíveis", JOptionPane.QUESTION_MESSAGE, null, datas, datas[0]);

                if (dataHoraEscolhida == null) {
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
                }

                // Extrai a data e a hora da string selecionada
                String[] partes = dataHoraEscolhida.split(" às ");
                String data = partes[0];
                String hora = partes[1];

                consulta.setDataConsulta(data);
                consulta.setHoraConsulta(hora);

                JOptionPane.showMessageDialog(null, "Consulta marcada com sucesso!\nA seguir dados do médico selecionado.\n\n"
                        + "Nome do médico: " + medicoSelecionado.getNomeCompleto()
                        + "\nNúmero Crm: " + medicoSelecionado.getNumeroCrm()
                        + "\nEspecialidade: " + medicoSelecionado.getEspecialidadeNome()
                        + "\nData da Consulta: " + consulta.getDataConsulta()
                        + "\nHora da Consulta: " + consulta.getHoraConsulta());
                break;
            case 3:
                String[] sintomas = {"Dor de Cabeça", "Dor Muscular", "Problemas de Memórias", "Diabetes"};

                // Solicita o sintoma
                String sintomaEscolhido = (String) JOptionPane.showInputDialog(null, "Selecione um dos sintomas da lista abaixo:", 
                        "Sintomas", JOptionPane.QUESTION_MESSAGE, null, sintomas, sintomas[0]);

                if (sintomaEscolhido == null) {
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
                }

                String remedio = "";
                if (sintomaEscolhido.equals("Dor de Cabeça")) {
                    remedio = medic.dorDeCabeça();
                } else if (sintomaEscolhido.equals("Dor Muscular")) {
                    remedio = medic.dorMuscular();
                } else if (sintomaEscolhido.equals("Problemas de Memórias")) {
                    remedio = medic.problemadeMemoria();
                } else if (sintomaEscolhido.equals("Diabetes")) {
                    remedio = medic.diabetes();
                }

                JOptionPane.showMessageDialog(null, "Para " + sintomaEscolhido.toLowerCase() + " o remédio indicado é: \n" + remedio);
                consulta.setSintoma(sintomaEscolhido);
                consulta.setRemedio(remedio); // This will store the prescribed medicine
                break;
            case 4:
                // Verifica se um médico foi selecionado
                if (medicoSelecionado == null) {
                    JOptionPane.showMessageDialog(null, "Nenhuma consulta foi marcada ainda.");
                    break;
                }

                // Supondo que a consulta, o médico e a prescrição já foram definidos anteriormente
                Receita receita = new Receita();
                receita.setDadosReceita(medicoSelecionado, consulta, consulta.getSintoma(), consulta.getRemedio());

                // Imprimir a receita
                JOptionPane.showMessageDialog(null, receita.imprimirReceita());
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Programa fechado.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");
                break;
            }
        } while (opcoes != 5);
    }
}
