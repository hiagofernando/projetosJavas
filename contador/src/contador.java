import entities.ParametrosInvalidosException;
import java.util.Scanner;
public class contador {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = sc.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = sc.nextInt();
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}	

	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}
		else {
			for (int i=1; i <= contagem; i++) {
				System.out.println("Imprimindo o numero " + i);
			}
		}
	}
}