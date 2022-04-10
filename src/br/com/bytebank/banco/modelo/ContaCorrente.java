package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numero){
    	super(agencia, numero);
    }
    
    @Override
    public void saca(double valor) throws SaldoInsuficienteException{
    	double taxa = 0.2;
    	super.saca(valor + taxa);
    }

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente, " + super.toString();
	}

}
