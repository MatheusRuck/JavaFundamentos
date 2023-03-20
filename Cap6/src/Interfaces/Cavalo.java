package Interfaces;

public final class Cavalo extends Mamifero implements Corredor {

	@Override
	public void correr(int velocidade) {
		System.out.println("Velocidade do Cavalo-> "+ velocidade);
		
	}
	
}
