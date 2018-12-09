package br.com.bytebank.modelo;

import br.com.bytebank.exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.setSaldo(super.getSaldo() + valor);
	}
	
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente: " + super.toString() ;
	}
	
}
