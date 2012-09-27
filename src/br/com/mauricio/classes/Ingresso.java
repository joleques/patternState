package br.com.mauricio.classes;

import br.com.mauricio.interfaces.Desconto;
import br.com.mauricio.interfaces.Estado;

public class Ingresso {

	private Estado estado;

	public Ingresso(Estado vencido) {
		this.estado = vencido;
	}

	public boolean validar() {
		return estado.validar();
	}
	
	

}
