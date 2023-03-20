package br.fiap.banco;

public class Main {

	public static void main(String[] args) {

		Conta cc = new ContaCorrente(100, 200, 1000, "VIP", 150);
		
		//Usando metodo cast -> forca cc ser do tipo ContaCorrente
		System.out.println("Cheque especial: "+ ((ContaCorrente) cc).getChequeEspecial() + "\t Tipo: "+ ((ContaCorrente) cc).getTipo());
		System.out.println("Saldo: "+ cc.getSaldo() + "\t Agencia: " + cc.getAgencia() + "\t Numero: " + cc.getNumero());
		cc.retirar(25);
		System.out.println("Saldo" + cc.getSaldo() + "\t Saldo disponivel: " + ((ContaCorrente) cc).getSaldoDisponivel());
		
		System.out.println();
		if (cc instanceof Conta) {
			System.out.println("cc é do tipo Conta");
		} else {
			System.out.println("cc não é do tipo Conta");
		}
		
		System.out.println("##### \n");
		ContaCorrente cc1 = new ContaCorrente(200, 300, 50, "Normal", 0);
		
		System.out.println("Cheque especial: " + cc1.getChequeEspecial() + "\t Tipo: "+ cc1.getTipo());
		System.out.println("Saldo: "+ cc1.getSaldo() + "\t Agencia: " + cc1.getAgencia() + "\t Numero: " + cc1.getNumero());
		cc1.setChequeEspecial(1000);
		System.out.println("Cheque especial: " + cc1.getChequeEspecial());
		System.out.println("Saldo disponivel: " + cc1.getSaldoDisponivel());
		cc1.retirar(25);
		System.out.println("Saldo: " + cc1.getSaldo() + "\t Saldo disponivel: " + cc1.getSaldoDisponivel());
		
		System.out.println();
		if (cc1 instanceof Conta) {
			System.out.println("cc1 é do tipo Conta");
		} else {
			System.out.println("cc1 não é do tipo Conta");
		}
		
	}
}
