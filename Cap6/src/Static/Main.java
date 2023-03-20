package Static;

public class Main {

	public static void main(String[] args) {

		// metodo static da pra utilizar sem instanciar

		int total = AcessoCatraca.recuperarTotal();
		System.out.println("Total " + total);

		long numero = Math.round(2.9);
		System.out.println("Número arredondado: " + numero);

		AcessoCatraca a1 = new AcessoCatraca();
		a1.entrar("Thiago");

		AcessoCatraca a2 = new AcessoCatraca();
		a2.entrar("Leandro");

		System.out.println("Total " + AcessoCatraca.recuperarTotal());
		//Chamando metodo static a partir da variavel
		System.out.println("Total " + a1.recuperarTotal());

	}

}
