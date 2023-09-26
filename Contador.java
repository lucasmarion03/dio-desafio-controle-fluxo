import java.util.Scanner;

public class Contador {

	public static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O primeiro parâmetro é maior que o segundo parâmetro");
		}
		int contagem = parametroDois - parametroUm;
		
        for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = input.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = input.nextInt();
		input.close();
		
		try {
			contar(parametroUm, parametroDois);
		
		} catch (ParametrosInvalidosException e) {
			System.out.print(e);
		}
		
	}
	
}