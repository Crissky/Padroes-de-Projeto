package br.com.singleton;

import br.com.singleton.dominio.GerenciadorImpressao;
import br.com.singleton.dominio.GerenciadorImpressao2;

/* Impressão do mesmo endereço de memória, pois é o mesmo objeto referenciado por variáveis diferentes */
public class Application {

	public static void main(String[] args) {
		System.out.println("Exemplo 1: \n");
		
		GerenciadorImpressao gerenciadorImpressao1 = GerenciadorImpressao.getInstance();  
		GerenciadorImpressao gerenciadorImpressao2 = GerenciadorImpressao.getInstance();  
		GerenciadorImpressao gerenciadorImpressao3 = GerenciadorImpressao.getInstance();  
		GerenciadorImpressao gerenciadorImpressao4 = GerenciadorImpressao.getInstance();
		
		System.out.println(gerenciadorImpressao1);
		System.out.println(gerenciadorImpressao2);
		System.out.println(gerenciadorImpressao3);
		System.out.println(gerenciadorImpressao4);
		
		System.out.println("\n====================================\n");
		System.out.println("Exemplo 2: \n");
		
		GerenciadorImpressao2 gerenciadorImpressao5 = GerenciadorImpressao2.gerenciadorImpressao;  
		GerenciadorImpressao2 gerenciadorImpressao6 = GerenciadorImpressao2.gerenciadorImpressao;  
		GerenciadorImpressao2 gerenciadorImpressao7 = GerenciadorImpressao2.gerenciadorImpressao;  
		GerenciadorImpressao2 gerenciadorImpressao8 = GerenciadorImpressao2.gerenciadorImpressao;
		
		System.out.println(gerenciadorImpressao5);
		System.out.println(gerenciadorImpressao6);
		System.out.println(gerenciadorImpressao7);
		System.out.println(gerenciadorImpressao8);
		
	}

}
