package br.com.fiap.fullStack.aula2.herança.exercicio;

public abstract class ContaBancaria {

	// atributos
	private String titular;
	private double saldo;

	public ContaBancaria(String titular, double valor) {

		this.titular = titular;
		this.saldo = valor;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public abstract String getTipo();

	public double saque(double valor) {
		this.saldo -= valor;
		return saldo;
	}

}
