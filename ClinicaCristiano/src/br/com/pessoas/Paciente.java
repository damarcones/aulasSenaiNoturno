package br.com.pessoas;

public class Paciente {

	private String nomeCompleto;
	private String dataNascimento;
	private String sexo;
	private String bairro;
	private String cidade;
	private String estado;
	private String telefonePaciente;
	private int cep;
	private int numero;
	Consulta dataConsulta;


	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void settelefonePaciente(String telefonePaciente) {
		this.telefonePaciente = telefonePaciente;
	}

	public String gettelefonePaciente() {
		return this.telefonePaciente;
	}
	
	public String getdataConsulta() {
		return this.dataConsulta.dataConsulta;
	}

}
