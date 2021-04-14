package br.com.strategy.dominio;

import br.com.strategy.dominio.strategy.ContextMath;
import br.com.strategy.dominio.strategy.operacoes.Somar;
import br.com.strategy.dominio.strategy.operacoes.Subtrair;

public class Application {

	public static void main(String[] args) {
		ContextMath math = new ContextMath(new Somar());
		
		System.out.println("Soma: " + math.calcular(3, 5));
		
		math = new ContextMath(new Subtrair());

		System.out.println("Subtração: " + math.calcular(3, 5));
		
	}

}
