package br.com.pessoa;
//import java.time.LocalDate;

public class Paciente {
	private String nomeCompletoPaciente, dataNascimento, sexo, rua, bairro, cidade, estado, complemento, cep;
	private int numeroCasa, telefonePaciente;
	
	//GET - SET - NOME COMPLETO//
	public String getNomeCompletoPaciente() {
		return nomeCompletoPaciente;
	}
	public void setNomeCompleto(String nomeCompletoPaciente) {
		this.nomeCompletoPaciente = nomeCompletoPaciente;
	}
	//GET - SET DATA NASCIMENTO//
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	//GET - SEXO/
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	//GET - SET RUA//
	public String getRua() {
		return rua;
	}
	public void setRua (String rua) {
		this.rua = rua;
	}
	//GET - SET BAIRRO//
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	//GET - SET CIDADE//
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	//GET - SET ESTADO//
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	//GET - SET COMPLEMENTO//
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	//GET - SET CEP//
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	//GET - SET NUMERO DA CASA//
	public int getNumeroCasa() {
		return numeroCasa;
	}
	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	//GET - SET TELEFONE DO PACIENTE//
	public int getTelefonePaciente() {
		return telefonePaciente;
	}
	public void setTelefonePaciente(int telefonePaciente) {
		this.telefonePaciente = telefonePaciente;
	}
	

}
