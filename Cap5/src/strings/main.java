package strings;

public class main {

	public static void main(String[] args) {
		
		String nome = "FIAP";    
		String slogan = "A melhor faculdade de tecnologia";

		String faculdade = nome;
		faculdade += " - ";
		faculdade += slogan;

		System.out.println(faculdade);
		
		if (faculdade.startsWith("FIAP")){
		    System.out.println("A string começa com FIAP");
		}else{
		    System.out.println("A string não começa com FIAP");
		}
		

		if (faculdade.endsWith("gia")){
		    System.out.println("A string termina com gia");
		}else{
		    System.out.println("A string não termina com gia");
		}
		
		int caracteres = faculdade.length();
		System.out.println("A string possui " + caracteres + " caracteres");

		char caracter = faculdade.charAt(1);
		System.out.println("O segundo caracter da string é " + caracter);
		
		//pega index da palavra
		int posicao = faculdade.indexOf('a');
		System.out.println("O índice do caracter 'a' na string é " + posicao);
		
		int posicao1 = faculdade.lastIndexOf("faculdade");
		System.out.println("O índice da última palavra \"Faculdade\" na string é " + posicao1);
		
		//metodo substring -> cortar palavra
		String nova = faculdade.substring(16, 25);
		System.out.println("A nova string é: " + nova);
		
		String nova1 = faculdade.substring(faculdade.indexOf('m'), faculdade.lastIndexOf('t')-1);
		System.out.println("A nova string é: " + nova1);
		
		String nova2 = faculdade.substring(faculdade.lastIndexOf('t'));
		System.out.println("A nova string é: " + nova2);
		
		// mudar maiusculo
		System.out.println(faculdade.toUpperCase());
		System.out.println(faculdade.toLowerCase());
		
		//metodo replace -> trocar palavras
		String nova3 = faculdade.replace("tecnologia", "São Paulo");
		System.out.println("A nova string é: " + nova3);
		System.out.println("Valor da variável faculdade: " + faculdade);
		
		//metodo split -> separar palavras
		String disciplinas = "LTP;Web;Algoritmos;Banco de Dados";
		String[] dis = disciplinas.split(";");
		for (String d : dis) {
		    System.out.println(d);
		}
		
	}

}
