package br.com.bytebank.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29); //autoboxing
		System.out.println(idadeRef.intValue()); //unboxing

		
		Double dRef = Double.valueOf(3.2);
		System.out.println(dRef.doubleValue());
		
		Number refNumero = Integer.valueOf(29);
		
		List<Number> lista = new ArrayList<Number>();
		lista.add(10);
		lista.add(32.0);
		lista.add(25.6f);
		
	}

}
