package AcessoArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TesteArquivo {

	public static void main(String[] args) {

		String nomeDoAquivo = "estoque.csv";
		String diretorio = System.getProperty("user.home");
		String caminho = diretorio + "\\" + nomeDoAquivo;

		List<String> conteudo = new ArrayList<>();
		conteudo.add("Produto; Quantidade; Unidade de Medida; Valor da Unidade;");
		conteudo.add("Pera; 200; pct; R$ 5,40;");
		conteudo.add("Morango; 400; cx; R$ 6,50;");
		conteudo.add("Abacaxi; 280; un; R$ 5,00;");

		gravarEstoque(nomeDoAquivo, caminho, conteudo);

		lerEstoque(caminho);

	}

	private static void lerEstoque(String caminho) {
		try {
			// Abre o arquivo
			FileReader stream = new FileReader(caminho);

			// BufferedReader possui o metodo readLine()
			// le uma linha do arquivo e retorna uma String com o valor lido ou null
			BufferedReader reader = new BufferedReader(stream);

			// le uma linha do arquivo
			String linha = reader.readLine();

			// enquanto linha for diferente de null
			while (linha != null) {

				System.out.println(linha);
				// le a proxima linha do arquivo
				linha = reader.readLine();

			}
			reader.close();
			// fecha o arquivo
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void gravarEstoque(String nomeDoAquivo, String caminho, List<String> conteudo) {

		FileWriter stream;
		PrintWriter print;

		try {
			// stream � uma conexao de escrita para o arquivo
			stream = new FileWriter(caminho);
			// a classe PrintWriter escrever� no arquivo
			print = new PrintWriter(stream);

			for (String linha : conteudo) {
				// o metodo println escreve uma linha no arquivo
				print.println(linha);
			}
			// close fecha o arquivo
			print.close();
			stream.close();

			System.out.println("O arquivo " + nomeDoAquivo + " foi salvo em " + caminho);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
