package ClasseAbstrata;

public class Main {

	public static void main(String[] args) {
		
		Forma qd = new Quadrado("quadrado", 10, 10);
		Forma cir = new Circulo("circulo", 1.5);
		Forma tri = new Triangulo("triangulo", 10, 10);
		
		
		
		System.out.println("Nome: "+ qd.getNome() + " \tArea: "+ qd.calcularArea());
		System.out.println("Nome: "+ cir.getNome() + " \tArea: "+cir.calcularArea());
		System.out.println("Nome: "+ tri.getNome() + " \tArea: "+tri.calcularArea());

	}

}
