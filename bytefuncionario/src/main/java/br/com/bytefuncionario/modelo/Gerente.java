package br.com.bytefuncionario.modelo;

public class Gerente extends Funcionario implements Autenticavel{

	private int senha;
	
	@Override
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Gerente");
	    return super.getSalario();
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if(this.senha == senha){
			return true;
		}else{
			return false;
		}
	}
	
	
}
