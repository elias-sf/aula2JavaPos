package br.com.fiap.fullStack.aula2.herança;

public class Motorista extends Funcionario {

	public void dirige() {

		System.out.println("Motorista que está dirigindo");
	}

	// Sobrescrita de metodo na herança
	@Override
	public void trabalha() {

		System.out.println("Motorista que trabalha");

	}

}
