package aparelho;

public class Main {
    public static void main(String[] args) {
        Aparelho aparelho = new Aparelho();

        System.out.println("------------->");
        aparelho.selecionarMusica("Estrelinha - Di Paullo & Paulino, Marilia Mendonça");
        aparelho.tocar();
        aparelho.pausar();

        System.out.println("------------->");
        aparelho.atender();
        aparelho.iniciarCorreioVoz();
        aparelho.ligar(40028922);

        System.out.println("------------->");
        aparelho.exibirPagina();
        aparelho.atualizarPagina();
        aparelho.adicionarNovaAba();

        System.out.println("------------->");
    }
}
