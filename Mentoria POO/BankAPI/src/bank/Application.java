package bank;

import bank.model.Cliente;
import bank.model.Conta;
import bank.model.ContaCorrente;
import bank.model.ContaPoupanca;

public class Application {

	public static void main(String[] args) {
		
		Cliente cl = new Cliente();
		cl.setNome("Phillip");
		
		Conta cc = new ContaCorrente(cl);
		cc.depositar(150);
		
				
		Conta cp = new ContaPoupanca(cl);
		
		cc.transferir(50, cp);
		cp.sacar(15);
		
		cc.extrato();
		cp.extrato();

	}

}
