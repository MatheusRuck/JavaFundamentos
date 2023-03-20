package Colecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Generic {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
		int opcao = 0;
		
		while(opcao != 4) {
			System.out.println("Digite 1 para cadastrar 4 para sair: ");
			opcao = teclado.nextInt();
			if(opcao == 1 ) {
				listaCliente.add(cadastrar());
			}
		}
		
		//na lista so fica armazenado os enderecos de memoria do objeto (A nao ser que use o toString)
		System.out.println(listaCliente);
		
		for (int i = 0; i < listaCliente.size(); i++) {
		    Cliente cli = listaCliente.get(i); 
		    System.out.println(cli.toString());
		}
		
		//Usando Foreach
		for (Cliente cliente : listaCliente) {
			  System.out.println("Nome: "+ cliente.getNome());
			}

	}

	private static Cliente cadastrar() {
		Scanner teclado = new Scanner(System.in);
		String cpf;
		String nome;
		int idade;
		
		System.out.println("Informe o cpf: ");
		cpf = teclado.nextLine();
		
		System.out.println("Informe o nome: ");
		nome = teclado.nextLine();
		
		System.out.println("Informe a idade: ");
		idade = teclado.nextInt();
		Cliente cliente1 = new Cliente(cpf, nome, idade);
		return cliente1;
	}

}
