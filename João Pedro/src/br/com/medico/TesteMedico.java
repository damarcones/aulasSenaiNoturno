package br.com.medico;

public class TesteMedico {

	public static void main(String[] args) {
		
		Medico md = new Medico ();
		
		md.setNomeCompleto("João Pedro Ribeiro Oliveira");
		md.setNumeroCrm("23123131");
		System.out.println("Nome do médico:" + md.getNomeCompleto());
		System.out.println("Número do Crm: " + md.getNumeroCrm());

	}

}
