package br.com.bytebank.exception;

public class SaldoInsuficienteException extends RuntimeException{
	
	public SaldoInsuficienteException(String msg){
		super(msg);
	}

}