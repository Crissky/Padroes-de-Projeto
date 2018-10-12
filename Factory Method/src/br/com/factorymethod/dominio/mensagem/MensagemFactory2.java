package br.com.factorymethod.dominio.mensagem;

import java.util.HashMap;
import java.util.Map;

/* Comparação entre as duas implementações do método Factory
 * Inicialização mais lenta (Pois precisa instanciar no HashMap TODOS os objetos que são opções de retorno da Factory)
 * Tempo do método get O(1), pois é um hash */
public class MensagemFactory2 {
	private final Map<MensagemFactoryChoice , Mensagem> mensagens = new HashMap<>();
	public static final MensagemFactory2 instancia = new MensagemFactory2();
	
	private MensagemFactory2() {
		mensagens.put(MensagemFactoryChoice.SMS, new MensagemSMS());
		mensagens.put(MensagemFactoryChoice.EMAIL, new MensagemEmail());
	}
	
	public Mensagem getMensagem(MensagemFactoryChoice tipo) {
		if(tipo == null) {
			return this.mensagens.get(MensagemFactoryChoice.SMS);
		}
		return this.mensagens.get(tipo);	
	}
}
