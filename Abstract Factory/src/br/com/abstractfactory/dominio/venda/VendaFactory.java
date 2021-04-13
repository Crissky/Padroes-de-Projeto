package br.com.abstractfactory.dominio.venda;

import br.com.abstractfactory.dominio.boleto.Boleto;
import br.com.abstractfactory.dominio.nfe.NFE;

public interface VendaFactory {
	
	public NFE criarNFE();
	public Boleto criarBoleto();

}
