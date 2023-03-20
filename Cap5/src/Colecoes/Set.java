package Colecoes;

import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
		//nao permite repitido
		HashSet cursos = new HashSet<>();

		cursos.add("Java");
		cursos.add(".NET");
		cursos.add("Android");

		cursos.add("Java"); //Repetido!

		//Imprime todos os elementos
		System.out.println(cursos);
		System.out.println(cursos.contains("Java"));
	}

}
