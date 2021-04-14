package br.com.decorator.dominio.service;

import java.math.BigDecimal;

import br.com.decorator.dominio.model.Produto;

public class CalculoPreçoComum implements CalculoPreco {

	@Override
	public BigDecimal valorFinal(Produto produto) {
		BigDecimal imposto = new BigDecimal("0.10");
		BigDecimal valorFinal = produto.getValorTotal(imposto);
		
		return valorFinal;
	}

}
