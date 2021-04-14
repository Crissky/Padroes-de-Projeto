package br.com.adapter;

import br.com.adapter.dominio.adapter.CotacaoAdapter;

public class Application {

	public static void main(String[] args) {
		CotacaoAdapter cotacao = new CotacaoAdapter();
		cotacao.setValor(1.00);
		
		System.out.println("R$: " + cotacao.getValor());
		System.out.println("U$: " + cotacao.getValorDolar());
		
	}

}
