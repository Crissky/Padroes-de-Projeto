package br.com.builder.dominio;

import java.awt.Font;
import java.math.BigDecimal;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Pedido {

	private String numeroPedido;
	private List<Produto> produtos;
	private Cliente cliente;
	private Vendedor vendedor;
	
	public BigDecimal getValorTotal() {
		BigDecimal valor;
		BigDecimal quantidade;
		BigDecimal total = BigDecimal.ZERO;
		
		for (Produto produto : produtos) {
			valor = produto.getValor();
			quantidade = new BigDecimal(produto.getQuantidade());  
			total = total.add(valor.multiply(quantidade));
		}
		
		return total;
		
	}
	
	public int getTotalProdutos() {
		int total = 0;
		
		for (Produto produto : produtos) {
			total += produto.getQuantidade();
		}
		return total;
	}

	public String getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public void informacoes() {
		String titulo = "Pedido #" + this.getNumeroPedido();
		String infoCliente = "Cliente: " + this.getCliente().getNome() + "\n \n";
		String infoVendedor = "Vendedor: " + this.getVendedor().getNome() + "\n \n";
		String infoProdutos = "Produto(s): " + this.getTotalProdutos() + "\n \n";
		String infoTotal = "Valor Total: R$" + this.getValorTotal() + "\n \n";
		
		String mensagem = infoCliente + infoVendedor + infoProdutos + infoTotal;
				
		UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 18));
		
		JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.INFORMATION_MESSAGE);
		
	}
	
}
