package br.com.fiap.fullStack.aula2.heran�a;

public class Motorista extends Funcionario {

	public void dirige() {

		System.out.println("Motorista que est� dirigindo");
	}

	// Sobrescrita de metodo na heran�a
	@Override
	public void trabalha() {

		System.out.println("Motorista que trabalha");

	}

}
