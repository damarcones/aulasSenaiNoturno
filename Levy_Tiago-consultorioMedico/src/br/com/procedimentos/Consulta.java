package br.com.procedimentos;

import java.util.Date;
import br.com.especialidades.*;

public class Consulta {
	
	private Date dataConsulta;

	public Date getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	
	// métodos negociais 
	
	public void marcarConsulta(Date dataConsulta) {
			this.setDataConsulta(dataConsulta);
		}
	
	public void realizarConsulta(String diagnostico, String nomePaciente, String medicamentoPrescrito) {
		// inserir atestado??
	}


	public void prescreverMedicamento() {
			
		}
	

}
