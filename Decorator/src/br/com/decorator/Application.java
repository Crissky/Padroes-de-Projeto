package br.com.decorator;

import java.math.BigDecimal;

import br.com.decorator.dominio.model.Produto;
import br.com.decorator.dominio.service.CalculaPrecoComFrete;
import br.com.decorator.dominio.service.CalculoPreco;
import br.com.decorator.dominio.service.CalculoPreçoComum;

public class Application {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.setNome("CD Legião Urbana");
		produto.setQuantidade(4);
		produto.setValor(40);
		
		CalculoPreco calculo = new CalculoPreçoComum();
		
		BigDecimal preco = calculo.valorFinal(produto);
		
		System.out.println("Exemplo com CalculoPreçoComum()");
		System.out.println("R$ " + preco.doubleValue());
		
		calculo = new CalculaPrecoComFrete(new CalculoPreçoComum());
		preco = calculo.valorFinal(produto);
		
		System.out.println("\nExemplo com CalculoPreçoComFrete()");
		System.out.println("R$ " + preco.doubleValue());


	}

}
