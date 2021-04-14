package br.com.decorator.dominio.service;

import java.math.BigDecimal;

import br.com.decorator.dominio.model.Produto;

public class CalculaPrecoComFrete implements CalculoPreco {
	private CalculoPreco calculo;

	public CalculaPrecoComFrete(CalculoPreco calculo) {
		this.calculo = calculo;
	}

	@Override
	public BigDecimal valorFinal(Produto produto) {
		BigDecimal valorFinal = this.calculo.valorFinal(produto);
		BigDecimal frete;
		
		if(produto.getQuantidade() > 3) {
			frete = new BigDecimal("11.00");	
		} else {
			frete = new BigDecimal("17.00");
		}
		
		valorFinal = valorFinal.add(frete);
		
		return valorFinal;
	}

}
