package AcessoArquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;

		while (opcao != 4) {
			System.out.println("Digite 1 para escrever 2 para ler 3 para verificar dados");
			opcao = teclado.nextInt();

			if (opcao == 1) {
				escrever();
			} else if (opcao == 2) {
				ler();
			} else if(opcao == 3) {
				verificar();
			}
		}

	}

	private static void verificar() {
		File arquivo = new File("arquivo.txt");

		// Verifica se o arquivo existe
		if (arquivo.exists()) {
			System.out.println("O arquivo existe!\n"+
		
	"Pode ser lido: " + arquivo.canRead() +
					
	"\nPode ser gravado: " + arquivo.canWrite() +
					
	"\nTamanho: " + arquivo.length() +
					
	"\nCaminho: " + arquivo.getPath());
		} else {
			// Cria o arquivo
			try {
				if (arquivo.createNewFile())
					System.out.println("Arquivo criado!");
				else
	        System.out.println("Arquivo não criado!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	private static void ler() {
		try {
			// Abre o arquivo
			FileReader stream = new FileReader("arquivo.txt");
			BufferedReader reader = new BufferedReader(stream);

			// Lê uma linha do arquivo
			String linha = reader.readLine();
			while (linha != null) {
				System.out.println(linha);
				// Lê a próxima linha do arquivo
				linha = reader.readLine();
			}

			reader.close();
			// Fecha o arquivo
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void escrever() {
		try {
			// Abre o arquivo
			FileWriter stream = new FileWriter("arquivo.txt");
			PrintWriter print = new PrintWriter(stream);

			// Escreve no arquivo
			print.println("Teste");
			print.println("Escrevendo no arquivo");

			print.close();
			// Fecha o arquivo
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
