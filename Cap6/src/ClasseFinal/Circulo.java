package ClasseFinal;

public final class Circulo extends Forma {
	private double raio;
	private final double PI = 3.14;
	
	// final class -> a classe nao pode ser estendida (não tera subclasse)
	// final metodo -> o metodo não pode ser sobrescrito
	// final atributo -> o atributo não pode ser alterado

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
