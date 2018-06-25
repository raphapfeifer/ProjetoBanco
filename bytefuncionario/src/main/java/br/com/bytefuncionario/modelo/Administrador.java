package br.com.bytefuncionario.modelo;

public class Administrador extends Funcionario {

	private int senha;
	
	@Override
	public double getBonificacao() {
		return 50;
	}

}
