package br.com.bytefuncionario.teste;

import br.com.bytefuncionario.modelo.Gerente;
import br.com.bytefuncionario.service.SistemaInterno;

public class TesteSistema {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setSenha(2224);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		
	}

}
