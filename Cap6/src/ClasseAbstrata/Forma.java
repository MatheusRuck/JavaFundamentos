package ClasseAbstrata;

public abstract class Forma {
	
	private String nome;

	public Forma(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract double calcularArea();
	

}
