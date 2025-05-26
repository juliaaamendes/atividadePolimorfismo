package fisica;

public class EspelhoConcavo extends Espelho {
    public EspelhoConcavo(String descricao) {
        super(descricao);
        this.tipo = "Espelho Côncavo";

    }

    @Override
    public void exibirTipo(){
        System.out.println("Tipo: " +tipo);
    }

    @Override
    public void comportamentoImagem(){
        System.out.println("Imagem pode ser real e invertida, ou virtual e direita, dependendo da posição do objeto.");
    }
}