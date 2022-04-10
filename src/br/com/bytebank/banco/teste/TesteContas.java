package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(1111, 1111);
		ContaPoupanca cp = new ContaPoupanca(2222, 2222);
		
		cc.deposita(100.0);
		cp.deposita(100.0);

		try {
			cc.transfere(50, cp);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Saldo da CC: " + cc.getSaldo());
		System.out.println("Saldo da CP: " + cp.getSaldo());
		
		System.out.println(cc);
		System.out.println(cp);
		
	}

}
