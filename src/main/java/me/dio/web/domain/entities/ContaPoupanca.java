package me.dio.web.domain.entities;

public class ContaPoupanca extends AbstractConta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("===== EXTRATO CONTA POUPANÇA =====");
		super.imprimirExtrato();
	}

}
