package br.com.decorator.dominio.service;

import java.math.BigDecimal;

import br.com.decorator.dominio.model.Produto;

public interface CalculoPreco {
	public BigDecimal valorFinal(Produto produto);
}
