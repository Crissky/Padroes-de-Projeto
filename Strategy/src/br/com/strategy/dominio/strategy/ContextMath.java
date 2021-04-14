package br.com.strategy.dominio.strategy;

public class ContextMath {
	private StrategyMath strategy;

	public ContextMath(StrategyMath strategy) {
		this.strategy = strategy;
	}
	
	public int calcular(int numero1, int numero2) {
		return this.strategy.operacao(numero1, numero2);
	}
	
}
