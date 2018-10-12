package br.com.factorymethod;

import javax.swing.JOptionPane;

import br.com.factorymethod.dominio.mensagem.Mensagem;
import br.com.factorymethod.dominio.mensagem.MensagemFactory;
import br.com.factorymethod.dominio.mensagem.MensagemFactoryChoice;
import br.com.factorymethod.dominio.mensagem.MensagemFactory2;

public class Application {

	public static void main(String[] args) {
		
		String texto = JOptionPane.showInputDialog(null);
		
		// Exemplo 1
		Mensagem mensagem = MensagemFactory.getMensagem(MensagemFactoryChoice.EMAIL);
		mensagem.enviar(texto);
		
		// Exemplo 2
		mensagem = MensagemFactory2.instancia.getMensagem(MensagemFactoryChoice.SMS);
		mensagem.enviar(texto);
	}
	
}
