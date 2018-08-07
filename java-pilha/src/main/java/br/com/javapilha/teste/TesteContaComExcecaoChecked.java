package br.com.javapilha.teste;

import br.com.javapilha.config.Conta;
import br.com.javapilha.util.MinhaExcecao;

public class TesteContaComExcecaoChecked {
	
	public static void main(String[] args) {
		
		Conta c = new Conta();
		try{
			c.deposita();
		}catch(MinhaExcecao ex){
			System.out.println("tratamento.....");
		}
		
		
		
	}

}
