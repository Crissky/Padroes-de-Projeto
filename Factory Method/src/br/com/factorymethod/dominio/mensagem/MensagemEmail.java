package br.com.factorymethod.dominio.mensagem;

import javax.swing.JOptionPane;

public class MensagemEmail implements Mensagem {

	@Override
	public void enviar(String mensagem) {
		JOptionPane.showMessageDialog(null, "E-mail: " + mensagem);
	}

}
