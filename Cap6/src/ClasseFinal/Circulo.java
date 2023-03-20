package ClasseFinal;

public final class Circulo extends Forma {
	private double raio;
	private final double PI = 3.14;
	
	// final class -> a classe nao pode ser estendida (n�o tera subclasse)
	// final metodo -> o metodo n�o pode ser sobrescrito
	// final atributo -> o atributo n�o pode ser alterado

	public Circulo(String nome, double raio) {
		super(nome);
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public final double calcularArea() {
		return PI * Math.pow(raio, 2);
	}

}
