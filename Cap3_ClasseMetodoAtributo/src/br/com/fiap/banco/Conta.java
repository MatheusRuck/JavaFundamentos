package br.com.fiap.banco;
/**
 * Classe que abstrai uma Conta Bancária
 * @author matheusruck
 * @version 1.0
 */
public class Conta {

	/**
	 * Número da Conta
	 */
	private int numero;
	/**
	 * Número da Agencia
	 */
	private int agencia;
	/**
	 * Saldo da Conta
	 */
	private double saldo;
	
	public Conta(){}
	
	public Conta(int numero, int agencia, double saldo){
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	/**
	 * Deposita um valor ao saldo da conta
	 * @param valor Valor a ser depositado
	 */
	public void depositar(double valor){
		saldo = saldo + valor;
	}
	
	/**
	 * Retira um valor do saldo da conta
	 * @param valor Valor a ser retirado
	 */
	public void retirar(double valor){
		saldo = saldo - valor;
	}
	
	/**
	 * Verifica o saldo da conta
	 * @return Valor do saldo da conta
	 */
	public double getSaldo() {
		return saldo;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}	
}