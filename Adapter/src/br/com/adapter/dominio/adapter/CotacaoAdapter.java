package br.com.adapter.dominio.adapter;

public class CotacaoAdapter extends Cotacao{

	@Override
	public double getValor() {
		return (super.getValor() * 3.0);
	}

	@Override
	public void setValor(double valor) {
		super.setValor(valor / 3.0);
	}
	
	public double getValorDolar() {
		return super.getValor();
	}
	
}
