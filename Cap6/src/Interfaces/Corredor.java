package Interfaces;

public interface Corredor {
	
		  void correr(int velocidade);

		  //metodo default pode ser sobrescrito e precisa intanciar para usar != do static
		  default void parar(){
		    System.out.println("Parando..");
		  }

		  static void acelerar(){
		    System.out.println("Acelerando");
		  }
		
}
