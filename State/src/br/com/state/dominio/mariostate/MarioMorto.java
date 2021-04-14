package br.com.state.dominio.mariostate;

import br.com.state.dominio.state.State;

public class MarioMorto implements State {

	@Override
	public State pegarCogumelo() {
		return this;
	}

	@Override
	public State pegarEstrela() {
		return this;
	}

	@Override
	public State pegarFlorDeFogo() {
		return this;
	}

	@Override
	public State colidirComInimigo() {
		return this;
	}

	@Override
	public String retornarTipo() {
		return "Mario Morto";
	}

}
