package ClasseAbstrata;

public class Triangulo extends Forma {
	private int base;
	private int altura;

	public Triangulo(String nome, int base, int altura) {
		super(nome);
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return (base * altura)/2;
	}

}
