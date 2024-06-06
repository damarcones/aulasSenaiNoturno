package modelo;

public class Paciente {
	protected String nomeCompleto;
	protected String dataNascimento;
	protected String sexo;
	protected String rua;
	protected String numero;
	protected String bairro;
	protected String cidade;
	protected String estado;
	protected String complemento;
	protected String cep;
	protected String telefonePaciente[];
	
	public Paciente() {}
	
	public Paciente(String nomeCompleto,String dataNascimento ,String sexo , String rua,String numero, String bairro, String cidade, String estado, String complemento, String cep) {
		this.setNomeCompleto(nomeCompleto);
		this.setDataNascimento( dataNascimento);
		this.setSexo(sexo);
		this.setRua(rua);
		this.setNumero(numero);
		this.setBairro(bairro);
		this.setCidade(cidade);
		this.setEstado(estado);
		this.setComplemento(complemento);
		this.setCep(cep);
		System.out.println("Configurando dado do paciente, um instante.");
	}
	
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
	/**
	 * @return
	 */
	public String dadosDoPaciente() {
		String dados = "\nNome do Paciente: " + this.getNomeCompleto();
		dados += "\nData: " + this.getDataNascimento();
		dados += "\nGenero: " + this.getSexo();
		dados += "\nEndereço: "+ this.getRua() + ", " +this.getNumero() +", "+this.getBairro() +", "+this.getCidade() +", "+this.getEstado() +", "+this.getComplemento() +", "+this.getCep() +".";
		return dados;
	}
	

	
}
