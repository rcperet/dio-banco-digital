package me.dio.web.domain.entities;

import lombok.Getter;

@Getter
public abstract class AbstractConta implements Conta{
	
	private static final int AGENCIA_PADRAO = 1;
	private static int sequencia = 1;
	
	private int agencia;
	private int numero;
	private double saldo;
	private Cliente cliente;
	private String extrato;
	
	public AbstractConta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = sequencia++;
		this.cliente = cliente;
		this.extrato = "";
	}
	
	
	@Override
	public void sacar(Double valor) {
		saldo -= valor;
		this.extrato += String.format("Saque no valor de %.2f%n", valor);
	}
	
	@Override
	public void depositar(Double valor) {
		saldo += valor;
		this.extrato += String.format("Deposito no valor de %.2f%n", valor);
	}
	
	@Override
	public void transferir(Double valor, Conta contaDestino) {
		this.sacar(valor);
		AbstractConta abstractContaDestino = (AbstractConta) contaDestino;
		contaDestino.depositar(valor);
		this.extrato += String.format("Transferência enviada no valor de %.2f para a conta %d%n", valor, abstractContaDestino.getNumero());
	}
	
	public void imprimirExtrato() {
		System.out.println(toString());
		System.out.println(this.extrato);
	}
	
	@Override
	public String toString() {
		return  "Titular: " + cliente.getNome() + "\n"
				+ "Agencia: " + this.agencia + "\n"
				+ "Conta: " + this.numero + "\n"
				+ "Saldo: " + String.format("%.2f", saldo ) + "\n"; 
	}
	
	
}
