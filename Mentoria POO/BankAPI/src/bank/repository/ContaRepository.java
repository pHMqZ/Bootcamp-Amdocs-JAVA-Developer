package bank.repository;

import bank.model.Conta;

public interface ContaRepository {
	
	void sacar(double valor);

	void depositar(double valor);

	void transferir(double valor, Conta contaDestino);
	
	void extrato();

}
