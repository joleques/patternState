package br.com.mauricio.classes;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.mauricio.interfaces.Desconto;
import br.com.mauricio.interfaces.Estado;

public class IngressoTest {
	
	private Ingresso ingresso;

	@Test
	public void deveAutorizarIngressoValido() {
		Estado valido = new IngressoValido();
		ingresso = new Ingresso(valido);
		assertTrue(ingresso.validar());
	}
	

	@Test
	public void deveRecusarIngressoVencido(){
		Estado vencido = new IngressoVencido();
		ingresso = new Ingresso(vencido);
		assertFalse(ingresso.validar());
	}
	
	@Test
	public void deveRecusarIngressoFalsificado(){
		Estado falsificado = new IngressoFalsificado();
		ingresso = new Ingresso(falsificado);
		assertFalse(ingresso.validar());
	}
	

}
