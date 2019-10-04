package br.com.fiap.fullStack.aula2.herança;

public class Funcionario {
	
	private int numero;
	private String nome;
	
	public Funcionario () {
		
		
	}
	
	public Funcionario(String nome, int numero) {
	
		this.nome = nome;
		this.numero = numero;
		
	}
	
	public void trabalha() {
	
		System.out.println("Estou trabalhando");
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
