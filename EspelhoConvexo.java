package fisica;

public class EspelhoConvexo extends Espelho {
    public EspelhoConvexo(String descricao) {
        super(descricao);
        this.tipo = "Espelho Convexo";
    }

    @Override
    public void exibirTipo(){
        System.out.println("Tipo: " +tipo);
    }

    @Override
    public void comportamentoImagem(){
        System.out.println("Imagem virtual, menor e direita.");
    }
}