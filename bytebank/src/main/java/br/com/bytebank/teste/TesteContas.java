package br.com.bytebank.teste;

import br.com.bytebank.exception.SaldoInsuficienteException;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException{
		
		ContaCorrente cc = new ContaCorrente(111,111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222,222);
		cp.deposita(200.0);
		
		cc.transfere(10.0,cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());

	}

}
