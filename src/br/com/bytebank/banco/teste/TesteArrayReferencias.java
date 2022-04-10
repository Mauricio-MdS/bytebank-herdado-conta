package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		Conta[] contas = new Conta[5];
		ContaCorrente cc1 = new ContaCorrente(1234, 00001);
		ContaPoupanca cc2 = new ContaPoupanca(1234, 00002);
		
		contas[0] = cc1;
		contas[1] = cc2;
		
		ContaCorrente ref = (ContaCorrente) contas[0];
		
		System.out.println(contas[0]);
		System.out.println(contas[1]);
	}

}
