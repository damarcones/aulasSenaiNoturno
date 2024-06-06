package br.com.pessoas;

public class Principal {

	public static void main(String[] args) {
		Paciente p1 = new Paciente();
		
		p1.setNomeCompleto("Marcos");
		p1.setDataNascimento("21/05/1980");
		p1.setSexo("M");
		p1.setRua("Qnb");
		p1.setNumero(1);
		p1.setBairro("Norte");
		p1.setCidade("Taguatinga");
		p1.setEstado("DF");
		p1.setComplemento("Casa 2");
		p1.setCep("72.001-02");
		p1.setTelefone("61 981020405");
		
		Medico m1 = new Medico();
		
		m1.setNomeCompleto("Ana");
		m1.setDataNascimento("22/06/1975");
		m1.setSexo("F");
		m1.setRua("Qng");
		m1.setNumero(2);
		m1.setBairro("Norte");
		m1.setCidade("Taguatinga");
		m1.setEstado("DF");
		m1.setComplemento("Casa 6");
		m1.setCep("72.005-06");
		m1.setTelefone("61 985060708");
		m1.setNumeroCrm("123456");
		
		
		
		
	}
}
