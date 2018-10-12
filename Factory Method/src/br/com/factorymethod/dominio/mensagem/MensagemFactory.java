package br.com.factorymethod.dominio.mensagem;

/* Comparação entre as duas implementações do método Factory
 * Inicialização mais rápida
 * Tempo do método get O(n) (Caso a opção retornada seja a última) */
public class MensagemFactory {

	public static Mensagem getMensagem(MensagemFactoryChoice tipo) {
		if(tipo == MensagemFactoryChoice.SMS) {
			return new MensagemSMS();
		} else if(tipo == MensagemFactoryChoice.EMAIL) {
			return new MensagemEmail();
		} else {
			return new MensagemSMS();
		}
		
	}
	
}
