package br.com.javapilha.teste;

import br.com.javapilha.util.Conexao;

public class TesteConexao {

	public static void main(String[] args) {
		
		
		try(Conexao conexao = new Conexao()){
			conexao.leDados();
		}catch(IllegalStateException ex){
			System.out.println("Deu erro na conexao");
		}
		
		/*Conexao con = new Conexao();
		try{
			con.leDados();
		}catch(IllegalStateException ex){
			System.out.println("Deu erro na conexao");
		}finally{
			con.fecha();
		}*/

	}

}
