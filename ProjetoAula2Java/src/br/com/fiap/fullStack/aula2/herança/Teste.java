package br.com.fiap.fullStack.aula2.herança;

public class Teste {

	public static void main(String[] args) {

		Funcionario func = new Funcionario();

		func.setNome("Teste1");
		func.setNumero(0001);
		func.trabalha();
		System.out.println(func.getNome());
		System.out.println(func.getNumero());

		Motorista m1 = new Motorista();

		m1.setNome("Teste2");
		m1.setNumero(0002);
		m1.trabalha();
		m1.dirige();
		System.out.println(m1.getNome());
		System.out.println(m1.getNumero());
		
		Funcionario f2 = new Funcionario("Teste3",003);
		System.out.println(f2.getNome());
		

	}

}
