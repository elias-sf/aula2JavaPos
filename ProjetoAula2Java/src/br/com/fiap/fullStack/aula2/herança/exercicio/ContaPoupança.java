package br.com.fiap.fullStack.aula2.herança.exercicio;

public class ContaPoupança extends ContaBancaria {

	public ContaPoupança(String titular, double valor) {
		super(titular, valor);
		// TODO Auto-generated constructor stub
	}

	public String getTipo() {

		return "Conta Bancaria";
	}

}
