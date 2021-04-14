package br.com.decorator.dominio.model;

import java.math.BigDecimal;

public class Produto {

	private String nome;
	private int quantidade;
	private BigDecimal valor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public void setValor(int valor) {
		this.setValor(new BigDecimal(valor));
	}

	public void setValor(float valor) {
		this.setValor(new BigDecimal(valor));
	}

	public void setValor(double valor) {
		this.setValor(new BigDecimal(valor));
	}

	public BigDecimal getValorTotal(double imposto) {
		BigDecimal valorTotal = this.valor.add(this.valor.multiply(new BigDecimal(imposto)));
		valorTotal = valorTotal.multiply(new BigDecimal(this.quantidade));

		return valorTotal;
	}

	public BigDecimal getValorTotal(BigDecimal imposto) {
		return this.getValorTotal(imposto.doubleValue());
	}

}
