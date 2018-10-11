package br.com.builder;

import java.math.BigDecimal;
import br.com.builder.dominio.Cliente;
import br.com.builder.dominio.Pedido;
import br.com.builder.dominio.Produto;
import br.com.builder.dominio.Vendedor;
import br.com.builder.dominio.builder.PedidoBuilder;

public class Application {
	public static void main(String[] args) {
		//Construindo pedido passando atributos das classe internas.
		Pedido pedido1 = new PedidoBuilder()
							.setPedido("123")
							.setCliente(150, "Astrogildo", "988619261")
							.setVendedor(24, "Jonhson")
							.setProduto("Cardeno", 1, new BigDecimal(12.00))
							.setProduto("Lápis", 3, new BigDecimal(1.00))
							.setProduto("Borracha", 2, new BigDecimal(0.50))
							.builder();
		
		pedido1.informacoes();

		
		Cliente cliente = new Cliente();
		cliente.setCodigo(151);
		cliente.setNome("Astrogildo Silva");
		cliente.setTelefone("988619269");
		
		Vendedor vendedor = new Vendedor();
		vendedor.setCodigo(25);
		vendedor.setNome("Jonhson Mendes");
		
		Produto produto1 = new Produto();
		produto1.setNome("Bolsa");
		produto1.setQuantidade(1);
		produto1.setValor(45);
		
		//Construindo pedido passando Objetos
		Pedido pedido2 = new PedidoBuilder()
							.setPedido("132")
							.setCliente(cliente)
							.setVendedor(vendedor)
							.setProduto(produto1,produto1,produto1) // Também pode receber um Array ou um List de Produtos. 
							.builder();
		
		pedido2.informacoes();		
	}
}
