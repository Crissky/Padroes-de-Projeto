package br.com.builder.dominio.builder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.builder.dominio.Cliente;
import br.com.builder.dominio.Pedido;
import br.com.builder.dominio.Produto;
import br.com.builder.dominio.Vendedor;

public class PedidoBuilder {

	private Pedido instancia;

	public PedidoBuilder() {
		this.instancia = new Pedido();
	}
	
	public PedidoBuilder setPedido(String numeroPedido) {
		instancia.setNumeroPedido(numeroPedido);
		
		return this;
	}
	
	public PedidoBuilder setCliente(int codigo, String nome, String telefone) {
		Cliente cliente = new Cliente();
		cliente.setCodigo(codigo);
		cliente.setNome(nome);
		cliente.setTelefone(telefone);
		
		return this.setCliente(cliente);
	}
	
	public PedidoBuilder setCliente(Cliente cliente) {
		instancia.setCliente(cliente);
		
		return this;
	}
	
	public PedidoBuilder setVendedor(int codigo, String nome) {
		Vendedor vendedor = new Vendedor();
		vendedor.setCodigo(codigo);
		vendedor.setNome(nome);
		
		return this.setVendedor(vendedor);
	}
	
	public PedidoBuilder setVendedor(Vendedor vendedor) {
		instancia.setVendedor(vendedor);
		
		return this;
	}
	
	public PedidoBuilder setProduto(String nome, int quantidade, BigDecimal valor) {
		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setQuantidade(quantidade);
		produto.setValor(valor);
		
		List<Produto> listaProdutos = new ArrayList<>( Arrays.asList( produto ) );
		
		return this.setProduto( listaProdutos );
	}
	
	public PedidoBuilder setProduto(Produto... produtos) {
		List<Produto> listaProdutos = new ArrayList<>( Arrays.asList( produtos ) );
		
		return this.setProduto( listaProdutos );
	}
	
	public PedidoBuilder setProduto(List<Produto> listaProdutos) {
		iniciarListaProdutos();
		
		instancia.getProdutos().addAll(listaProdutos);
		
		return this;
	}
	
	private void iniciarListaProdutos() {
		if(instancia.getProdutos() == null) {
			instancia.setProdutos(new ArrayList<>());
		}
	}
	
	public Pedido builder() {
		return instancia;
	}
}
