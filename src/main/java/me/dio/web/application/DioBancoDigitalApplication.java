package me.dio.web.application;

import me.dio.web.domain.entities.Cliente;
import me.dio.web.domain.entities.Conta;
import me.dio.web.domain.entities.ContaCorrente;
import me.dio.web.domain.entities.ContaPoupanca;

public class DioBancoDigitalApplication {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Raphael");
		
		Conta cc = new ContaCorrente(cliente);
		Conta cp = new ContaPoupanca(cliente);
		
		cc.depositar(100.0);
		cc.transferir(100.0, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		
		
		

	}

}
