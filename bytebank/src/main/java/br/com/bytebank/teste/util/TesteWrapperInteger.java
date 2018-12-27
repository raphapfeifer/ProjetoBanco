package br.com.bytebank.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
	
	public static void main(String[] args) {
		
		
		int idade = 29;
		//Integer idadeRef = new Integer(29);
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29);// Autoboxing
		
		Integer idadeRef = Integer.valueOf(29); //autoboxing
		System.out.println(idadeRef.doubleValue()); //unboxing
		
		
		int valor = idadeRef.intValue();
		
		System.out.println(idadeRef.MAX_VALUE);
		System.out.println(idadeRef.MIN_VALUE);
		
		System.out.println(idadeRef.SIZE);
		
		String s = args[0];
		
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		
	}

}
