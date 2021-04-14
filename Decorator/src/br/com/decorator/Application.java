package br.com.decorator;

import java.math.BigDecimal;

import br.com.decorator.dominio.model.Produto;
import br.com.decorator.dominio.service.CalculaPrecoComFrete;
import br.com.decorator.dominio.service.CalculoPreco;
import br.com.decorator.dominio.service.CalculoPrecoComBrinde;
import br.com.decorator.dominio.service.CalculoPreçoComum;

public class Application {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.setNome("CD Legião Urbana");
		produto.setQuantidade(4);
		produto.setValor(40);

		System.out.println("Exemplo com CalculoPreçoComum()");

		CalculoPreco calculo = new CalculoPreçoComum();
		BigDecimal preco = calculo.valorFinal(produto);

		System.out.println("R$ " + preco.doubleValue());

		System.out.println("\nExemplos usando DECORATOR");
		System.out.println("\nExemplo com CalculaPrecoComFrete()");

		calculo = new CalculaPrecoComFrete(new CalculoPreçoComum());
		preco = calculo.valorFinal(produto);

		System.out.println("R$ " + preco.doubleValue());

		System.out.println("\nExemplo com CalculoPrecoComBrinde()");

		calculo = new CalculoPrecoComBrinde(new CalculoPreçoComum());
		preco = calculo.valorFinal(produto);

		System.out.println("R$ " + preco.doubleValue());

		System.out.println("\nExemplo com CalculoPrecoComBrinde() e CalculaPrecoComFrete()");

		calculo = new CalculoPrecoComBrinde(new CalculaPrecoComFrete(new CalculoPreçoComum()));
		preco = calculo.valorFinal(produto);

		System.out.println("R$ " + preco.doubleValue());

	}

}
