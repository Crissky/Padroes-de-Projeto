package br.com.abstractfactory.dominio.old;

public class NFEOLD {
	private String uf;
	
	public NFEOLD(String uf) {
		this.uf = uf;
	}
	
	public double calcularImposto() {
		double imposto;
		if(this.uf.equalsIgnoreCase("MG")) {
			imposto = 18;
		} else if(this.uf.equalsIgnoreCase("RJ")) {
			imposto = 20; 
		} else {
			imposto = 10;
		}
		
		return imposto;
	}

}
