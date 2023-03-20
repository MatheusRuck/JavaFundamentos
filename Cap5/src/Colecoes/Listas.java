package Colecoes;

import java.util.ArrayList;

public class Listas {

	public static void main(String[] args) {
		
		ArrayList lista = new ArrayList();
		lista.add(1.26);
		lista.add("Web");
		lista.add("Algoritmo");
		lista.set(0, "Xurus");
		lista.add(2.56);

		for (int i = 0; i < lista.size(); i++) {
		    System.out.println(lista.get(i));
		}
		
		System.out.println(lista.contains("Web"));
		int indice = lista.lastIndexOf("Web");
		System.out.println("O indice de web é: "+ indice);
		
		lista.remove("Web");
		System.out.println(lista);
		System.out.println("indice de algoritmo: " + lista.lastIndexOf("Algoritmo"));
		
		
	}

}
