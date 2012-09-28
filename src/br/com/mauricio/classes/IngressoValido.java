package br.com.mauricio.classes;

import br.com.mauricio.interfaces.Estado;

public class IngressoValido implements Estado {

	public static final String TIPO = "VL";
	
	@Override
	public Boolean validar() {
		return true;
	}

}
