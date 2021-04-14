package br.com.facade.dominio.pc.facade;

import br.com.facade.dominio.pc.fabrica.Acessorios;
import br.com.facade.dominio.pc.fabrica.CPU;
import br.com.facade.dominio.pc.fabrica.HD;
import br.com.facade.dominio.pc.fabrica.Memoria;
import br.com.facade.dominio.pc.fabrica.SO;

public class ComputerFacade {
	private Memoria memoria;
	private HD hd;
	private CPU cpu;
	private Acessorios acessorios;
	private SO so;
	
	public ComputerFacade() {
		this.memoria = new Memoria();
		this.hd = new HD();
		this.cpu = new CPU();
		this.acessorios = new Acessorios();
		this.so = new SO();
	}
	
	public void montarPC() {
		System.out.println("Montando uma nova máquina:\n");
		this.memoria.adicionarMemoria();
		this.hd.adicionarHD();
		this.cpu.adicionarCPU();
		this.acessorios.adicionarMouse();
		this.acessorios.adicionarTeclado();
		this.acessorios.adicionarMonitor();
		this.so.instalarSO();
		System.out.println("\nComputador fabricado.");
	}
}
