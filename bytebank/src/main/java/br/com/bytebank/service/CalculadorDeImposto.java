package br.com.bytebank.service;

import br.com.bytebank.modelo.Tributavel;

public class CalculadorDeImposto {
	
	private double totalImposto;
	
	public void registra(Tributavel t){
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}

	public double getTotalImposto(){
		return totalImposto;
	}
	
}
