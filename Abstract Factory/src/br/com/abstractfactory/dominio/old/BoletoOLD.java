package br.com.abstractfactory.dominio.old;

import br.com.abstractfactory.dominio.Produto;

public class BoletoOLD {
	private String banco;
	
	public BoletoOLD(String banco) {
		this.banco = banco;
	}
	
	public void emitir(Produto produto, double imposto) {
		if(this.banco.equalsIgnoreCase("Brasil")) {
			this.brasil(produto, imposto);
		} else if(this.banco.equalsIgnoreCase("Bradesco")) {
			this.bradesco(produto, imposto);
		} else if(this.banco.equalsIgnoreCase("bmg")) {
			this.bmg(produto, imposto);
		} else {
			this.caixa(produto, imposto);
		}
	}
	
	private void brasil(Produto produto, double imposto) {
		System.out.println("Banco do Brasil");
		System.out.println("********************************");
		System.out.println("Descrição: " + produto.getNome());
		System.out.println("Quantidade: " + produto.getQuantidade());
		System.out.println("Valor: R$ " + produto.getValor());
		System.out.println("Valor Total: R$ " + produto.getValorTotal(imposto));
	}
	
	private void bradesco(Produto produto, double imposto) {
		System.out.println("BRADESCO");
		System.out.println("********************************");
		System.out.println("Descrição: " + produto.getNome());
		System.out.println("Quantidade: " + produto.getQuantidade());
		System.out.println("Valor: R$ " + produto.getValor());
		System.out.println("Valor Total: R$ " + produto.getValorTotal(imposto));
	}
	
	private void bmg(Produto produto, double imposto) {
		System.out.println("Banco BMG");
		System.out.println("********************************");
		System.out.println("Descrição: " + produto.getNome());
		System.out.println("Quantidade: " + produto.getQuantidade());
		System.out.println("Valor: R$ " + produto.getValor());
		System.out.println("Valor Total: R$ " + produto.getValorTotal(imposto));
	}
	
	private void caixa(Produto produto, double imposto) {
		System.out.println("CAIXA ECONÔMICA FEDERAL");
		System.out.println("********************************");
		System.out.println("Descrição: " + produto.getNome());
		System.out.println("Quantidade: " + produto.getQuantidade());
		System.out.println("Valor: R$ " + produto.getValor());
		System.out.println("Valor Total: R$ " + produto.getValorTotal(imposto));
	}
}
