package br.com.factorymethod.dominio.mensagem;

public class MensagemFactory {

	public static final int SMS = 1;
	public static final int EMAIL = 2;
	
	public static Mensagem getMensagem(int tipo) {
		if(tipo == SMS) {
			return new MensagemSMS();
		} else if(tipo == EMAIL) {
			return new MensagemEmail();
		} else {
			return new MensagemSMS();
		}
		
	}
	
}
