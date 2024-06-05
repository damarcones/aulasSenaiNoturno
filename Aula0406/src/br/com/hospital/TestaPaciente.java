package br.com.hospital;

public class TestaPaciente {

	public static void main(String[] args) {
		Paciente p1 = new Paciente();
		p1.setNomeCompleto("João da Silva");
		p1.setDataNascimento("28/10/1991");
		p1.setGenero('M');
		p1.setRua("Rua Augusta.");
		p1.setNumero(26);
		p1.setCidade("Vianópolis");
		p1.setEstado("GO");
		p1.setComplemento("");
		p1.setCep("72900-400");
		

	}

}
