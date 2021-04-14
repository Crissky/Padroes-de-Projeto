package br.com.mvc.dominio.view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Visao extends JFrame{
	private JTextField numero1 = new JTextField(3);
	private JTextField numero2 = new JTextField(3);
	private JTextField resultado = new JTextField(6);
	private JButton botão = new JButton("Somar");
	
	public Visao() {
		JPanel painel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 100);
		
		painel.add(this.numero1);
		painel.add(this.numero2);
		painel.add(this.botão);
		painel.add(this.resultado);

		this.add(painel);
	}
	public int getPrimeiroNumero() {
		return Integer.parseInt(this.numero1.getText());
	}
	public int getSegundoNumero() {
		return Integer.parseInt(this.numero2.getText());
	}
	public int getResultado() {
		return Integer.parseInt(this.resultado.getText());
	}
	public void setResultado(int valor) {
		this.resultado.setText(Integer.toString(valor));
	}
	public void adicionarListener(ActionListener listener) {
		this.botão.addActionListener(listener);		
	}
	public void mensagemErro(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
}
