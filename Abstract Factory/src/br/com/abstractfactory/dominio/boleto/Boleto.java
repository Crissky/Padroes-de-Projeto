package br.com.abstractfactory.dominio.boleto;

import br.com.abstractfactory.dominio.Produto;

public interface Boleto {
	public void emitir(Produto produto, double imposto);
}
