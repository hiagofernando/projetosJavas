package aparelho.reprodutorMusical;

public class Reprodutor {
    protected String nome;

    public Reprodutor(String nome) {
        this.nome = nome;
    }

    public void tocar() {
        System.out.println(nome + " está tocando");
    }

    public void pausar() {
        System.out.println(nome + " pausada!");
    }

    public void selecionarMusica(String nome) {
        this.nome = nome;
        System.out.println(nome + " selecionada");
    }

    public String getNome() {
        return nome;
    }
}
