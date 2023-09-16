package aparelho;

import java.util.Scanner;

public class Aparelho {
    Scanner sc = new Scanner(System.in);


    public void tocar() {
        System.out.println("Ouvindo a música.");
    }

    public void pausar() {
        System.out.println("Pausando a música.");
    }

    public void selecionarMusica(String nome) {
        System.out.print("Digite o nome da musica: ");
        nome = sc.nextLine();
        sc.nextLine();
        System.out.println("Tocando:  " + nome);
    }

    public void exibirPagina() {
        System.out.println("Exibindo a página.");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando página.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }

    public void ligar(int numero) {
        System.out.print("Digite o número para ligar: ");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Ligando para " + numero);
    }

    public void atender() {
        System.out.println("Atendendo ligação.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz.");
    }
}
