package br.com.factorymethod.dominio.mensagem;

/* Compara��o entre as duas implementa��es do m�todo Factory
 * Inicializa��o mais r�pida
 * Tempo do m�todo get O(n) (Caso a op��o retornada seja a �ltima) */
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
