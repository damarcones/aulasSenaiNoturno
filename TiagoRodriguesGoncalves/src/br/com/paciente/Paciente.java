package br.com.paciente;

import java.util.Date;

public class Paciente {
	
		// Atributos
		private String nomeCompleto;
		private Date dataNascimento;
		private char sexo;
		private String rua;
		private int numero;
		private String bairro;
		private String cidade;
		private char estado;
		private String complemento;
		private int cep; 
		
		// Métodos construtores
		public String getNomeCompleto() {
			return this.nomeCompleto;
		}
		public void setNomeCompleto(String nomeCompleto) {
			this.nomeCompleto = nomeCompleto;
		}
		
		public Date getDataNascimento() {
			return dataNascimento;
		}
		public void setDataNascimento(Date dataNascimento) {
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
		
		public char getEstado() {
			return estado;
		}
		public void setEstado(char estado) {
			this.estado = estado;
		}
		
		public String getComplemento() {
			return complemento;
		}
		public void setComplemento(String complemento) {
			this.complemento = complemento;
		}
		
		public int getCep() {
			return cep;
		}
		public void setCep(int cep) {
			this.cep = cep;
		}
		
		// métodos negociais
		
		
		
		public void realizarCadastro(String nomeCompleto, Date dataNascimento, char sexo, String rua, int numero, String bairro, String cidade, char estado, String complemento, int cep) {
			this.setNomeCompleto(nomeCompleto);
			this.setDataNascimento(dataNascimento);
			this.setSexo(sexo);
			this.setRua(rua);
			this.setNumero(numero);
			this.setBairro(bairro);
			this.setCidade(cidade);
			this.setEstado(estado);
			this.setComplemento(complemento);
			this.setCep(cep);
		}
		 
		public void marcarConsulta() {
			
		}
}
