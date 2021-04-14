package br.com.facade;

import br.com.facade.dominio.pc.facade.ComputerFacade;

public class Application {

	public static void main(String[] args) {
		ComputerFacade facade = new ComputerFacade();
		facade.montarPC();

	}

}
