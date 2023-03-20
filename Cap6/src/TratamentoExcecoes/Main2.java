package TratamentoExcecoes;

public class Main2 {

	public static void main(String[] args) {
		// Excecoes Checked -> deve ser tratada

		// Excecoes Unchecked -> Pode ou não ser tratada
		try {
			int val = 10 / 0;

			int valores[] = new int[3];
			System.out.println(valores[4]);

			String nome = null;
			System.out.println(nome.length());

			int numero = Integer.parseInt("zero");

		} catch (ArithmeticException e) {
			System.out.println("Não é possivel fazer divisão por zero");

			// mensagem com a lista de erros
			System.out.println(e.getMessage());
			// imprime a pilha de erro da excecao
			e.printStackTrace();

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Não é possivel acessar a posição 4 do array");

		} catch (NullPointerException e) {
			System.out.println("Não foi possivel retornar o length, variavel nome não instaciada !");

		} catch (NumberFormatException e) {
			System.out.println("Não foi possivel realizar a conversão! ");
		} catch (Exception e) {
			System.out.println("Erro na execucao do programa. ");
		} finally {
			System.out.println("Sempre passa aqui! ");
		}
	}

}
