package Arrays;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		/*
		 * Armazenando notas no vetor direto int notas[] = new int[]{10,9,8,2};
		 */

		// vetorNotas1();
		// vetorNotas2();

		System.out.println("##### \n");
		Carros carros[] = new Carros[3];

		for (int i = 0; i < carros.length; i++) {
			System.out.println("Informe o ano: ");
			int ano = teclado.nextInt();
			teclado.nextLine();
			System.out.println("Informe o modelo: ");
			String modelo = teclado.nextLine();

			carros[i] = new Carros(ano, modelo);
		}

		for (Carros carro : carros) {
			System.out.println(carro.toString());
		}

		teclado.close();
	}

	private static void vetorNotas2() {
		Scanner teclado = new Scanner(System.in);
		int notas[][] = new int[2][2];
		
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println("Disciplina "+ i);
				System.out.println("Informe a nota: ");
				notas[i][j] = teclado.nextInt();
				teclado.nextLine();
			}
		}
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println(notas[i][j]);
			}
		}
	}

	private static void vetorNotas1() {
		Scanner teclado = new Scanner(System.in);
		// vetor com 5 posicoes
		float notas[] = new float[5];
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota: ");
			notas[i] = teclado.nextFloat();
		}

		// usando foreach na impressao
		for (float nota : notas) {
			System.out.println(nota);
		}
	}
}
