package br.com.decorator.dominio.service;

import java.math.BigDecimal;

import br.com.decorator.dominio.model.Produto;

public class CalculoPrecoComBrinde implements CalculoPreco {
	private CalculoPreco calculo;

	public CalculoPrecoComBrinde(CalculoPreco calculo) {
		this.calculo = calculo;
	}

	@Override
	public BigDecimal valorFinal(Produto produto) {
		BigDecimal valorFinal = this.calculo.valorFinal(produto);
		BigDecimal brinde = new BigDecimal("100.00");
		valorFinal = valorFinal.add(brinde);

		return valorFinal;
	}

}
