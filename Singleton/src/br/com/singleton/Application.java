package br.com.singleton;

import br.com.singleton.dominio.GerenciadorImpressao;

public class Application {

	public static void main(String[] args) {
		
		GerenciadorImpressao gerenciadorImpressao1 = GerenciadorImpressao.getInstance();  
		GerenciadorImpressao gerenciadorImpressao2 = GerenciadorImpressao.getInstance();  
		GerenciadorImpressao gerenciadorImpressao3 = GerenciadorImpressao.getInstance();  
		GerenciadorImpressao gerenciadorImpressao4 = GerenciadorImpressao.getInstance();
		
		System.out.println(gerenciadorImpressao1);
		System.out.println(gerenciadorImpressao2);
		System.out.println(gerenciadorImpressao3);
		System.out.println(gerenciadorImpressao4);

	}

}
