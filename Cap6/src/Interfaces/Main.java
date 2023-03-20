package Interfaces;

public class Main {

	public static void main(String[] args) {

		Corredor avestruz = new Avestruz();
		Corredor cavalo = new Cavalo();
		avestruz.parar();
		cavalo.parar();

		avestruz.correr(80);
		cavalo.correr(50);

		Corredor.acelerar();

		if (avestruz instanceof Animal) {
			System.out.println("� um animal");
		} else {
			System.out.println("N�o � um animal");
		}

		if (avestruz instanceof Corredor) {
			System.out.println("� um corredor");
		} else {
			System.out.println("N�o � um corredor");
		}

	}

}
