package br.fiap.banco;

public class Conta {
	
		private int numero;
		private int agencia;
		private double saldo;
		
		
		
		public Conta(){}
		
		public Conta(int numero, int agencia, double saldo){
			this.numero = numero;
			this.agencia = agencia;
			this.saldo = saldo;
		}
		
		public void depositar(double valor){
			saldo = saldo + valor;
		}
		
		public void retirar(double valor){
			saldo = saldo - valor;
		}
		
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
