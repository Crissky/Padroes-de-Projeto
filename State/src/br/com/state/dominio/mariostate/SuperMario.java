package br.com.state.dominio.mariostate;

import br.com.state.dominio.state.State;

public class SuperMario implements State {

	@Override
	public State pegarCogumelo() {
		System.out.println("Pegou um Cogumelo: Mais 1000 pontos.");
		return this;
	}

	@Override
	public State pegarEstrela() {
		System.out.println("Pegou uma Estrela: Mario está invencível.");
		return new MarioInvencivel();
	}

	@Override
	public State pegarFlorDeFogo() {
		System.out.println("Pegou uma Flor: Mario atira fogo.");
		return new FireMario();
	}

	@Override
	public State colidirComInimigo() {
		System.out.println("Colidiu com Inimigo: Volta a ser o Mario Baixinho.");
		return new Mario();
	}

	@Override
	public String retornarTipo() {
		return "Super Mario";
	}

}
