package br.com.bytebank.teste;

import br.com.bytebank.exception.SaldoInsuficienteException;
import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;

public class TesteSaca {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(123,321);
		
		conta.deposita(200.0);
		try{
			conta.saca(210.0);
		}catch(SaldoInsuficienteException ex){
			System.out.println("Ex: " +ex.getMessage());
		}
		
		System.out.println(conta.getSaldo());
	}

}
