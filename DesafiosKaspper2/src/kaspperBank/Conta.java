package kaspperBank;

public class Conta {
//		propriedades s�o vari�veis

	String titular;
	double saldo;
	int agencia;
	int numero;

//		m�todos s�o as a��es que podem ser feitas
//		na classe ou pela classe.

	void deposita(double valor) {
		this.saldo += valor;

	}

	void saca(double valor) {
//		int idade = 10;
//		if (idade!=20) {
//			comando 1
//		} else {
//			comando 2
//		}

		if (valor <= this.saldo) {
			this.saldo -= valor;
		} else {
			System.out.println("N�o pode sacar o valor: " + valor);
		}
	}

//		this.saldo -= valor;

	public boolean transfere(double valor, Conta destino) {
//			contaDoUbiraci.transfere(1500, contaDaRosilene);
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;

		}

	}
}
