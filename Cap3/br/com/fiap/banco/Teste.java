package br.com.fiap.banco;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		double valor;
		double saldo;
		int numero, agencia;

		System.out.println("Informe saldo: ");
		saldo = teclado.nextDouble();
		System.out.println("Informe o numero: ");
		numero = teclado.nextInt();
		System.out.println("Informe a agencia: ");
		agencia = teclado.nextInt();

		Conta cc = new Conta(numero, agencia, saldo);
		Conta poupanca = new Conta(100, 25, 500);

		do {

			System.out.println("1 - Depositar");
			System.out.println("2 - Retirar");
			System.out.println("3 - Verificar Saldor");
			System.out.println("4 - Sair");
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Informe o valor a ser depositado: ");
				valor = teclado.nextDouble();
				cc.depositar(valor);
				break;

			case 2:
				System.out.println("Informe o valor a ser retirado: ");
				valor = teclado.nextDouble();
				cc.retirar(valor);
				break;
			case 3:
				System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
				System.out.println("Saldo poupanca:" + poupanca.getSaldo());
				break;
			default:
				break;
			}
		} while (opcao != 4);

	}

}
