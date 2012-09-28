package br.com.mauricio.classes;

import br.com.mauricio.interfaces.Estado;

public class Ingresso {

	private Estado estado;

	public Ingresso(String situacaoIngresso) {
		this.estado = fabricaDeEstados(situacaoIngresso);
	}

	public boolean validar() {
		return estado.validar();
	}
	
	private Estado fabricaDeEstados(String situacaoIngresso){
		if(situacaoIngresso.equals(IngressoValido.TIPO)){
			return new IngressoValido();
		}
		if(situacaoIngresso.equals(IngressoVencido.TIPO)){
			return new IngressoVencido();
		}
		if(situacaoIngresso.equals(IngressoFalsificado.TIPO)){
			return new IngressoFalsificado();
		}
		return null;
	}
	
	

}
