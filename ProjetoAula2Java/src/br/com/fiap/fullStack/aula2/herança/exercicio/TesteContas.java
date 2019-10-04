package br.com.fiap.fullStack.aula2.herança.exercicio;

public class TesteContas {

	public static void main(String[] args) {

		ContaBancaria cb = new ContaPoupança("Teste Conta Bancaria", 1000);
		System.out.println("Dados da Conta Poupança");
		System.out.println(cb.getSaldo());
		System.out.println(cb.saque(500));
		System.out.println(cb.getTipo());
		System.out.println(cb.getTitular());

		System.out.println(" ");
		ContaCorrente cc = new ContaCorrente("Teste Conta Corrente", 2000);
		System.out.println("Dados da Conta Corrente");
		System.out.println(cc.getSaldo());
		System.out.println(cc.saque(500));
		System.out.println(cc.getTipo());
		System.out.println(cc.getTitular());

	}
}