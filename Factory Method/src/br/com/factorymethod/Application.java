package br.com.factorymethod;

import javax.swing.JOptionPane;

import br.com.factorymethod.dominio.mensagem.Mensagem;
import br.com.factorymethod.dominio.mensagem.MensagemFactory;

public class Application {

	public static void main(String[] args) {
		
		String texto = JOptionPane.showInputDialog(null);
		
		Mensagem mensagem = MensagemFactory.getMensagem(1);
		mensagem.enviar(texto);
		
	}
	
}
