package Arrays;

public class Carros {
	private int ano;
	private String modelo;
	
	public Carros(int ano, String modelo) {
		this.ano = ano;
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
	@Override
	public String toString() {
		return "Carros [ano=" + ano + ", modelo=" + modelo + "]";
	}
	
	
}
