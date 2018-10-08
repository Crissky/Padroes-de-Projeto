package br.com.builder;

import java.math.BigDecimal;

import br.com.builder.dominio.Pedido;
import br.com.builder.dominio.builder.PedidoBuilder;

public class Application {
	public static void main(String[] args) {
		
		Pedido pedido = new PedidoBuilder()
							.setPedido("123")
							.setCliente(150, "Astrogildo", "988619261")
							.setVendedor(24, "Jonhson")
							.setProduto("Cardeno", 1, new BigDecimal(12.00))
							.setProduto("Lápis", 3, new BigDecimal(1.00))
							.setProduto("Borracha", 2, new BigDecimal(0.50))
							.builder();
		
		pedido.informacoes();
	}
}
