package br.com.mauricio.classes;

import br.com.mauricio.interfaces.Desconto;

public class DescontoEstudante implements Desconto {

	@Override
	public double calcular(double valor) {
		return valor * 0.5 ;
	}
	
}
