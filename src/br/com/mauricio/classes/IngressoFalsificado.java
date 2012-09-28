package br.com.mauricio.classes;

import br.com.mauricio.interfaces.Estado;

public class IngressoFalsificado implements Estado {
	
	public static final String TIPO = "FL";

	@Override
	public Boolean validar() {
		return false;
	}

}
