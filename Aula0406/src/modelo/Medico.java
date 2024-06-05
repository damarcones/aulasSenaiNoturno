package modelo;


public class Medico {
	protected String nomeCompleto;
	protected int numeroCrm;
	protected String estado;
	protected String especialidade[];
	protected int n,i;
	
	Medico() {}
	
	public Medico(String nomeCompleto, int numeroCrm, String estado) {
		this.setNomeCompleto(nomeCompleto);
		this.setNumeroCrm(numeroCrm);
		this.setEstado(estado);
		System.out.println("Configurando dado do medico, um instante.");
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public int getNumeroCrm() {
		return numeroCrm;
	}
	public void setNumeroCrm(int numeroCrm) {
		this.numeroCrm = numeroCrm;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public void setEspecialidade(String especialidade1, String especialidade2) {
		this.especialidade[0] = especialidade1;
		this.especialidade[1] = especialidade2;
	}
	
}
