package br.com.abstractfactory.dominio.boleto;

import br.com.abstractfactory.dominio.Produto;

public class BoletoBancoBrasil implements Boleto {

	@Override
	public void emitir(Produto produto, double imposto) {
		System.out.println("Banco do Brasil");
		System.out.println("********************************");
		System.out.println("Descrição: " + produto.getNome());
		System.out.println("Quantidade: " + produto.getQuantidade());
		System.out.println("Valor: R$ " + produto.getValor());
		System.out.println("Imposto: R$ " + imposto);
		System.out.println("Valor Total: R$ " + produto.getValorTotal(imposto));
	}

}
