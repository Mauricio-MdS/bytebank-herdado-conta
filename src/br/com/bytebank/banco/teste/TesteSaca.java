package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {

	public static void main(String[] args) {


		ContaCorrente cc = new ContaCorrente(1234, 123456);
		cc.deposita(200.0);
		try {
			cc.saca(300.0);
		} catch(SaldoInsuficienteException e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println(cc.getSaldo());
		

	}

}
