package br.com.fiap.fullStack.aula2.heran�a.exercicio;

public class ContaCorrente extends ContaBancaria {

	public ContaCorrente(String titular, double valor) {
		super(titular, valor);
	}

	public double saque(double valor) {

		return super.saque((valor - 0.10));
	}

	public String getTipo() {

		return "Conta Corrente";
	}

}
