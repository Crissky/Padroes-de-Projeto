package br.com.singleton.dominio;

/* Para problemas de concorr�cia esse caso n�o � indicado,
pois mais de um "usu�rio" pode entrar no IF
(Fazer a compara��o l�gica do IF, mas antes de executar o bloco interno do IF d� a vez a outro processo que tamb�m estar acessando est� m�todo)
 e instanciar a classe. fazendo com que se perca a inst�ncia anterior.
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
