package br.com.decorator;

import java.math.BigDecimal;

import br.com.decorator.dominio.model.Produto;
import br.com.decorator.dominio.service.CalculaPrecoComFrete;
import br.com.decorator.dominio.service.CalculoPreco;
import br.com.decorator.dominio.service.CalculoPre�oComum;

public class Application {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.setNome("CD Legi�o Urbana");
		produto.setQuantidade(4);
		produto.setValor(40);
		
		CalculoPreco calculo = new CalculoPre�oComum();
		
		BigDecimal preco = calculo.valorFinal(produto);
		
		System.out.println("Exemplo com CalculoPre�oComum()");
		System.out.println("R$ " + preco.doubleValue());
		
		calculo = new CalculaPrecoComFrete(new CalculoPre�oComum());
		preco = calculo.valorFinal(produto);
		
		System.out.println("\nExemplo com CalculoPre�oComFrete()");
		System.out.println("R$ " + preco.doubleValue());


	}

}
