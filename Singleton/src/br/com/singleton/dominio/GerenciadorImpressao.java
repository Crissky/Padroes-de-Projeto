package br.com.singleton.dominio;

public class GerenciadorImpressao {
	private static GerenciadorImpressao gerenciadorImpressao;
	
	//Um construtor privado impede que a classe seja instanciada com um new GerenciadorImpressao().
	private GerenciadorImpressao() {}
	
	public static GerenciadorImpressao getInstance() {
		if (gerenciadorImpressao == null) {
			gerenciadorImpressao = new GerenciadorImpressao();
		}
		return gerenciadorImpressao;
		
	}
	
}
