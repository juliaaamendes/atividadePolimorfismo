package fisica;

public abstract class Espelho {
    protected String tipo;
    protected String descricao;

    public Espelho(String descricao){
        this.descricao = descricao;
    }

    public abstract void
    exibirTipo();
    public abstract void
    comportamentoImagem();
}