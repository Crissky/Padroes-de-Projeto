package br.com.state.dominio.mariostate;

import br.com.state.dominio.state.State;

public class Mario implements State {

	@Override
	public State pegarCogumelo() {
		System.out.println("Pegou um Cogumelo: Tornou-se Super Mario.");
		return new SuperMario();
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
		System.out.println("Colidiu com Inimigo: Mario morreu.");
		return new MarioMorto();
	}

	@Override
	public String retornarTipo() {
		return "Mario Comum (pequeno).";
	}

}
