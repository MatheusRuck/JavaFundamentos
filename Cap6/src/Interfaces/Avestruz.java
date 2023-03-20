package Interfaces;

public final class Avestruz extends Ave implements Corredor{

	@Override
	public void correr(int velocidade) {
		System.out.println("Velocidade do Avestruz-> "+ velocidade);
		
	}

	@Override
	public void parar() {
		System.out.println("Avestruz Parando...");
		//Corredor.super.parar();
	}
	

}
