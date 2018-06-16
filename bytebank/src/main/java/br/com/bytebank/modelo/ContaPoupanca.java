package br.com.bytebank.modelo;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.setSaldo(super.getSaldo() + valor);
	}

}
