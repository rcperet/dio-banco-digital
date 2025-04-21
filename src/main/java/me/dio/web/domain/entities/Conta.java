package me.dio.web.domain.entities;

public interface Conta {
	
	public void depositar(Double valor);
	public void sacar(Double valor);
	public void transferir(Double valor, Conta contaDestino);
	public void imprimirExtrato();

}
