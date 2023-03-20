package Colecoes;

import java.util.HashMap;

public class Mapas {

	public static void main(String[] args) {
		HashMap mapa = new HashMap();

		mapa.put("RM1234", "Thiago");
		mapa.put("RM4321", "João");
		mapa.put("RM4321", "Matheus");
		mapa.put("RM12", "P");

		mapa.remove("RM1234"); //remove um elemento

		System.out.println(mapa.get("RM1234"));
		System.out.println(mapa.get("RM4321"));
		System.out.println(mapa);
		System.out.println(mapa.containsKey("RM12"));
		System.out.println(mapa.containsValue("P"));

	}

}
