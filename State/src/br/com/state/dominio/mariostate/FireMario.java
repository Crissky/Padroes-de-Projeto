package br.com.state.dominio.mariostate;

import br.com.state.dominio.state.State;

public class FireMario implements State {

	@Override
	public State pegarCogumelo() {
		System.out.println("Pegou um Cogumelo: Mais 1000 pontos.");
		return this;
	}

	@Override
	public State pegarEstrela() {
		System.out.println("Pegou uma Estrela: Mario está invencivel.");
		return new MarioInvencivel();
	}

	@Override
	public State pegarFlorDeFogo() {
		System.out.println("Pegou uma Flor: Continua com poderes de fogo");
		return this;
	}

	@Override
	public State colidirComInimigo() {
		System.out.println("Colidiu com Inimigo: Volta a ser o Super Mario.");
		return new SuperMario();
	}

	@Override
	public String retornarTipo() {
		return "Fire Mario";
	}

}
