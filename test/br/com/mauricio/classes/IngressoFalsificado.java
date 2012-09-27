package br.com.mauricio.classes;

import br.com.mauricio.interfaces.Estado;

public class IngressoFalsificado implements Estado {

	@Override
	public Boolean validar() {
		return false;
	}

}
