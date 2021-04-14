package br.com.mvc;

import br.com.mvc.dominio.controller.Controlador;
import br.com.mvc.dominio.model.Modelo;
import br.com.mvc.dominio.view.Visao;

public class Application {

	public static void main(String[] args) {
		Visao visao = new Visao();
		Modelo modelo = new Modelo();
		new Controlador(visao, modelo);
		
		visao.setVisible(true);

	}

}
