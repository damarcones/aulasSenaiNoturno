package br.com.hospital;

public class Paciente extends Pessoa {
	String dataNascimento;
	char genero;
	String rua;
	int numero;
	String bairro;
	String cidade;
	String complemento;
	String cep;
	String telefonePaciente[];
		
	public Paciente(String nomeCompleto,String dataNascimento ,char genero , String rua, int numero, String bairro, String cidade, String estado, String complemento, String cep) {
		this.setNomeCompleto(nomeCompleto);
		this.setDataNascimento( dataNascimento);
		this.setGenero(getGenero());;
		this.setRua(rua);
		this.setNumero(getNumero());
		this.setBairro(bairro);
		this.setCidade(cidade);
		this.setEstado(estado);
		this.setComplemento(complemento);
		this.setCep(cep);
	}	
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
}
