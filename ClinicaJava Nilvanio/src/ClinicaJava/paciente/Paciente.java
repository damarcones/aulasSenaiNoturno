package ClinicaJava.paciente;

public class Paciente {
	private String nomeCompleto;
    private String dataNascimento;
    private char sexo;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String complemento;
    private String cep;
    private String telefonePaciente;
    private String[] medicamentosPrescritos;
    
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
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
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
	public String getTelefonePaciente() {
		return telefonePaciente;
	}
	public void setTelefonePaciente(String telefonePaciente) {
		this.telefonePaciente = telefonePaciente;
	}
	public String[] getMedicamentosPrescritos() {
		return medicamentosPrescritos;
	}
	public void setMedicamentosPrescritos(String[] medicamentosPrescritos) {
		this.medicamentosPrescritos = medicamentosPrescritos;
	}
	
	public Paciente(String nomeCompleto, String dataNascimento, char sexo, String rua, String numero, String bairro,
            String cidade, String estado, String complemento, String cep, String telefonePaciente) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.complemento = complemento;
        this.cep = cep;
        this.telefonePaciente = telefonePaciente;
    }

	public String toString() {
        return "Nome: " + nomeCompleto + "\n" +
               "Data de Nascimento: " + dataNascimento + "\n" +
               "Sexo: " + sexo + "\n" +
               "Endereço: " + rua + ", " + numero + ", " + bairro + ", " + cidade + ", " + estado + "\n" +
               "Complemento: " + complemento + "\n" +
               "CEP: " + cep + "\n" +
               "Telefone: " + telefonePaciente;
    }
}
