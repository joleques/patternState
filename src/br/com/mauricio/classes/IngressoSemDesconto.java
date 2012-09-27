package br.com.mauricio.classes;

import br.com.mauricio.interfaces.Desconto;

public class IngressoSemDesconto implements Desconto {

	@Override
	public double calcular(double valor) {
		return valor;
	}

}
