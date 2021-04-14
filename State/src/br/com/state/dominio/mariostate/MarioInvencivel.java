package br.com.state.dominio.mariostate;

import br.com.state.dominio.state.State;

public class MarioInvencivel implements State {

	@Override
	public State pegarCogumelo() {
		System.out.println("Pegou um Cogumelo: Mais 1000 pontos e ainda está invencível");
		return this;
	}

	@Override
	public State pegarEstrela() {
		System.out.println("Pegou uma Estrela: Mario está invencivel.");
		return this;
	}

	@Override
	public State pegarFlorDeFogo() {
		System.out.println("Pegou uma Flor: Mario atira fogo e ainda está invencível.");
		return this;
	}

	@Override
	public State colidirComInimigo() {
		System.out.println("Colidiu com Inimigo: Inimigo morreu.");
		return this;
	}

	@Override
	public String retornarTipo() {
		return "Mario Invencível";
	}

}
