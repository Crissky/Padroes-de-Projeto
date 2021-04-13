package br.com.abstractfactory.dominio.venda;

import br.com.abstractfactory.dominio.Produto;
import br.com.abstractfactory.dominio.boleto.Boleto;
import br.com.abstractfactory.dominio.nfe.NFE;

public class Venda {
	private NFE notaFiscal;
	private Boleto boleto;
	
	public Venda(VendaFactory factory) {
		this.notaFiscal = factory.criarNFE();
		this.boleto = factory.criarBoleto();
	}
	
	public void realizarVenda(Produto produto) {
		double imposto = this.notaFiscal.calcularImposto(produto);
		boleto.emitir(produto, imposto);
	}
}
