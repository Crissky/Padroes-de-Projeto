package br.com.abstractfactory.dominio.old;

import br.com.abstractfactory.dominio.Produto;

public class VendaOLD {
	private Produto produto;
	private BoletoOLD boleto;
	private NFEOLD nfe;
	
	public VendaOLD(Produto produto, BoletoOLD boleto, NFEOLD nfe) {
		this.produto = produto;
		this.boleto = boleto;
		this.nfe = nfe;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public BoletoOLD getBoleto() {
		return boleto;
	}
	public void setBoleto(BoletoOLD boleto) {
		this.boleto = boleto;
	}
	public NFEOLD getNfe() {
		return nfe;
	}
	public void setNfe(NFEOLD nfe) {
		this.nfe = nfe;
	}
	public void realizarVenda() {
		double imposto = this.nfe.calcularImposto();
		this.boleto.emitir(produto, imposto);
	}
}
