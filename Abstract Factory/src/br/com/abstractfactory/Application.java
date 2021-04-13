package br.com.abstractfactory;

import br.com.abstractfactory.dominio.Produto;
import br.com.abstractfactory.dominio.loja.LojaCentroDaInformatica;
import br.com.abstractfactory.dominio.old.BoletoOLD;
import br.com.abstractfactory.dominio.old.NFEOLD;
import br.com.abstractfactory.dominio.old.VendaOLD;
import br.com.abstractfactory.dominio.venda.Venda;
import br.com.abstractfactory.dominio.venda.VendaFactory;

class Application {
	public static void main(String[] args) {
		System.out.println("VENDA COM CLASSES SEM PADRÃO.\n");
		Produto produto = new Produto();
		produto.setNome("Smartphone Moto X");
		produto.setQuantidade(1);
		produto.setValor(1000);
		
		NFEOLD notaFiscal = new NFEOLD("RJ");
		BoletoOLD boleto = new BoletoOLD("bmg");
		
		VendaOLD venda = new VendaOLD(produto, boleto, notaFiscal);
		venda.realizarVenda();
		
		
		// ###########################################
		
		System.out.println("\nVENDA USANDO O ABSTRACT FACTORY.\n");
		Produto produto2 = new Produto();
		produto2.setNome("Smartphone Moto X 2º Geração");
		produto2.setQuantidade(1);
		produto2.setValor(1000);
		
		VendaFactory factory = new LojaCentroDaInformatica();
		
		Venda venda2 = new Venda(factory);
		venda2.realizarVenda(produto2);
	}
}
