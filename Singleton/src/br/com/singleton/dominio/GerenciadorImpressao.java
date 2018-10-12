package br.com.singleton.dominio;

/* Para problemas de concorrêcia esse caso não é indicado,
pois mais de um "usuário" pode entrar no IF
(Fazer a comparação lógica do IF, mas antes de executar o bloco interno do IF dá a vez a outro processo que também estar acessando está método)
 e instanciar a classe. fazendo com que se perca a instância anterior.
 ver a classe GerenciadorImpressao2 */ 
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
