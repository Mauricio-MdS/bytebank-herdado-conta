package br.com.bytebank.banco.modelo;

/**
 * Classe abstrata para ser herdada pela conta corrente e conta poupan�a
 * @author Maur�cio
 * @version 0.1
 *
 */
public abstract class Conta implements Comparable<Conta>{

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    /**
     * Construtor, onde devem ser fornecidos os n�meros de agencia e numero de conta
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero){
        Conta.total++;
        System.out.println("O total de contas � " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
//        this.saldo = 100;
        System.out.println("Estou criando uma conta " + this.numero);
    }

    public abstract void deposita(double valor);

    /**
     * Caso o valor seja superior ao saldo � lan�ada a exce��o de saldo insuficiente
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void saca(double valor) throws SaldoInsuficienteException{
        if(this.saldo < valor) {
        	throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor a sacar: " + valor);
        }
        this.saldo-=valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }
    
    @Override
    public String toString() {
    	return "Ag�ncia: " + this.getAgencia() + ", Numero: " + this.getNumero() + ", Titular: " + this.getTitular().getNome() + ", Saldo: " + this.saldo;
    }

    @Override
	public boolean equals(Object referencia) {
    	Conta conta = (Conta) referencia;
		if (this.agencia != conta.agencia) {
			return false;
		}
		
		if (this.numero != conta.numero) {
			return false;
		}
		
		return true;
	}
    
    @Override
    public int compareTo(Conta outra) {
   
    	return Double.compare(this.saldo, outra.saldo);
    }

}
