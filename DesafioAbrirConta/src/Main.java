import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        String nomeTitular = scanner.nextLine();
        double saldo = scanner.nextDouble();

        // Criar uma instância de "ContaBancaria" com os valores de entrada.
        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldo);

        System.out.println("Informacoes:");

        // Imprimir as informações da conta usando o objeto criado acima.
        System.out.println("Número da Conta: " + conta.getNumero());
        System.out.println("Nome do Titular: " + conta.getTitular());
        System.out.println("Saldo: " + conta.getSaldo());
    }
}

class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
