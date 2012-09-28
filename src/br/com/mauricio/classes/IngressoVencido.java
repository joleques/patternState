package br.com.mauricio.classes;

import br.com.mauricio.interfaces.Estado;

public class IngressoVencido implements Estado {

	public static final String TIPO = "VN";
	
	@Override
	public Boolean validar() {
		return false;
	}

}
