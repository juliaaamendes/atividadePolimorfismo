package fisica;

public class EspelhoPlano extends Espelho {
    public EspelhoPlano(String descricao) {
        super(descricao);
        this.tipo = "Espelho Plano";
    }

    @Override
    public void exibirTipo(){
        System.out.println("Tipo: " + tipo);
    }

    @Override
    public void comportamentoImagem(){
        System.out.println("Imagem direita, do mesmo tamanho e virtual.");
    }
}