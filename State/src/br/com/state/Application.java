package br.com.state;

import br.com.state.dominio.mariostate.Mario;
import br.com.state.dominio.state.State;

public class Application {

	public static void main(String[] args) {
		State mario = new Mario();
		
		mario = mario.pegarCogumelo();
		mario = mario.pegarFlorDeFogo();
		mario = mario.pegarCogumelo();
		
		mario = mario.colidirComInimigo();
		mario = mario.colidirComInimigo();
		mario = mario.colidirComInimigo();
		
		System.out.println();
		System.out.println("Estado final: " + mario.retornarTipo());

	}

}
