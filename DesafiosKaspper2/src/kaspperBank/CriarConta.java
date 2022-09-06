package kaspperBank;

public class CriarConta {

	public static void main(String[] args) {

		Conta c1 = new Conta();
		Conta c2 = new Conta(); // garbage collector

		c1.saldo = 1000;
		c1.saldo += 500;
		c2.saldo = 2000;

		System.out.println("Conta 1: " + c1.saldo);
		System.out.println("Conta 2: " + c2.saldo);

	}

}
