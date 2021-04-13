package br.com.abstractfactory.dominio.nfe;

import java.math.BigDecimal;

import br.com.abstractfactory.dominio.Produto;

public class NFESaoPaulo implements NFE {

	@Override
	public double calcularImposto(Produto produto) {
		BigDecimal imposto = new BigDecimal("0.18");
		imposto = imposto.multiply(produto.getValor());
		
		return imposto.doubleValue();
	}

}
