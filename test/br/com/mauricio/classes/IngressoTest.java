package br.com.mauricio.classes;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.mauricio.interfaces.Desconto;
import br.com.mauricio.interfaces.Estado;

public class IngressoTest {
	
	private Ingresso ingresso;

	@Test
	public void deveAutorizarIngressoValido() {
		ingresso = new Ingresso(IngressoValido.TIPO);
		assertTrue(ingresso.validar());
	}
	

	@Test
	public void deveRecusarIngressoVencido(){
		ingresso = new Ingresso(IngressoVencido.TIPO);
		assertFalse(ingresso.validar());
	}
	
	@Test
	public void deveRecusarIngressoFalsificado(){
		ingresso = new Ingresso(IngressoFalsificado.TIPO);
		assertFalse(ingresso.validar());
	}
	

}
