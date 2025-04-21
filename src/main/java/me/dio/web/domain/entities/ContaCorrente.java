package me.dio.web.domain.entities;

public class ContaCorrente extends AbstractConta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("===== EXTRATO CONTA CORRENTE =====");
		super.imprimirExtrato();
	}
	
	

}
