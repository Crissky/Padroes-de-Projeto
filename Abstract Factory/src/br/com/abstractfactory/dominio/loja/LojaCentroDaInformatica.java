package br.com.abstractfactory.dominio.loja;

import br.com.abstractfactory.dominio.boleto.Boleto;
import br.com.abstractfactory.dominio.boleto.BoletoBancoBrasil;
import br.com.abstractfactory.dominio.nfe.NFE;
import br.com.abstractfactory.dominio.nfe.NFESaoPaulo;
import br.com.abstractfactory.dominio.venda.VendaFactory;

public class LojaCentroDaInformatica implements VendaFactory{

	@Override
	public NFE criarNFE() {
		NFE notaFiscal = new NFESaoPaulo();
		
		return notaFiscal;
	}

	@Override
	public Boleto criarBoleto() {
		Boleto boleto = new BoletoBancoBrasil();
		
		return boleto;
	}
}
