package br.com.bytebank.teste;

import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(22,33);
		ContaPoupanca cp = new ContaPoupanca(33,22);
		
		System.out.println(cc.toString());
		System.out.println(cp.toString());

	}

}
