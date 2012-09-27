package br.com.mauricio.classes;

import br.com.mauricio.interfaces.Estado;

public class IngressoValido implements Estado {

	@Override
	public Boolean validar() {
		return true;
	}

}
