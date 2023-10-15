import java.util.Scanner;

abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
}

class CofreDigital extends Cofre {
    private int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }
}

class CofreFisico extends Cofre {
    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) { // Continue lendo enquanto houver linhas
            String tipoCofre = scanner.nextLine();

            if (tipoCofre.equalsIgnoreCase("digital")) {
                int senha;
                int confirmacaoSenha;

                try {
                    senha = Integer.parseInt(scanner.nextLine());
                    confirmacaoSenha = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Senha inválida.");
                    continue;
                }

                CofreDigital cofreDigital = new CofreDigital(senha);

                cofreDigital.imprimirInformacoes();

                if (cofreDigital.validarSenha(confirmacaoSenha)) {
                    System.out.println("Cofre aberto!");
                } else {
                    System.out.println("Senha incorreta!");
                }
            } else if (tipoCofre.equalsIgnoreCase("fisico")) {
                CofreFisico cofreFisico = new CofreFisico();
                cofreFisico.imprimirInformacoes();
            } else {
                System.out.println("Tipo de cofre não reconhecido.");
            }
        }
    }
}
